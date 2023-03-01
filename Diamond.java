
/**
 * Sehaj Mundi
 * 3117464
 */
public class Diamond extends WeaponDecorator
{
    private Weapon weapon;
    public Diamond(Weapon weapon)
    {
        this.weapon = weapon;
    }
    
    public String getDescription()
    {
        return weapon.getDescription()+" Enhancement : Diamond";
    }
    
    public int damage()
    {
        return weapon.damage()+2;
    }
    
    public int durability()
    {
        return weapon.durability()+2;
    }
}
