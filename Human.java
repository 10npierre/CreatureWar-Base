
/**
 * Write a description of class Human here.
 * 
 * @author Nathan Pierre
 * @version 11/11/15
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        // initialise instance variables
        super();
        hp = 18;
        strength = 30;
    }

    public int damage()
    {
        // put your code here
        damageDone = random.nextInt(strength) + 1;
        return damageDone;
    }
}
