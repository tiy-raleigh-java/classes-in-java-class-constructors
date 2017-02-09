import net.doughughes.testifier.exception.*;
import net.doughughes.testifier.test.TestifierTest;
import net.doughughes.testifier.util.Invoker;
import org.junit.Test;

import java.lang.*;
import java.lang.Character;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class CharacterTest extends TestifierTest {

    @Test
    public void characterShouldHaveStringNamePropertyTest(){
        /* Arrange */

        /* Act */
        Field name = null;
        try {
            name = java.lang.Character.class.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            fail("Character does not have a 'name' property.");
        }

        /* assert */
        assertThat("Character's 'name' property should be a String",
                name.getType().getSimpleName(), is("String"));

    }

    @Test
    public void characterShouldHaveStringTypePropertyTest(){
        /* Arrange */

        /* Act */
        Field type = null;
        try {
            type = Character.class.getDeclaredField("type");
        } catch (NoSuchFieldException e) {
            fail("Character does not have a 'type' property.");
        }

        /* assert */
        assertThat("Character's 'type' property should be a String",
                type.getType().getSimpleName(), is("String"));

    }

    @Test
    public void characterShouldHaveDoubleHealthPropertyTest(){
        /* Arrange */

        /* Act */
        Field health = null;
        try {
            health = Character.class.getDeclaredField("health");
        } catch (NoSuchFieldException e) {
            fail("Character does not have a 'health' property.");
        }

        /* assert */
        assertThat("Character's 'health' property should be a boolean",
                health.getType().getSimpleName(), is("double"));

    }

    @Test
    public void characterShouldHaveDoublePowerPropertyTest(){
        /* Arrange */

        /* Act */
        Field power = null;
        try {
            power = Character.class.getDeclaredField("power");
        } catch (NoSuchFieldException e) {
            fail("Character does not have a 'power' property.");
        }

        /* assert */
        assertThat("Character's 'power' property should be a double",
                power.getType().getSimpleName(), is("double"));

    }

    @Test
    public void characterShouldHaveFourArgumentConstructorTest(){
        /* Arrange */

        /* Act */

        /* Assert */
        Constructor<Character> constructor = null;
        try {
            constructor = Character.class.getDeclaredConstructor(String.class, String.class, double.class, double.class);
        } catch (NoSuchMethodException e) {
            fail("Character does not have a constructor that accepts the following four arguments: String, String, double, double.");
        }

    }

    @Test
    public void constructorShouldSetFourPropertiesTest(){
        /* Arrange */
        Character character = null;
        try {
            character = (Character) Invoker.instantiate(Character.class, "Zoe", "wizard", 100.0, 5.75);
        } catch (CannotFindConstructorException | CannotInstantiateClassException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }

        try {
            /* Act */
            String name = (String) Invoker.readProperty(character, "name");
            String type = (String) Invoker.readProperty(character, "type");
            double health = (double) Invoker.readProperty(character, "health");
            double power = (double) Invoker.readProperty(character, "power");

            /* Assert */
            assertThat("Constructor should set character's name.",
                    name, equalTo("Zoe"));
            assertThat("Constructor should set character's type.",
                    type, equalTo("wizard"));
            assertThat("Constructor should set character's health.",
                    health, equalTo(100.0));
            assertThat("Constructor should set character's power.",
                    power, equalTo(5.75));
        } catch (CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }


    }

    @Test
    public void attackMethodShouldDamageOtherCharacterTest(){
        /* Arrange */
        Character wizard = null;
        Character thief = null;
        try {
            wizard = (Character) Invoker.instantiate(Character.class, "Zoe", "wizard", 100.0, 5.75);
            thief = (Character) Invoker.instantiate(Character.class, "Fred", "thief", 50.0, 2.25);
        } catch (CannotFindConstructorException | CannotInstantiateClassException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }

        try {
            /* Act */
            Invoker.invoke(wizard, "attack", thief);
            Invoker.invoke(thief, "attack", wizard);

            double wizardHealth = (double) Invoker.readProperty(wizard, "health");
            double thiefHealth = (double) Invoker.readProperty(thief, "health");

            /* Assert */
            assertThat("The attack() method should subtract the attacking character's power from the target character's health.",
                    wizardHealth, equalTo(100-2.25));
            assertThat("The attack() method should subtract the attacking character's power from the target character's health.",
                    thiefHealth, equalTo(50-5.75));
        } catch (CannotInvokeMethodException | CannotFindMethodException | CannotAccessMethodException | CannotFindFieldException | CannotAccessFieldException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void toStringShouldDescribeCharacterTest(){
        /* Arrange */
        Character wizard = null;
        try {
            wizard = (Character) Invoker.instantiate(Character.class, "Zoe", "wizard", 100.0, 5.75);
        } catch (CannotFindConstructorException | CannotInstantiateClassException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }

        /* Act */
        String description = wizard.toString();

        /* Assert */
        assertThat("The character's toString() method is not returning the correct description.",
                description, equalTo("The wizard Zoe has 100.0 health and deals 5.75 damage on each attack."));
    }

}
