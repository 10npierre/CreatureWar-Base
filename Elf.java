
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

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int damageDone()
    {
        // put your code here
        damageDone = random.nextInt(strength) + 1;
        return damageDone;
    }
}