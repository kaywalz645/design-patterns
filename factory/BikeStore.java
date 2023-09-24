package factory;

public class BikeStore {
   
    public Bike createBike(String type){
        Bike bike = null;

        if (type.equals("tricycle")){
            bike = new Tricycle();
            bike.getPrice();
        }else if(type.equals("strider")){
            bike = new Strider();
        }else if(type.equals("kids bike")){
            bike = new KidsBike();
            bike.getPrice();
        }
        return bike;
    }
}