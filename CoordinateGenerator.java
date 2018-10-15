import java.util.Random;
public class CoordinateGenerator{
    private int minimumValue;
    private int maximumValue;
    public CoordinateGenerator(int minimumValue, int maximumValue){
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
    }
    
    public int getRandom(int minimumValue, int maximumValue){
        Random rand = new Random();
        int randomnumber = rand.nextInt(maximumValue - minimumValue) + minimumValue;
        return randomnumber;
    }
}
