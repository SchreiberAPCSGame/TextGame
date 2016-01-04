/**
 * Write a description of class Item here.
 * 
 * @author John Chen
 * @version (a version number or a date)
 */
public class Item
{
    String name;
    String description;
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    private String getDescription1(){
        String getDesc = "";
        switch (name.toLowerCase()){
            case "force field":
                getDesc = "The force field uses a small crystal that protects you an enemy.\nBe careful, because the crystal will break after you have been attack once.";
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
            case "rope":
                getDesc = "";
            case "axe":
                getDesc = "";
            case "vortex time distorter":
                getDesc = "";
            case "harpax power stone":
                getDesc = "";
            case "ciceria portal":
                getDesc = "";
            case "nasennia hyper drive":
                getDesc = "";
            case "maximia dialator":
                getDesc = "";
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
