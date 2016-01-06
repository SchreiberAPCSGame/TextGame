/**
 * Write a description of class Room here.
 * 
 * @author John Chen 
 * @version (a version number or a date)
 */
public class Room
{
    public static String pathTaken = "";
    private static int x = 2;
    private static int y = 1;
    public static String name;
    public static String description;
    public static Room current;
    public static Item Item[] = new Item[100];
    public static Character character[] = new Character[100];
    public static Room room[][] = new Room[5][5];
    public Room(Item[] s, Character[] p, String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public static Room setRoom(){
        //current = room[y][x];
        return current;
    }

    public static void  goNorth(){
        if(canGo("north")){ y+=1; System.out.println(Main.currentRoom().description);
        pathTaken += "North -> ";}
        else System.out.println("You cannot go that direction");
    }

    public static void goSouth(){
        Room.canGo("south");
        pathTaken += "South -> ";
        if(y==0){}
        else{ y-=1; System.out.println(Main.currentRoom().description);}
    }

    public static void goEast(){
        canGo("east");
        pathTaken += "East -> ";
        if(x==4) {}
        else{ x+=1; System.out.println(Main.currentRoom().description);}
    }

    public static void goWest(){
        canGo("west");
        pathTaken += "West -> ";
        if(x==0) {}
        else{ x-=1; System.out.println(Main.currentRoom().description);}
    }

    public static void pathTraveled(){
        System.out.println(pathTaken.substring(0,pathTaken.length()-3));
    }

    public String getDescription(){
        return description;
    }

    private static boolean canGo(String direction){
        boolean canGoNorth = false;
        boolean canGoSouth = false;
        boolean canGoEast = false;
        boolean canGoWest = false;
        switch(setRoom().name){
            case "o00":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "o01":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o02":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o03":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "o04":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = true;
            break;
            case "o10":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = false;
            break;
            case "o11":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = false;
            canGoWest = false;
            break;
            case "o12":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = false;
            canGoWest = false;
            break;
            case "o13":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = false;
            break;
            case "o14":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = false;
            break;
            case "o20":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = false;
            break;
            case "o21":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o22":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o23":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o24":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o30":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "o31":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = true;
            break;
            case "o32":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "o33":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o34":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = false;
            break;
            case "o40":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "o41":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o42":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o43":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "o44":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = false;
            canGoWest = true;
            break;
            default: 
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = false;
            canGoWest = false;
        }
        boolean canGoSomeWhere = false;
        switch(direction.toLowerCase()){
            case "north":
            if(canGoNorth)  canGoSomeWhere = true;
            else{ System.out.println("You cannot go that direction."); canGoSomeWhere = false;}
            break;
            case "south":
            if(canGoSouth) canGoSomeWhere = true;
            else{ System.out.println("You cannot go that direction."); canGoSomeWhere = false;}
            break;
            case "west":
            if(canGoWest) canGoSomeWhere = true;
            else{ System.out.println("You cannot go that direction."); canGoSomeWhere = false;}
            break;
            case "east":
            if(canGoEast) canGoSomeWhere = true;
            else{ System.out.println("You cannot go that direction."); canGoSomeWhere = false;}
        }
        return canGoSomeWhere;
    }
    
    public static void createRooms(){
        Room o00 = new Room(Item, character, "o00", "Here lies the ultimate boss and the most important part of the time machine.");
        Room o01 = new Room(Item, character, "o01", "Big aliens are located here. It is suggested that you have strong armor and weapons equipped.");
        Room o02 = new Room(Item, character, "o02", "A wall stands in you're way. What are you going to do about it?");
        Room o03 = new Room(Item, character, "o03", "Big and mean, these aliens located here aren't friendly.");
        Room o04 = new Room(Item, character, "o04", "A sparse forest.");
        Room o10 = new Room(Item, character, "o10", "A dark cave room.");
        Room o11 = new Room(Item, character, "o11", "An indestructable cave wall");
        Room o12 = new Room(Item, character, "o12", "An impassable mountain.");
        Room o13 = new Room(Item, character, "o13", "The tar pits are a perilous place.");
        Room o14 = new Room(Item, character, "o14", "A dense jungle with danger lurking in every shadow.");
        Room o20 = new Room(Item, character, "o20", "Part a the cave entrance. This is the first step into the caves.");
        Room o21 = new Room(Item, character, "o21", "The mouth of the cave. You spawn here.");
        Room o22 = new Room(Item, character, "o22", "The jungles here contain an unexpected surprise.");
        Room o23 = new Room(Item, character, "o23", "More jungle, more unknown.");
        Room o24 = new Room(Item, character, "o24", "This is quite and explosive part of the jungle.");
        Room o30 = new Room(Item, character, "o30", "A dark cave. Who knows who/what lurks here?");
        Room o31 = new Room(Item, character, "o31", "A big cavern.");
        Room o32 = new Room(Item, character, "o32", "Jungle. Nothing but jungle, right?");
        Room o33 = new Room(Item, character, "o33", "A passable mountain. But don't be so sure that you'll make it out alive.");
        Room o34 = new Room(Item, character, "o34", "A one way coridorr.");
        Room o40 = new Room(Item, character, "o40", "Another room to the cave. Who would have thought?");
        Room o41 = new Room(Item, character, "o41", "A big pool of water.");
        Room o42 = new Room(Item, character, "o42", "More boring cave.");
        Room o43 = new Room(Item, character, "o43", "A dense jungle. Did I mention that it was dark?");
        Room o44 = new Room(Item, character, "o44", "More forest, but much more interesting than the others.");
        room[0][0] = o00;
        room[0][1] = o01;
        room[0][2] = o02;
        room[0][3] = o03;
        room[0][4] = o04;
        room[1][0] = o10;
        room[1][1] = o11;
        room[1][2] = o12;
        room[1][3] = o13;
        room[1][4] = o14;
        room[2][0] = o20;
        room[2][1] = o21;
        room[2][2] = o22;
        room[2][3] = o23;
        room[2][4] = o24;
        room[3][0] = o30;
        room[3][1] = o31;
        room[3][2] = o32;
        room[3][3] = o33;
        room[3][4] = o34;
        room[4][0] = o40;
        room[4][1] = o41;
        room[4][2] = o42;
        room[4][3] = o43;
        room[4][4] = o44;
    }
}
