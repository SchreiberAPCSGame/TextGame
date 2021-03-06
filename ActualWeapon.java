/**
 * Write a description of class ActualWeapon here.
 * 
 * @author John Chen
 * @version (a version number or a date)
 */
public class ActualWeapon
{
    String name;
    String description;
    double damage;
    double protection;
    /**
     * Constructor for objects of class ActualWeapon
     */
    public ActualWeapon(String name, String description, double damage, double protection )
    {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.protection = protection;
    }
    
    public double getDamage(){
        return this.damage;
    }
    
    public double getProtection(){
        return this.protection;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
}
