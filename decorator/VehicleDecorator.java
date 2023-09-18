package decorator;

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
                    // Replace empty space in car line with decor character
                    decoratedLine.append(decorChar);
                } else {
                    decoratedLine.append(carChar);
                }
            }
    
            carLines.set(i, decoratedLine.toString());
        }
    
        this.lines = carLines;
        }
    
    }

        

