package strategy;

import java.util.Random;

public class QuarterBack extends Player{

    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    public void setDefenseBehavior(){
        defenseBehavior = null;
    }

    public void setOffenseBehavior(){
    Random random = new Random();
    int randomChoice = random.nextInt(2); 

    if (randomChoice == 0) {
        offenseBehavior = new RunBehavior();
    } else {
        offenseBehavior = new PassBehavior();
    }
    }

}
