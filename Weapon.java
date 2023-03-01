
/**
 * Sehaj Mundi
 * 3117464
 */
public abstract class Weapon implements Item
{
    protected String description = "No weapon";
    
    public String getDescription()
    {
        return description;
    }
    
    public abstract int damage();
    
    public abstract int durability();
}
