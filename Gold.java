
/**
 * Sehaj Mundi
 * 3117464
 */
public class Gold extends WeaponDecorator
{
    private Weapon weapon;
    public Gold(Weapon weapon)
    {
        this.weapon = weapon;
    }
    
    public String getDescription()
    {
        return weapon.getDescription()+" Enhancement : Gold";
    }
    
    public int damage()
    {
        return weapon.damage()+1;
    }
    
    public int durability()
    {
        return weapon.durability()+2;
    }
}
