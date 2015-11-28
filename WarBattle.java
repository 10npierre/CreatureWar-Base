import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class WarBattle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WarBattle
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private Random random = new Random();
    private CreatureCreation cCreation = new CreatureCreation();
    private Creature oneCurrent;
    private Creature twoCurrent;
    

    /**
     * Constructor for objects of class WarBattle
     * @param    creatureNumber    installes how many creature are being created
     */
    public WarBattle(int creatureNumber)
    {
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();
        
        for (int i = 0; i < creatureNumber; i++) {
            
            army1.add(cCreation.makeCreature());
            army2.add(cCreation.makeCreature());
        }
    }
    
    public Creature getOneCurrent() 
    {
         return oneCurrent;
    }
    
    public Creature getTwoCurrent()
    {
        return twoCurrent;
    }
    
    public void Battle()
    {
        while (army1.size() != 0 && army2.size() != 0) {
            oneCurrent = army1.get(0);
            twoCurrent = army2.get(0);
            
            twoCurrent.takeDamage(oneCurrent.damage());
            
            if (army2.size() > 1 && !twoCurrent.fallenCreature()) {
                army2.remove(twoCurrent);
                twoCurrent = army2.get(0);
            
            }
        
            oneCurrent.takeDamage(twoCurrent.damage());
            
            if (!oneCurrent.fallenCreature()) {
                army1.remove(oneCurrent);
            }
        }
        
        if (army1.size() == 0) {
            System.out.println("army1 has been defeated. army2 wins!!");
        }
        else if (army2.size() == 0) {
            System.out.println("army2 has been defeated. army1 wins!!");
        }
    }
}
