package strategy;

import java.util.Random;
/** Randomizes the different defense behaviors in lineman
 * @return A string to print in terminal
 */
public class BlockBehavior implements DefenseBehavior{
    public String play() {
        String[] possibleActions = {"kick", "punt", "pass", "catch"};
        Random random = new Random();
        String behavior = possibleActions[random.nextInt(possibleActions.length)];
        return "block a" + behavior;
    }
}