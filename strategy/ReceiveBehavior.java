package strategy;

import java.util.Random;
/** Calculates the different routes of the ReceiveBehavior
 * @return A random behavior of a Receive
 */
public class ReceiveBehavior implements OffenseBehavior{
    public String play() {
        String[] possibleActions = {"slant route", "out route", "seem route", "screen route", "hail mary"};
        Random random = new Random();
        String behavior = possibleActions[random.nextInt(possibleActions.length)];
        return "runs a " + behavior;
    }
}
