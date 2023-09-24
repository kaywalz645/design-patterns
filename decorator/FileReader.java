package decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/* program to read txt files
 * @return a line by line ArrayList of a txt file
 */
public class FileReader {
    public static ArrayList<String> getLines(String fileName) {
        ArrayList<String> lines = new ArrayList<String>();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lines.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return lines;
    }
}
