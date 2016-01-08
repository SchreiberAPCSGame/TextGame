
/**
 * Write a description of class Equippable here.
 * 
 * @author John Chen
 * @version (a version number or a date)
 */
public class Equippable   
{
    String name;
    String description;
    public Equippable(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String name(){
        return null;
    }
    
    public String description(){
        return null;
    }
}
