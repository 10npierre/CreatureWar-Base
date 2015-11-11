
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // initialise instance variables
        super();
    }
    
    public int damage()
    {
        // put your code here
        int damageDone;
        damageDone = random.nextInt(strength) + 1;
        return damageDone;
    }
    
}
