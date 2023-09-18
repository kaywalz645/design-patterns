package decorator;

import java.util.ArrayList;

public class Paint extends VehicleDecorator {

    public Paint(Vehicle vehicle, String color) {  
        super(vehicle.lines); // Use the existing ArrayList

        String[] validColors = { "red", "green", "yellow", "blue", "purple", "cyan", "none" };

        // Check if the provided color is valid
        boolean isValidColor = false;
        String colorCode = "";

        switch (color.toLowerCase()) {
            case "red":
                colorCode = "\u001B[31m"; // Red
                isValidColor = true;
                break;
            case "green":
                colorCode = "\u001B[32m"; // Green
                isValidColor = true;
                break;
            case "yellow":
                colorCode = "\u001B[33m"; // Yellow
                isValidColor = true;
                break;
            case "blue":
                colorCode = "\u001B[34m"; // Blue
                isValidColor = true;
                break;
            case "purple":
                colorCode = "\u001B[35m"; // Purple
                isValidColor = true;
                break;
            case "cyan":
                colorCode = "\u001B[36m"; // Cyan
                isValidColor = true;
                break;
            case "none":
                colorCode = "\u001B[0m"; // Reset color to default
                isValidColor = true;
                break;
            default:
                System.out.println("Invalid color choice. Using default color: None.");
                break;
        }

    }
}