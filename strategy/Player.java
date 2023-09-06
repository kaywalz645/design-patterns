package strategy;
    public abstract class Player {
    /** A Player in Football Game
     * @author kaylee
     **/

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

    /** player plays in game
     * @returns "not playing" or defense or offense behavior based on PlayerType
     **/
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

    /**  changes offense or defense to the opposite 
    * @return boolean of offense 
    */
    public void turnover(){
        offense = !offense;
    }

    /**  shows names of players 
    * @return string to print 
    */
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
