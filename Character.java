
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Character implements Subject
{
    private Weapon sword;
    private int health;
    private Item item;
    private ArrayList<Observer> observers;

    public Character()
    {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if(i >= 0)
        {
            observers.remove(i);
        }
    }

    public void notifyObservers()
    {
        for(int i = 0; i<observers.size(); i++)
        {
            Observer observer = (Observer)observers.get(i);
            observer.update(sword, health, item);
        }
    }

    public void updateSword(Weapon sword)
    {
        notifyObservers();
    }

    public void updateHamWeapon()
    {
        notifyObservers();
    }

    public void eatFood(Item item)
    {
        Food food;
        if(health != 10)
        {
            if(item == new Ham())
            {
                food = new Ham();
                health += food.getEnergy();
            }
            else if(item == new Bread())
            {
                food = new Bread();
                health += food.getEnergy();
            }
            else if(item == new Pizza())
            {
                food = new Pizza();
                health += food.getEnergy();
            }
        }
        else
        {
            System.out.println("");
        }
    }

    public void setCharacter(Weapon sword, int health, Item item)
    {
        this.sword = sword;
        this.health = health;
        this.item = item;
    }

    public Weapon getSword()
    {
        return sword;
    }

    public int getHealth()
    {
        return health;
    }

    public Item getItem()
    {
        return item;
    }
}
