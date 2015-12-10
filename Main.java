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
    /**
     * Constructor for objects of class Main
     */
    public void Main()
    {
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
