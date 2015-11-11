import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author Nathan Pierre 
 * @version 11/11/15
 */
public class Creature
{
   public int hp;
   public int strength;
   public Random random;
   public int damageDone;
   
   public Creature(){
       hp = 10;
       strength = 10;
   }
    
   public int damage(){
       //TODO: change this
       damageDone = random.nextInt(strength)+1;
       return damageDone;
    }
    
}
