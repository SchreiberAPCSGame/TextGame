/**
 * Write a description of class Character here.
 * 
 * @author John Chen 
 * @version (a version number or a date)
 */
public class ActualCharacter
{
    String name;
    String description;
    double health;
    public ActualCharacter(String name, String description, double health){
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String getName()
    {
        return this.name;
    }
    
    public String talk(String dialogue){
        return "Hello, there";
    }
    
    public String name(){
        return null;
    }
    
    public String description(){
        return this.description;
    }
    
    public double getHealth(){
        return this.health;
    }
    
    public Item inventory(){
        return null;
    }
}