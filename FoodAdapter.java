
/**
 * Sehaj Mundi
 * 3117464
 */
public class FoodAdapter extends Weapon
{
    protected Food food;
    
    public FoodAdapter(Food food)
    {
        this.food = food;
    }
    
    public String getDescription()
    {
        return food.getDescription();
    }
    
    public int damage()
    {
        return damage()+2;
    }
    
    public int durability()
    {
        return durability()+0;
    }
}

