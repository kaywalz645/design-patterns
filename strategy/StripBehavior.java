package strategy;

/** Runs a string from play()
 * @return A string to print
 */
public class StripBehavior implements DefenseBehavior {
    public String  play() {
        return "Strip a ball from the runners hands";
    }
}
