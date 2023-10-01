package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game() {

    }

    public static Game getInstance() {
        if (game == null) {
            System.out.println("New Game");
            game = new Game();
        }
        return game;
    }

    public String getQuestion() {
        anagrams = new HashMap<>();
        rand = new Random();

        if (score < 3) {
            level = Difficulty.EASY;
        } else if (score > 3) {
            level = Difficulty.MEDIUM;
        } else if (score > 6) {
            level = Difficulty.HARD;
        }

        for (Difficulty difficulty : Difficulty.values()) {
            ArrayList<Anagram> anagramList = FileReader.getAnagrams(difficulty);
            anagrams.put(difficulty, anagramList);
        }

        ArrayList<Anagram> anagramL = anagrams.get(level);

        if (anagramL != null && !anagramL.isEmpty()) {
            currentAnagram = anagramL.get(rand.nextInt(anagramL.size()));
            return currentAnagram.getQuestion();
        } else {
            return "No anagrams available for this difficulty.";
        }

    }

    public boolean isCorrect(String userAnswer) {
        if (currentAnagram != null) {
            boolean correctOrNot = currentAnagram.isCorrect(userAnswer);
            if (correctOrNot){
                score += 1;
            }else{
                score -= 1;
            }
            return correctOrNot;
        }
        return false;
    }

    public int getScore() {
        return score;
    }
}
