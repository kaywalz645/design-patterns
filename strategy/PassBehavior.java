package strategy;

import java.util.Random;

public class PassBehavior implements OffenseBehavior{
    public String play() {
        String[] possibleActions = {"slant route", "out route", "seem route", "screen route", "hail mary"};
        Random random = new Random();
        String behavior = possibleActions[random.nextInt(possibleActions.length)];
        return "throws a " + behavior;
    }
}
