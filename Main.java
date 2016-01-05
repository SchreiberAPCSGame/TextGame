import java.util.Scanner;
/**
 * This runs the program
 * 
 * @author John Chen
 * @version 1.0
 */
public class Main
{
    public int score;
    public static double health = 100;
    public static boolean godMode = false;
    public static String levelSelected;
    public static Item Item[] = new Item[100];
    public static Character character[] = new Character[100];
    public static Room room[] = new Room[25];
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        while(true){
            createItems();
            createRooms();
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
                        System.out.print('\u000C');
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
                    Room.goNorth();
                }else if(word[i+1].equalsIgnoreCase("south")){
                    Room.goSouth();
                }else if(word[i+1].equalsIgnoreCase("west")){
                    Room.goWest();
                }else if(word[i+1].equalsIgnoreCase("east")){
                    Room.goEast();
                }
                break;
                case "show_cheats":
                    System.out.println("\nHere are the different cheats you can do:\n");
                    System.out.print("c_exit\t\t   ");
                    System.out.println("c_restart\t   ");
                    System.out.print("c_god_mode\t");
                    System.out.println("c_show_health");
                    System.out.print("c_show_path_traveled");
                break;
                case "c_exit":
                    System.exit(0);
                    break;
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
            break;
        }
    }

    public static Room currentRoom(){
        Room currentRoomIn = new Room(Item, character, "", "");
        return currentRoomIn.currentRoom1();
    }

    private static void interpretTextRoom(){

    }
    
    private static void createRooms(){
        Room o00 = new Room(Item, character, "o00", "AD");
        Room o01 = new Room(Item, character, "o01", "AD");
        Room o02 = new Room(Item, character, "o02", "AD");
        Room o03 = new Room(Item, character, "o03", "AD");
        Room o04 = new Room(Item, character, "o04", "AD");
        Room o10 = new Room(Item, character, "o10", "AD");
        Room o11 = new Room(Item, character, "o11", "AD");
        Room o12 = new Room(Item, character, "o12", "AD");
        Room o13 = new Room(Item, character, "o13", "AD");
        Room o14 = new Room(Item, character, "o14", "AD");
        Room o20 = new Room(Item, character, "o20", "AD");
        Room o21 = new Room(Item, character, "o21", "AD");
        Room o22 = new Room(Item, character, "o22", "AD");
        Room o23 = new Room(Item, character, "o23", "AD");
        Room o24 = new Room(Item, character, "o24", "AD");
        Room o30 = new Room(Item, character, "o30", "AD");
        Room o31 = new Room(Item, character, "o31", "AD");
        Room o32 = new Room(Item, character, "o32", "AD");
        Room o33 = new Room(Item, character, "o33", "AD");
        Room o34 = new Room(Item, character, "o34", "AD");
        Room o40 = new Room(Item, character, "o40", "AD");
        Room o41 = new Room(Item, character, "o41", "AD");
        Room o42 = new Room(Item, character, "o42", "AD");
        Room o43 = new Room(Item, character, "o43", "AD");
        Room o44 = new Room(Item, character, "o44", "AD");
    }
    
    private static void createItems(){
        Item forceField = new Item("Force Field", "The force field uses a small crystal that protects you an enemy.\nBe careful, because the crystal will break after you have been attack once.");
        Item explosives = new Item("Explosives", "Low intensisty explosives that can used once to blow up walls");
        Item lightSaber = new Item("Lightsaber", "Plasma blade powered by a kyber crystal, also is very powerful");
        Item phaser = new Item("Phaser", "Particle light gun capable of shooting through any substance");
        Item rope = new Item("Rope", "Very long piece or rope made from the strongest coth on the planet");
        Item vortexTimeDistorter = new Item("Vortex Time Distorter", "Piece of your broken time machine! Bring back to machine site.");
        Item harpaxPowerStone = new Item("Harper Power Stone", "Piece of your broken time machine! Bring back to machine site");
        Item ciceriaPortal = new Item("Ciceria Portal", "Piece of your broken time machine! Bring back to machine site");
        Item nasenniaHyperDrive = new Item("Nasennia Hyperdrive", "Piece of your broken time machine! Bring back to machine site");
        Item maximiaDilator = new Item("Maximia Dialator", "Piece of your broken time machine! Bring back to machine site");
        Item[0] = forceField;
        Item[1] = explosives;
        Item[2] = lightSaber;
        Item[3] = phaser;
        Item[4] = rope;
        Item[5] = vortexTimeDistorter;
        Item[6] = harpaxPowerStone;
        Item[7] = nasenniaHyperDrive;
        Item[8] = maximiaDilator;
    }
}
