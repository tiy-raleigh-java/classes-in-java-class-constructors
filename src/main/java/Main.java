import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your character");
        String name = scan.nextLine();
        System.out.println("Enter the type of your character");
        String type = scan.nextLine();

        String AItype = "Flame Mage";

        Character player1 = new Character(name, type);


        // Create a new instance of the Character class named AI.
        Character AI = new Character( "AI", AItype);

            System.out.println(player1);

            System.out.println(AI);


        while(player1.health > 0 || AI.health > 0) {
                player1.attack(AI);
                if(player1.health <= 0){
                    System.out.println("You Lose");
                    break;
                }
                AI.attack(player1);
                if(AI.health <= 0){
                    System.out.println("You win");
                    break;
                }

        }

            // Print the player to the console.
            System.out.println(player1);
            // Print the AI to the console.
            System.out.println(AI);
    }
    }



