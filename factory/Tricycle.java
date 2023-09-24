package factory;
/** Sets tricycle with different variables 
 * @return a kids bike
 */
public class Tricycle extends Bike{
    public Tricycle(){
        name = "tricycle";
        price = 5;
        numWheels = 1;
        hasPedals = true;
        hasTrainingWheels = false;
    }
}
