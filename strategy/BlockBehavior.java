package strategy;

import java.util.Random;

public class BlockBehavior implements DefenseBehavior{
    public String play() {
        String[] possibleActions = {"kick", "punt", "pass", "catch"};
        Random random = new Random();
        String behavior = possibleActions[random.nextInt(possibleActions.length)];
        return "block a" + behavior;
    }
}