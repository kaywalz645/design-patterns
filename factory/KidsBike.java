package factory;
/** Sets kids bikes with different variables 
 * @return a kids bike
 */
public class KidsBike extends Bike{
    public KidsBike(){
        name = "Kids Bike";
        price = 10;
        numWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }
}
