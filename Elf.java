
/**
 * An Elf that is a type of Creature and inherits from the creature object
 * 
 * @author Nathan Pierre
 * @version 11/11/15
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        super();
    }
    
    /**
     * Method that creates the Elf creature
     * @param   hitpoints   hitpoints for the Elf must be between 3-20
     * @param   stren       strength for the Elf must be between 10-15
     */
    public Elf(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    /**
     * Method that calculates the damage for the Elf
     * return  damageDone   the damage that has been done by the Elf
     */
    public int magicalDamage()
    {
        // put your code here
        int percent;
        percent = random.nextInt(10) + 1;  //10% chance statement that unables a different damage outcome
        damageDone = super.damage();
        if (percent == 3) {
            damageDone = strength * 2;
            System.out.println("WHAT A HIT!");
        }
        return damageDone;
    }
}
