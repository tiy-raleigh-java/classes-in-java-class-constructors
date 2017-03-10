public class Character {

    String name;
    String type;
    double health;

    double power;
    double dodge;


    public Character(String name, String type){
        this.name = name;
        this.type = type;
       if(type.equals("Cyclops")){
           this.health = 1250;
           this.power = 70;
           this.dodge = 20.0/100.0;
       }
       if(type.equals("Dodgeball Champ")){
           this.health = 100;
           this.power = 10;
           this.dodge = 60.0/100.0;
        }
        if(type.equals("Wizard")){
            this.health = 750;
            this.power = 100;
            this.dodge = 25.0/100.0;
        }
        if(type.equals("Flame Mage")){
           this.health = 850;
           this.power = 90;
           this.dodge = 20.0/100.0;

        }

    }


    // todo: Create a method named 'attack'. This method should accept a Character that will be attacked by this character.
    public void attack(Character character){

        System.out.println(character.name +" attacks " + name);
        if (setDodge()){
            health = health;
            System.out.println(name + "dodged.");
        }
        else {
            health = health - character.power;
        }
        System.out.println(name+" health is: " + health);



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
        String status = "The " + type + " " + name + " has " +health+" health and deals "+ power+ " damage on each attack.";
        return status;
    }
}
