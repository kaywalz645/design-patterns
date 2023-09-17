package decorator;

import java.util.ArrayList;

public class VehicleDecorator extends Vehicle{ //condiment decorator
    public VehicleDecorator(ArrayList<String> lines)
    {
        super(lines);
    }
    protected void integrateDecor(ArrayList<String> decor){
        ArrayList<String> carLines = this.lines;

        if (decor.size() == carLines.size()) {
            // Only perform decoration if the decor has more lines than the car
            int carLineIndex = 0;

            for (int i = 0; i < decor.size(); i++) {
                String decorLine = decor.get(i);
                if (carLineIndex < carLines.size()) {
                    String carLine = carLines.get(carLineIndex);
                    StringBuilder decoratedLine = new StringBuilder();

                    for (int j = 0; j < carLine.length(); j++) {
                        char carChar = carLine.charAt(j);
                        char decorChar = (i < carLines.size()) ? decorLine.charAt(j) : ' ';

                        if (carChar == ' ') {
                            // Replace empty space in car line with decor character
                            decoratedLine.append(decorChar);
                        } else {
                            decoratedLine.append(carChar);
                        }
                    }

                    carLines.set(carLineIndex, decoratedLine.toString());
                    carLineIndex++;
                }
            }
        }

        this.lines = carLines;
    
    }
}
        

