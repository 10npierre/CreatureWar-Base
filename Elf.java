
/**
 * Write a description of class Elf here.
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
    
    public Elf(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    public int magicalDamage()
    {
        // put your code here
        int percent;
        percent = random.nextInt(10) + 1;
        damageDone = random.nextInt(strength) + 1;
        if (percent == 3) {
            damageDone = strength * 2;
        }
        return damageDone;
    }
}
