import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class CreatureCreation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreatureCreation
{
    // instance variables - replace the example below with your own
    private Random random = new Random();
    private ArrayList<Creature> army = new ArrayList<Creature>();
    

    /**
     * Constructor for objects of class CreatureCreation
     */
    public CreatureCreation(Creature human)
    {
        // initialise instance variables
        army.add(human);
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
