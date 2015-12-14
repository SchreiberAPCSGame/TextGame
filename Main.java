import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author John Chen and Isaac Blake 
 * @version 1.0
 */
public class Main
{
    public int score;
    public int health = 100;
    public Room location;
    public Item currentItem;
    public String tracker;
    /**
     * Constructor for objects of class Main
     */
    public void Main()
    {
<<<<<<< HEAD
        while(true){
            System.out.println("Enter your name");
            Scanner kbReader = new Scanner(System.in);
            String name = kbReader.nextLine();
            System.out.println("Please choose your level:\n\tEasy\n\tMedium\n\tHard\n\tImpossible insane\n\tCompletely Impossible");
            String level = kbReader.nextLine();
            if(level.equalsIgnoreCase("completely impossible")){
                System.out.println("You wake up in a cave alone. As you look out the entrance,\nyou see a dinosaur. It looks like a little baby.");
                System.out.println("The dinosaur pounces on you when you just stare at him.\nGame over.\n\nWould you like to restart the game (yes to restart or any other key to exit)?");
                String continueOn = kbReader.nextLine();
                if(continueOn.equalsIgnoreCase("yes")) continue;
                else System.exit(0);
            }else if(level.equalsIgnoreCase("easy")){
                health = 100;
            }else if(level.equalsIgnoreCase("medium")){
                health = 75;
            }else if(level.equalsIgnoreCase("hard")){
                health = 65;
            }else if(level.equalsIgnoreCase("impossible insane")){
                health = 50;
            }
            while(!level.equalsIgnoreCase("easy") || !level.equalsIgnoreCase("medium") || !level.equalsIgnoreCase("hard") || !level.equalsIgnoreCase("impossible insane") || !level.equalsIgnoreCase("completely impossible")){
                System.out.println("That is not a valid level. Please put in a level again.");
            }
            System.out.println("Pro tip: during any time of the game, you can type \"show_cheats\" should you ever need help.");
=======
        System.out.println("Enter your name");
        Scanner kbReader = new Scanner(System.in);
        String name = kbReader.nextLine();
        System.out.println("Please choose your level:\n\tEasy\n\tMedium\n\tHard\n\tInsane\n\tImpossible to Win");
        String level = kbReader.nextLine();
        if(level.equalsIgnoreCase("impossible insane")){
            System.out.println("You wake up in a cave alone. As you look out the entrance,\nyou see a dinosaur. It looks like a little baby.");
            System.out.println("The dinosaur pounces on you when you just stare at him.\nGame over.");
            System.exit(0);
        }else if(level.equalsIgnoreCase("medium")){
            this.health = 85;
        }else if(level.equalsIgnoreCase("hard"))
            this.health = 65;
        }else if(level.equalsIgnoreCase("insane"))
            this.health = 50;
        }else{
            while(!level.equalsIgnoreCase("easy") | !level.equalsIgnoreCase("medium") || !level.equalsIgnoreCase("hard") || !level.equalsIgnoreCase("insane") || !level.equalsIgnoreCase("impossible to win"){
                System.out.println("That is not a valid level. Please put in a level again.");
            
>>>>>>> 99340ebf9b9bdfd8aac4a55a454cc24925cada11
        }
    }

    public static void addScore(int s)
    {

    }

    public static void readCommand(String command){
        Scanner typed = new Scanner(System.in);
        String sentence = typed.nextLine();
        String[] word = sentence.trim().split(" ");
    }

    public static void currentRoom(){

    }

    private static void interpretTextRoom(){

    }
}
