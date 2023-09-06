package strategy;

import java.util.Random;

public class ReceiveBehavior implements OffenseBehavior{
    public String play() {
        String[] possibleActions = {"slant route", "out route", "seem route", "screen route", "hail mary"};
        Random random = new Random();
        String behavior = possibleActions[random.nextInt(possibleActions.length)];
        return "runs a " + behavior;
    }
}
