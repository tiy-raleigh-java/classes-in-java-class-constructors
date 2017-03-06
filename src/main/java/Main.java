/**
 * In this exercise you will complete a Character class and use it in the main()
 * method below.
 * <p>
 * You should start by following the instructions in the Character class.
 */
public class Main {

    // todo: Create a main() method.
    public static void main(String[] args) {
        // todo: Create a new instance of the Character class named wizard. The instance's type should be set to 'wizard', but all other properties are up to you.
        Character wizard = new Character("Rickie", "wizard",1000, 67.5);

        // todo: Create a new instance of the Character class named orc. The instance's type should be set to 'orc', but all other properties are up to you.
        Character orc = new Character("Hugo", "orc", 1000, 34.5);
        // todo: Print the wizard to the console.
            System.out.println(wizard);
            // todo: Print the orc to the console
            System.out.println(orc);
            // todo: Have the wizard attack the orc
            wizard.attack(orc);
            // todo: Have the orc attack the wizard
            orc.attack(wizard);
            // todo: Print the wizard to the console again.
            System.out.println(wizard);
            // todo: Print the orc to the console again.
            System.out.println(orc);
    }
    }



