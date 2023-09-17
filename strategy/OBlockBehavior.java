package strategy;
/** Blocks defenders
 * @return A string to print to terminal
 */
public class OBlockBehavior implements OffenseBehavior {
    public String play() {
        return "Block Defenders";
    }
}
