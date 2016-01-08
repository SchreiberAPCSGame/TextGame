/**
 * Write a description of class Play here.
 * 
 * @author John Chen
 * @version (a version number or a date)
 */
public class Player
{
    String name;
    Item startingInventory[] = new Item[1];
    public Player(String name, Item[] startingInventory){
        this.name=name;
        startingInventory[0]=null;
    }
    
    public String getName()
    {
       return "";
    }

    public String getDescription()
    {
        return "";
    }
    
    public void attack(Character target){

    }
    
    public void equip(Equippable equipment){
    
    }
}
