import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
    public static String pictureToDisplay = "";
    public Room(Item[] s, Character[] p, String n, String d){

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

    private static Room currentRoomPrivate(){
        return roomIn[y][x];
    }

    public String getDescription(){
        return null;
    }

    private static void showPicture() {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon(pictureToDisplay);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
