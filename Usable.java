
/**
 * Write a description of class Usable here.
 * 
 * @author John Chen
 * @version (a version number or a date)
 */
public class Usable
{
    String name;
    String description;
    /**
     * Constructor for objects of class Usable
     */
    public Usable(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getDescription()
    {
        return this.description;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void use(){

    }
    
    public void use(Character target){

    }
}
