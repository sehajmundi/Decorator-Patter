
/**
 * Sehaj Mundi
 * 3117464
 */
public class Iron extends WeaponDecorator
{
    private Weapon weapon;
    public Iron(Weapon weapon)
    {
        this.weapon = weapon;
    }
    
    public String getDescription()
    {
        return weapon.getDescription()+" Enhancement : Iron";
    }
    
    public int damage()
    {
        return weapon.damage()+1;
    }
    
    public int durability()
    {
        return weapon.durability()+1;
    }
}
