package strategy;
/** Sacks the quarterback
 * @return A string to print in terminal
 */
public class SackBehavior implements DefenseBehavior{
    public String play() {
        return "Sack the quarterback";
    }
}
