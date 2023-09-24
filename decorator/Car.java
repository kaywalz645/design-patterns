package decorator;
/* Intializes the car.txt file by using Vehicle
 * @return the lines of car.txt
 */
public class Car extends Vehicle{
    public Car(){
         super(FileReader.getLines("decorator/txt/car.txt"));
    }
}
