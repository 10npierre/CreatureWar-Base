import java.util.Random;

/**
 * A Demon creature that will be part of the battle
 * 
 * @author Nathan Pierre 
 * @version 11/11/15
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
   private Random random = new Random();
   
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // initialise instance variables
        super();
    }
    
    /**
     * Method that creates the Demon creature 
     * @param   hitpoints    hitpoints for the demon must be from 5-15
     * @param   stren        strength for the deomn must be from 5-25
     */
    public Demon(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    /**
     * Method that calulates the damage from the demon
     * return damageDone    damage that the creature has done
     */
    public int damage()
    {
        // put your code here
        int percent = 0;
        percent = random.nextInt(20);
        damageDone = super.damage();
        if (percent == 3) {
            damageDone = strength + 50;
            System.out.println("WHAT A HIT!");
        }
        return damageDone;
    }
}
