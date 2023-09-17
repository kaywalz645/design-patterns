package golf;

public class HoleScoreDisplay implements Observer{
    Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        
    }

    public String toString(){
        int difference = strokes - par;
        String comparison = (difference < 0) ? "Under Par" : (difference > 0) ? "Over Par" : "Even Par";
        return "Current Hole Stats: Par ("+par+") Strokes ("+strokes+"), " + comparison;
    }
}
