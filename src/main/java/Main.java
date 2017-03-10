import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your character");
       String name = scan.nextLine();
        System.out.println("Enter the type of your character");
       String type = scan.nextLine();


        Character userPlayer = new Character(name, type);


        // todo: Create a new instance of the Character class named orc. The instance's type should be set to 'orc', but all other properties are up to you.
        Character AI = new Character( "Zar","Flame Mage");
        // todo: Print the wizard to the console.
            System.out.println(userPlayer);
            // todo: Print the orc to the console
            System.out.println(AI);
            // todo: Have the wizard attack the orc
            userPlayer.attack(AI);
            // todo: Have the orc attack the wizard
            AI.attack(userPlayer);
            // todo: Print the wizard to the console again.
            System.out.println(userPlayer);
            // todo: Print the orc to the console again.
            System.out.println(AI);
    }
    }



