
/**
 * A specific type of Demon which inherits from the demon object
 * 
 * @author Nathan Pierre 
 * @version 11/11/15
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
    
    /**
     * Method that creates the Balrog creature
     * @param   hitpoints    the hitpoints for the Balrog must be between 10-25
     * @param   stren        the strength for the Balrog must be between 5-20
     */
    public Balrog(int hitpoints, int stren) {
        super(hitpoints, stren);
    }
    
    /**
     * Method that calulates the damage the Balrog has done
     * return    damageDone    the damage that has been done by the creature  
     */
    public int damage()
    {
        // put your code here
        damageDone = super.damage();
        damageDone += super.damage();
        
        return damageDone;
    }
    
}
