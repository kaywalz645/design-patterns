package strategy;
    public abstract class Player {
    
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    public Player(String firstName, String lastName, boolean offense){
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;

    }

    public abstract void setDefenseBehavior();
    public abstract void setOffenseBehavior();


    public String play(){
        
        setOffenseBehavior();
        setDefenseBehavior();

        if(offense)
        {
            if(offenseBehavior == null){
                return "not playing";
            }
            return offenseBehavior.play();
        } else {
            if(defenseBehavior == null){
                return "not playing";
            }
            return defenseBehavior.play();
        }
    }

    public void turnover(){
        offense = !offense;
    }


    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
