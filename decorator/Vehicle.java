package decorator;
/* class to define the basic properties of the class vehicle 
 * @return the txt doc of a car
 */
import java.util.ArrayList;
public abstract class Vehicle { //beverage
    protected ArrayList<String> lines;

    public Vehicle (ArrayList<String> lines){
        this.lines = lines;
    }

@Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (String line :lines) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
