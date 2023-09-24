package decorator;
/* a class that decorates the vehicle with a nice smile
 * @return the txt doc with a smile on the car
 */
public class Smile extends VehicleDecorator{
    public Smile(Vehicle vehicle){
        super(vehicle.lines); 
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
    }
}
