package strategy;

import java.util.Random;
/** Creates a lineman and chooses what behavior based on offense and defense/randomization
 * @return a set offense and a random behavior for the receiver in defense 
 */
public class Lineman extends Player{

    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    
    }
    
    public void setDefenseBehavior(){
        Random random = new Random();
        int randomChoice = random.nextInt(3);
        if (randomChoice == 0) {
            defenseBehavior = new StripBehavior();
        } else if (randomChoice == 1) {
            defenseBehavior = new BlockBehavior();
        } else{
            defenseBehavior = new SackBehavior();
        }
    }

    public void setOffenseBehavior(){
        offenseBehavior = new OBlockBehavior();
    }
}
