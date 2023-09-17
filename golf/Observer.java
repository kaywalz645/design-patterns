package golf;

public interface Observer {
    public void update(int strokes, int par){
        this.strokes = strokes;
        this.par = par;
    }

    public String toString(){
        
    }
}
