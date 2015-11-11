
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
    }
    
    public Human(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    public int damage()
    {
        // put your code here
        damageDone = random.nextInt(strength) + 1;
        return damageDone;
    }
}
