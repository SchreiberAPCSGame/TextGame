
/**
 * Write a description of class Room here.
 * 
 * @author John Chen 
 * @version (a version number or a date)
 */
public class Room
{
    public static  String pathTaken = "";
    /**public Room(Items[] s, Character[] p, String n, String d){
        in[][] roomIn = new int[5][5];
    }*/  
    
    public static Room goNorth(){
        pathTaken += "North -> ";
        return null;
    }
    
    public static Room goSouth(){
        pathTaken += "South -> ";
        return null;
    }
    
    public static Room goEast(){
        pathTaken += "East -> ";
        System.out.println(pathTaken);
        return null;
    }
    
    public static Room goWest(){
        pathTaken += "West -> ";
        return null;
    }
    
    public static void pathTraveled(){
        System.out.println(pathTaken.substring(0,pathTaken.length()-3));
    }
    
    public String getDescription(){
        String r11 = "This is where you you woke and discovered that your time machine was broken.\n There are two possible ways to go; to the jungle or into the caves.";
        String r12 = "";
        return r11;
    }
}
