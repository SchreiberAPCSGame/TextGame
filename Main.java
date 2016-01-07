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
    public static Room room[][] = new Room[5][5];
    private static int x = 1;
    private static int y = 2;
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        while(true){
            createItems();
            Room.createRooms();
            boolean restart = true;
            System.out.println("Enter your name");
            Scanner kbReader = new Scanner(System.in);
            String name = kbReader.nextLine();
            System.out.println("\nPlease choose your level:\n\tEasy\n\tMedium\n\tHard\n\tImpossible insane\n\tCompletely Impossible\n");
            String level = kbReader.nextLine();
            boolean validLevel = false;
            while(!validLevel){
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
                    validLevel = true;
                    break;
                    case "medium":
                    health = 75;
                    levelSelected="medium";
                    validLevel = true;
                    break;
                    case "hard":
                    levelSelected="hard";
                    health = 65;
                    validLevel = true;
                    break;
                    case "impossible insane":
                    levelSelected="ii";
                    health = 50;
                    validLevel = true;
                    break;
                    default: 
                    System.out.println("That is not a valid level. Please put in a level again.");
                    String levelAgain = kbReader.nextLine();
                    break;
                }
            }
            System.out.println("\n\nYou wake up with a head ache. Looking around, you don't see anything that you're familiar with.");
            System.out.println("You are in the mouth of a cave. In the far corner, you see a broken time machine.");
            System.out.println("To the east (your right), there is a jungle. To the west (your left), there are tunnels.\n");
            System.out.println("Pro tip: during any time of the game, you can type \"show_cheats\" should you ever need help.\n");
            System.out.println("This spot is where you crashed your time machine into peices. Thinking of you present life gives you determination to find all the missing parts.");
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
                System.out.print('\u000C');
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

    public void currentRoom(int y, int x){
        
    }

    private static void interpretTextRoom(){

    }

    private static void createItems(){
        Item forceField = new Item("Force Field", "The force field uses a small crystal that protects you an enemy.\nBe careful, because the crystal will break after you have been attack once.");
        Item explosives = new Item("Explosives", "Low intensity explosives that can used once to blow up walls");
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
        Item items00[] = new Item[5];
        items00[0] = Item[6];
        Item items[] = new Item[5];
        /*Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
        Item items00[] = new Item[5];
         */
    }

    private static void createCharacters(){
        ActualCharacter tRex = new ActualCharacter("T-rex", "Fearsome and giant, the T-rex rules the jungles", 200.0, 30.0);
        ActualCharacter velociraptor = new ActualCharacter("Velociraptor", "Fast powerful, be wary of these fellows.", 35.0,20.0);
        ActualCharacter stegosaurus = new ActualCharacter("Stegosaurus", "Large and powerful, they can be pretty mean. Thank the stars that they are herbivors.", 70.0,10000.0);
        ActualCharacter pterodactyl = new ActualCharacter("Pterodactyl", "Death from above", 30.0, 10.0);
        ActualCharacter eT = new ActualCharacter("E.T", "\"E.T phone home\". Seems pretty friendly.", 10.0, 0.0);
        ActualCharacter lGM = new ActualCharacter("Little Green Men", "They are so cute with their three eyes that you'll want to hug them.", 15.0,0.0);
        ActualCharacter shadowHunter = new ActualCharacter("Shadow Hunter", "The final boss of the gam. You can bet that it's mean.", 500.0, 100.0);
    }
}
