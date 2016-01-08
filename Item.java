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
        return description;
    }
    
    public String getName(){
        return name;
    }
    
    public String name(){
        return name;
    }
    
    public String description(){
        return description;
    }
}
