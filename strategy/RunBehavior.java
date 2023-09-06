package strategy;

import java.util.Random;

public class RunBehavior implements OffenseBehavior{
    public String play() {
        String[] possibleActions = {"drive (up the gut)", "draw", "pitch", "reverse"};
        Random random = new Random();
        String behavior = possibleActions[random.nextInt(possibleActions.length)];
        return "runs a " + behavior;
    }
}
