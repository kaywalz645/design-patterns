package decorator;

import java.util.ArrayList;
/* a class that adds color to the vehicle
 * @return a car color of the users choosing 
 */
public class Paint extends VehicleDecorator {

    public Paint(Vehicle vehicle, String color) {  
        super(vehicle.lines); 

        String[] validColors = { "red", "green", "yellow", "blue", "purple", "cyan", "none" };

        boolean isValidColor = false;
        String colorCode = "";

        switch (color.toLowerCase()) {
            case "red":
                colorCode = "\u001B[31m"; 
                isValidColor = true;
                break;
            case "green":
                colorCode = "\u001B[32m"; 
                isValidColor = true;
                break;
            case "yellow":
                colorCode = "\u001B[33m"; 
                isValidColor = true;
                break;
            case "blue":
                colorCode = "\u001B[34m"; 
                isValidColor = true;
                break;
            case "purple":
                colorCode = "\u001B[35m"; 
                isValidColor = true;
                break;
            case "cyan":
                colorCode = "\u001B[36m"; 
                isValidColor = true;
                break;
            case "none":
                colorCode = "\u001B[0m";
                isValidColor = true;
                break;
            default:
                System.out.println("Invalid color choice. Using default color: None.");
                break;
        }

    }
}