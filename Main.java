import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class Main here.
 * 
 * @author John Chen and Isaac Blake 
 * @version 1.0
 */
public class Main
{
    public int score;
    public static int numCheats;
    public static double health = 100;
    public static boolean godMode = false;
    public static String levelSelected;
    /**
     * Constructor for objects of class Main
     */
    public void Main()
    {
        while(true){
            boolean restart = true;
            System.out.println("Enter your name");
            Scanner kbReader = new Scanner(System.in);
            String name = kbReader.nextLine();
            System.out.println("\nPlease choose your level:\n\tEasy\n\tMedium\n\tHard\n\tImpossible insane\n\tCompletely Impossible\n");
            String level = kbReader.nextLine();
            switch (level.toLowerCase()){
                case "completely impossible":
                System.out.println("\n\nYou wake up in a cave alone. As you look out the entrance,\nyou see a dinosaur. It looks like a little baby.");
                System.out.println("The dinosaur pounces on you when you just stare at him.\nGame over.\n\nWould you like to restart the game (yes to restart or any other key to exit)?");
                String continueOn = kbReader.nextLine();
                if(continueOn.equalsIgnoreCase("yes")) continue;
                else System.exit(0);
                break;
                case "easy":
                health = 100;
                levelSelected="easy";
                break;
                case "medium":
                health = 75;
                levelSelected="medium";
                break;
                case "hard":
                levelSelected="hard";
                health = 65;
                break;
                case "impossible insane":
                levelSelected="ii";
                health = 50;
                break;
                default: 
                System.out.println("That is not a valid level. Please put in a level again.");
                String levelAgain = kbReader.nextLine();
                break;
            }
            System.out.println("\n\nYou wake up with a head ache. Looking around, you don't see anything that you're familiar with.");
            System.out.println("You are in the mouth of a cave. In the far corner, you see a broken time machine.");
            System.out.println("To the east (your right), there is a jungle. To the west (your left), there are tunnels.\n");
            System.out.println("Pro tip: during any time of the game, you can type \"show_cheats\" should you ever need help.\n");
            while(restart){
                String response = kbReader.nextLine();
                if(response.equalsIgnoreCase("c_restart")){
                    System.out.println("Are you sure that you want to restart (yes to restart or any other key to cancel).");
                    String continueOn = kbReader.nextLine();
                    if(continueOn.equalsIgnoreCase("yes")) {
                        restart = false;
                    }
                }
                readCommand(response);
            }
        }
    }

    public void addScore(int s)
    {
        score+=5;
    }

    public static void readCommand(String command){
        String[] word = command.toLowerCase().trim().split(" ");
        for(int i =0; i<word.length; i++){
            switch (word[i].toLowerCase()){
                case "go":
                case "walk":
                case "run":
                case "moonwalk":
                case "skip":
                if(word[i+1].equalsIgnoreCase("north")){
                    System.out.println(Room.goNorth());
                }else if(word[i+1].equalsIgnoreCase("south")){
                    System.out.println(Room.goSouth());
                }else if(word[i+1].equalsIgnoreCase("west")){
                    System.out.println(Room.goWest());
                }else if(word[i+1].equalsIgnoreCase("east")){
                    System.out.println(Room.goEast());
                }
                break;
                case "show_cheats":
                    System.out.println("\nHere are the different cheats you can do:\n");
                    System.out.print("c_items\t\t");
                    System.out.print("c_telport\t   ");
                    System.out.println("c_show_room");
                    System.out.print("c_show_hint\t");
                    System.out.print("c_exit\t\t   ");
                    System.out.println("c_restart\t   ");
                    System.out.print("c_god_mode\t");
                    System.out.println("c_show_health");
                    System.out.print("c_show_map\t");
                    System.out.print("c_show_path_traveled");
                break;
                case "c_items":

                case "c_teleport":

                case "c_show_room":

                case "c_show_hint":

                case "c_exit":
                    System.exit(0);
                case "c_god_mode":
                    if(godMode){
                        if(levelSelected.equals("easy")) health = 100;
                        else if(levelSelected.equals("medium")) health = 75;
                        else if(levelSelected.equals("hard")) health = 65;
                        else health = 50;
                        godMode = false;
                        System.out.println("God mode disabled (Type \"c_god_mode\" to re-enable god mode)");
                    }else{
                    health = Double.POSITIVE_INFINITY;
                    System.out.println("God mode enabled (Type \"c_god_mode\" to turn god mode off)");
                    numCheats+=1;
                    godMode = true;
                }
                    break;
                case "c_show_health":
                    if(godMode){
                    System.out.println(health);
                }else{
                    System.out.println((int)health);
                }
                    break;
                case "c_show_path_traveled":
                    Room.pathTraveled();
            }
        }
    }

    public static Room currentRoom(){
        return null;
    }

    private static void interpretTextRoom(){

    }
}
