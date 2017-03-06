/**
 * The Character class represents a character in a video game. Characters have
 * names, character types (such as wizard, orc, thief, spy, etc), health, and
 * power. Power is the amount of damage a character deals when they attack
 * another Character.
 * <p>
 * Your job is to add these four properties to this class, along with a
 * constructor to setup the Character's initial state. You will also need to add
 * an attack() method so that a Character may attack and deal damage to another
 * character. Finally, you will override the toString() method so that object
 * can describe itself.
 * <p>
 * Follow the instructions in the to-do items listed below.
 */
public class Character {

    // todo: Create a property to hold the character's name
    String name;
    // todo: Create a property to hold the character's type. This will be free-form text.
    String type;
    // todo: create a property to hold the character's health. This should be a double value.
    double health;
    // todo: Create a property to hold the character's power. This should be a double value.
    double power;
    // todo: Create a constructor that accepts and sets the default values for the name, type, health, and power properties. Note that the order specified is required for tests to pass.
    public Character(String name, String type, double health, double power){
        this.name = name;
        this.type = type;
        this.health = health;
        this.power = power;
    }
    // todo: Create a method named 'attack'. This method should accept a Character that will be attacked by this character.
    public void attack(Character player1, Character player2){
    

        player1 = new Character(this.name,this.type,this.health,this.power);
        player2 = new Character(player2.name,player2.type,player2.health,player2.power);
        System.out.println(player1.name +" attacks " +player2.name);
        player2.health = player2.health - player1.power;
        System.out.println(player2.name+" health is: " +player2.health);



    }
        // todo: Update the character that was passed into the attack() method by decreasing its health by this character's power.
        /*
            As an example for this to-do, imagine this character is a wizard
            with a power of 10.25. If it attacks an orc with a health of 70,
            then the orc's health will need to be set to 59.75 (70 - 10.25).
         */


    // todo: Override the default toString() method. This method should return a String that reads "The <type> <name> has <health> health and deals <power> damage on each attack."
    /*
        As an example for this to-do, a wizard named Lisa with health of 100 and
        power of 23 would output "The wizard Lisa has 100.0 health and deals 23
        damage on each attack."
     */
    public String toString(){
        String status = "The "+ type+ " "+name+" has " +health+" health and deals "+ power+ " damage on each attack";
        return status;
    }
}
