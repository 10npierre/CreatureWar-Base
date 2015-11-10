import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int hp;
   private int strength;
   private Random random;
   
   public Creature(){
       hp = 10;
       strength = 10;
   }
    
   public int damage(){
       //TODO: change this
       int damageDone;
       damageDone = random.nextInt(strength)+1;
       return damageDone;
    }
    
}
