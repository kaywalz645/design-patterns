package decorator;

import java.util.ArrayList;

public class Paint extends VehicleDecorator {

    public Paint(Vehicle vehicle, String color) {
        super(vehicle.lines);
        String[] validColors = { "red", "green", "purple", "blue", "yellow", "cyan", "none" };

        // Check if the provided color is valid
        boolean isValidColor = false;
        for (String validColor : validColors) {
            if (color.equalsIgnoreCase(validColor)) {
                isValidColor = true;
                break;
            }
        }

        if (isValidColor) {
            // Apply the chosen color to the vehicle's print
            ArrayList<String> vehicleLines = this.lines;
            for (int i = 0; i < vehicleLines.size(); i++) {
                if (!color.equalsIgnoreCase("none")) {
                    // Change the color to the first character of the chosen color
                    char[] lineChars = vehicleLines.get(i).toCharArray();
                    for (int j = 0; j < lineChars.length; j++) {
                        if (lineChars[j] != ' ') {
                            lineChars[j] = color.charAt(0);
                        }
                    }
                    vehicleLines.set(i, new String(lineChars));
                }
            }
        } else {
            // Invalid color choice, use "none" as the default color
            System.out.println("Invalid color choice. Using default color: None.");
        }
        // switch (color) {
        //     case "red":
                
        //     case "green":

        //     case "purple":

        //     case "blue":

        //     case "yellow":

        //     case "cyan":

        //     case "none":

        // }
    }
}
