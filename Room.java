/**
 * Write a description of class Room here.
 * 
 * @author John Chen 
 * @version (a version number or a date)
 */
public class Room
{
    public static  String pathTaken = "";
    public static Room[][] roomIn = new Room[5][5];
    public static int x = 2;
    public static int y = 1;
    public static String name = "00";
    public static String description;
    public static Room current;
    public Room(Item[] s, Character[] p, String n, String d){
        this.name = name;
        this.description = description;
    }
    
    public Room currentRoom1(){
        this.current = roomIn[y][x];
        return current;
    }

    public static Room goNorth(){
        Room.canGo("north");
        pathTaken += "North -> ";
        y+=1;
        return roomIn[y][x];
    }

    public static Room goSouth(){
        pathTaken += "South -> ";
        y-=1;
        return roomIn[y][x];
    }

    public static Room goEast(){
        pathTaken += "East -> ";
        x+=1;
        return roomIn[y][x];
    }

    public static Room goWest(){
        pathTaken += "West -> ";
        x-=1;
        return roomIn[y][x];
    }

    public static void pathTraveled(){
        System.out.println(pathTaken.substring(0,pathTaken.length()-3));
    }

    public String getDescription(){
        return null;
    }

    private static String canGo(String direction){
        boolean canGoNorth = false;
        boolean canGoSouth = false;
        boolean canGoEast = false;
        boolean canGoWest = false;
        switch(name){
            case "00":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "01":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "02":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "03":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "04":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = true;
            break;
            case "10":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = false;
            break;
            case "11":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = false;
            canGoWest = false;
            break;
            case "12":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = false;
            canGoWest = false;
            break;
            case "13":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = false;
            break;
            case "14":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = false;
            break;
            case "20":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = false;
            break;
            case "21":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "22":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = true;
            break;
            case "23":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = true;
            break;
            case "24":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "30":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "31":
            canGoNorth = false;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = true;
            break;
            case "32":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "33":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = true;
            canGoWest = true;
            break;
            case "34":
            canGoNorth = true;
            canGoSouth = true;
            canGoEast = false;
            canGoWest = false;
            break;
            case "40":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "41":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "42":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "43":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = true;
            break;
            case "44":
            canGoNorth = true;
            canGoSouth = false;
            canGoEast = false;
            canGoWest = true;
            break;
        }
        String something = "";
        switch(direction.toLowerCase()){
            case "north":
            if(canGoNorth) return "";
            else something = "You cannot go that direction.";
            case "south":
            if(canGoSouth) return "";
            else something = "You cannot go that direction.";
            case "west":
            if(canGoWest) return "";
            else something = "You cannot go that direction.";
            case "east":
            if(canGoEast) return "";
            else something= "You cannot go that direction.";
        }
        return something;
    }
}
