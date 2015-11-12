
/**
 * A humnan that inherits from the creature object
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
    
    /**
     * Method that creates a human creature 
     * @param  hitpoints   hitpoints for the human must be from 5-18
     * @param  stren       strength for the human must be from 5-30
     */
    public Human(int hitpoints, int stren) {
        super(hitpoints, stren);
        
        //lets the user know if there within the boundry specifies or not
        if (hitpoints < 5 || hitpoints > 18 || stren < 5 || stren > 30) {
            System.out.println("The number/numbers you typed in are not within the boundry");
            throw new IllegalArgumentException();
        }  
   }
   
    /**
     * A method which calculates how much damage has been done
     * return damageDone    the damage thats been done to an opponent
     */
   public int damage()
    {
        // put your code here
        damageDone = super.damage();
        return damageDone;
    }
}
