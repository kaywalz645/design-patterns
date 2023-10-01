package singleton;

import java.util.ArrayList;

public class Anagram {
    private String question;
    private ArrayList<String> answers;

    public Anagram(String question, ArrayList<String> answers){
        this.question = question;
        this.answers = answers;
    }
    public String getQuestion(){
        return this.question;
        //call a new anagram with filereader 
    }
    public boolean isCorrect(String userAnswer){
        //check if the users answer is correct using the filereader
        return this.answers.contains(userAnswer);
    }
}
