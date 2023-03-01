
/**
 * Sehaj Mundi
 * 3117464
 */
public class Achievements implements Observer, DisplayItems
{
    private Weapon currentEnchancement;
    private Item currentItem;
    private Character player;
    public Achievements(Character player) 
    {
        this.player = player;
        Character.registerObserver(this);
    } 

    public void update(Weapon sword, int health, Item item)
    {
        currentItem = item;
        display();
    }

    public void display()
    {
        if(player.getHealth()==10)
        {
            System.out.println("*** Achiievement unlocked: Hearty! ***");
        }
        else if(currentItem.getDescription().equals("Pizza"))
        {
            System.out.println("*** Achiievement unlocked: 'Za Bomb! ***");
        }
        else if(currentEnchancement == new Magic(currentEnchancement))
        {
            System.out.println("*** Achiievement unlocked: Abracadabra ***");
        }
    }
}
