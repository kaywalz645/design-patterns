package decorator;
/* a class that decorates the vehicle with some cool rims 
 * @return the txt doc with the rims on the car
 */
public class Rims extends VehicleDecorator{
    public Rims(Vehicle vehicle){
        super(vehicle.lines); 
        integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
    }
}
