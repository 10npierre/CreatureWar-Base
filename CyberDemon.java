
/**
 * A type of Creature which inherits from the Demon object
 * 
 * @author Nathan Pierre 
 * @version 11/11/15
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        // initialise instance variables
        super();
    }
    
    /**
     * Method that creates the CyberDemon
     * @param   hitpoints   the hitponts for the CyberDemon must be between 5-13
     * @param   stren       the strength for the CyberDemon must be between 5-28
     */
    public CyberDemon(int hitpoints, int stren) {
        super(hitpoints, stren);
        
         if (hitpoints < 5 || hitpoints > 13 || stren < 5 || stren > 28) {
             System.out.println("The number/numbers you typed in are not within the boundries");
             throw new IllegalArgumentException();
         }
    }
    
    /**
     * Method that calculates the damage from the CyberDemon
     * return damageDone   the damage that the creature has done
     */
    public int damage()
    {
        // put your code here
        damageDone = super.damage();
        return damageDone;
    }
}
