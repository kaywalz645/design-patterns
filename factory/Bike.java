package factory;
/** Sets bike with parameters and sets behaviors
 * @return type of bike and its features
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public String assembleBike(){
        String assembling = createFrame() + "\n";
        assembling += addWheels() + " wheel(s) \n";

        if (hasPedals) {
            assembling += addPedals() + "\n";
        }else{
            assembling += "Removing pedals";
        }
        if (hasTrainingWheels) {
            assembling += "Adding Training Wheels\n";
        }

        return assembling;
    }
    private String createFrame(){
        return "Assembling " +name+ " frame:";
    }
    private String addWheels(){
    return "Adding " +numWheels;
    }
    private String addPedals(){
    return "Adding Pedals";
    }
    public double getPrice(){
        return price;
    }


}
