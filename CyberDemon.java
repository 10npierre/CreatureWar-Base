
/**
 * Write a description of class CyberDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public CyberDemon(int hitpoints, int stren) {
        super(hitpoints, stren);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int damage()
    {
        // put your code here
        damageDone = random.nextInt(strength) + 1;
        return damageDone;
    }
}
