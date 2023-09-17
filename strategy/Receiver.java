package strategy;

/** Sets object with parameters and sets behaviors
 * @return a null defense and a behavior for the receiver in offense
 */
public class Receiver extends Player {

    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }
    public void setDefenseBehavior(){
        defenseBehavior = null;
    }
    public void setOffenseBehavior(){
        offenseBehavior = new ReceiveBehavior();
    }
    
}
