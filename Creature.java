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
   public Random random = new Random();
   public int damageDone;
   
   /**
    * Method which creates a creature and defaults the hp and strength
    */
   public Creature(){
       hp = 10;
       strength = 10;
    }
   
    /**
     * Creates a creature
     * @param   hp    the creatures hitpoints
     * @param   strength    the creatures strength
     */
   public Creature(int hitpoints, int strength) {
       hp = hitpoints;
       this.strength = strength;
    }
   
   /**
    * A method which calulates the damage
    * return   damageDone    the damage that has been done
    */
   public int damage(){
       damageDone = random.nextInt(strength) + 1;
       return damageDone;
    }
    
   public void takeDamage(int attackDamage)
   {
       hp = hp - attackDamage;
   }
   
   public boolean fallenCreature()
   {
       boolean alive = true;
       
       if (hp <= 0) {
           alive = false;
        }
       return alive;
   }
    
} 