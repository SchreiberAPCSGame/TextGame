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
    public int health;
    public Room location;
    public Item currentItem;
    /**
     * Constructor for objects of class Main
     */
    public void Main()
    {
        System.out.println("Enter your name");
        Scanner kbReader = new Scanner(System.in);
        String name = kbReader.nextLine();
        System.out.println("Please choose your level:\nEasy\nImpossible insane");
        String level = kbReader.nextLine();
        if(level.equalsIgnoreCase("impossible insane")){
            System.out.println("You wake up in a cave alone. As you look out the entrance,\nyou see a dinosaur. It looks like a little baby.");
            System.out.println("The dinosaur pounces on you when you just stare at him.\nGame over.");
            System.exit(0);
        }else if(!level.equalsIgnoreCase("easy")){
            while(!level.equalsIgnoreCase("easy")){
                System.out.println("That is not a valid level. Please put in a level again.");
            }
        }else{
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
    
    public static currentRoom(){
        return
    }
    
    private static void interpretTextRoom(){
        
    }
}
