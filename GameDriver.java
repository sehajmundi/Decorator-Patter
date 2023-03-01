
/**
 * Sehaj Mundi
 * 3117464
 */
import java.util.*;
import javax.swing.*;
public class GameDriver
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        ArrayList<Weapon> weapon = new ArrayList<Weapon>();
        Character player = new Character();
        HUD hud = new HUD(player);
        JOptionPane j = new JOptionPane();
        Achievements achievements = new Achievements(player);
        System.out.println("*** <Eat and Survive> ***");
        int result = JOptionPane.showConfirmDialog(null, player.getSword()+ ": pick up?", null, JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            player.updateSword(new Sword());                        
            Weapon playerSword = player.getSword();
        }
        else{System.out.println("End of game");}
    }
}
