package golf;

public class RoundScoreDisplay implements Observer{
    Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        parTotal += par;
        strokesTotal += strokes;
    }

    public String toString(){
        int difference = strokesTotal - parTotal;
        String comparison = (difference < 0) ? "Under Par" : (difference > 0) ? "Over Par" : "Even Par";
        return "Overall Stats: Par ("+parTotal+") Strokes ("+strokesTotal+"), " +comparison ;
    }
}
