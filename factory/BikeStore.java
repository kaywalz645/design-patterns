package factory;
/** intialize type of bike based on user input in driver
 * @return a new type of bike
 */
public class BikeStore {
   
    public Bike createBike(String type){
        Bike bike = null;

        if (type.equals("tricycle")){
            bike = new Tricycle();
        }else if(type.equals("strider")){
            bike = new Strider();
        }else if(type.equals("kids bike")){
            bike = new KidsBike();
        }
        return bike;
    }
}