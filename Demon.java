
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
    
    /**
     * Method that creates the Demon creature 
     * @param   hitpoints    hitpoints for the demon must be from 5-15
     * @param   stren        strength for the deomn must be from 5-25
     */
    public Demon(int hitpoints, int stren) {
        super(hitpoints, stren);
        
        if (hitpoints < 5 || hitpoints > 15 || stren < 5 || stren > 25) {
            System.out.println("The number/numbers you typed in are not within the boundries");
            throw new IllegalArgumentException();
        }
    }
    
    /**
     * Method that calulates the damage from the demon
     * return damageDone    damage that the creature has done
     */
    public int damage()
    {
        // put your code here
        int percent;
        percent = random.nextInt(20) + 1;  //statement that creates a 5% chance of a certain outcome for the damage
        damageDone = super.damage();
        if (percent == 3) {
            damageDone = strength + 50;
            System.out.println("WHAT A HIT!");
        }
        return damageDone;
    }
}
