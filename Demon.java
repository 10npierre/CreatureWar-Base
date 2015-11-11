
/**
 * A Demon creature that will be part of the battle
 * 
 * @author Nathan Pierre 
 * @version 11/11/15
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // initialise instance variables
        super();
    }
    
    public Demon(int hitpoints, int stren) {
        super(hitpoints, stren);
    }

    public int damage()
    {
        // put your code here
        int percent;
        percent = random.nextInt(5) + 1;
        damageDone = random.nextInt(strength) + 1;
        if (percent == 3) {
            damageDone = strength + 50;
        }
        return damageDone;
    }
}
