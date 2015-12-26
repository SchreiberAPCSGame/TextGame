/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description)
    {
        
    }
    
    public String getDescription(String name){
        String getDesc = "";
        switch (name.toLowerCase()){
            case "force field":
                getDesc = "";
                break;
            case "explosives":
                getDesc = "";
                break;
            case "lightsaber":
                getDesc = "";
                break;
            case "phaser":
                getDesc = "";
                break;
            case "bicycle":
                getDesc = "";
                break;
            default:
                getDesc = "";
                break;
        }
        return getDesc;
    }
    
    public String getName(){
        return "";
    }
    
    public String name(){
        return "";
    }
    
    public String description(){
        return "";
    }
}
