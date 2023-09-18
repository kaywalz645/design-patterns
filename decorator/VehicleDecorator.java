package decorator;
/* class to add some special decorations to our car / intergrated different features
 * into our car using ArrayLists and replacing characters in our original car
 * @return a cool car
 */
import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle{ //condiment decorator
    public VehicleDecorator(ArrayList<String> lines)
    {
        super(lines);
    }
    protected void integrateDecor(ArrayList<String> decor){
        ArrayList<String> carLines = this.lines;

        for (int i = 0; i < carLines.size(); i++) {
            String carLine = carLines.get(i);
            String decorLine = decor.get(i); // Assuming decor has the same number of lines
    
            StringBuilder decoratedLine = new StringBuilder();
    
            for (int j = 0; j < carLine.length(); j++) {
                char carChar = carLine.charAt(j);
                char decorChar = decorLine.charAt(j);
    
                if (carChar == ' ') {
                    decoratedLine.append(decorChar);
                } 
                else
                {
                    decoratedLine.append(carChar);
                }
            }System.out.println("");
    
            carLines.set(i, decoratedLine.toString());
        }
    
        this.lines = carLines;
        }
    
    }

        

