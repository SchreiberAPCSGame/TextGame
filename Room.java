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
    public static String name;
    public static String description;
    public Room(Item[] s, Character[] p, String n, String d){
        this.name = name;
        this.description = description;
    }

    public static Room goNorth(){
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

    private String canGo(Room y, String direction){
        boolean canGoNorth = false;
        boolean canGoSouth = false;
        boolean canGoEast = false;
        boolean canGoWest = false;
        switch(Room.name){
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
            canGoWest = false;
            break;
            case "02":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "03":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "04":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "05":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "10":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "11":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "12":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "13":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "14":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "15":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "20":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "21":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "22":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "23":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "24":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "25":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "30":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "31":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "32":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "33":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "34":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "35":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "40":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "41":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "42":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "43":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "44":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "45":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "50":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "51":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "52":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "53":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "54":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
            break;
            case "55":
            canGoNorth = false;
            canGoSouth = false;
            canGoEast = true;
            canGoWest = false;
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
