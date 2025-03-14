package golf;

import java.util.ArrayList;

public class Golfer implements Subject
{
    private String name;
    ArrayList<Observer> observers;

    public Golfer(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void  notifyObservers(int strokes, int par){
        for(Observer observer : observers) {
           observer.update(strokes, par);
        }
    }

    public void enterScore(int strokes, int par){
        notifyObservers(strokes, par);

    }

    public String getName(){
        return name;
    }
}
