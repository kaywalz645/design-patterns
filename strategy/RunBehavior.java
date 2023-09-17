package strategy;

import java.util.Random;
/** Randomizes and picks one string of the RunBehavior
 * @return A string and a the randomized behavior to print
 */
public class RunBehavior implements OffenseBehavior{
    public String play() {
        String[] possibleActions = {"drive (up the gut)", "draw", "pitch", "reverse"};
        Random random = new Random();
        String behavior = possibleActions[random.nextInt(possibleActions.length)];
        return "runs a " + behavior;
    }
}
