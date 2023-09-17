package decorator;

import java.util.ArrayList;

public abstract class Vehicle { //beverage
    protected ArrayList<String> lines;

    public Vehicle (ArrayList<String> lines){
        this.lines = lines;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : lines) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
