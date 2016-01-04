/**
 * Write a description of class Character here.
 * 
 * @author John Chen 
 * @version (a version number or a date)
 */
public class Character
{
    String name;
    String description;
    public Character(String name, String description, Item[] inventory){
        this.name = name;
        this.description = description;
    }
    
    public String getDescription()
    {
        return "";
    }

    public String getName()
    {
        return "";
    }
    
    public String talk(String dialogue){
        return null;
    }
    
    public String name(){
        return null;
    }
    
    public String description(){
        return null;
    }
    
    public Item inventory(){
        return null;
    }
}
