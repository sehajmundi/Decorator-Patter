
/**
 * Sehaj Mundi
 * 3117464
 */
public abstract class Food implements Item
{
    protected String description = "Unknown food item";
    protected int energy = 0;
    
    public String getDescription()
    {
        return description;
    }
    
    public int getEnergy()
    {
        return energy;
    }
}
