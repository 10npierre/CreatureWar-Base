
/**
 * Write a description of class CyperDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyperDemon extends Demon
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class CyperDemon
     */
    public CyperDemon()
    {
        // initialise instance variables
        super();
    }

    public int damage()
    {
        // put your code here
        damageDone = random.nextInt(strength) + 1;
        return damageDone;
    }
}
