
/**
 * Sehaj Mundi
 * 3117464
 */
public class HUD implements Observer, DisplayItems
{
    private Character player;
    
    public HUD(Character player)
    {
        this.player = player;
        Character.registerObserver(this);
    }
    
    public void update(Weapon sword, int health, Item item)
    {
        display();
    }
    
    public void display()
    {
        System.out.println(Character.getSword());
        System.out.println(Character.getHealth());
        System.out.println(Character.getItem());
    }
}
