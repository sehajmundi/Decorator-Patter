
/**
 * Sehaj Mundi
 * 3117464
 */
public class Magic extends WeaponDecorator
{
    private Weapon weapon;
    public Magic(Weapon weapon)
    {
        this.weapon = weapon;
    }
    
    public String getDescription()
    {
        return weapon.getDescription()+" Enhancement : Magic";
    }
    
    public int damage()
    {
        return weapon.damage()+3;
    }
    
    public int durability()
    {
        return weapon.durability()+3;
    }
}
