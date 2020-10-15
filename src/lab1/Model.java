package lab1;

/**
 * @author Derrick Park
 */
public class Model {
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    public Model() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     * @param canTravel
     * @param smokes
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.canTravel = canTravel;
        this.smokes = smokes;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.canTravel = true;
        this.smokes = false;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @return
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     *
     * @return
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {

        if( firstName.length() > 3 || 20 >= firstName.length()){
            System.out.println("first name and last name must be 3 to 20 characters long or else they won't be stored");
        }else{
            this.firstName = firstName;
        }

    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        if( lastName.length() > 3 || 20 > lastName.length()){
            System.out.println("first name and last name must be 3 to 20 characters long or else they won't be stored");
        }else{
            this.lastName = lastName;
        }

    }

    /**
     *
     * @param height
     */
    public void setHeight(int height) {
        if( height < 24 ||  height > 84){
            System.err.println("height must be 24 to 84 inches or it won't be stored");
            return;
        }
        this.height = height;


    }
    public void setHeight(int inches){
        this.setHeight( / TALL_INCHES);
    }

    /**
     *
     * @param canTravel
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     *
     * @param smokes
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Set the weight in pounds
     * @param pounds pounds (lb)
     */
    public void setWeight(double pounds) {
        if( weight < 80 || weight > 280  ){
            System.out.println("weight must be 80 to 280 pounds or it won't be stored\n");
        }else{
            this.weight = weight;
        }


    }

    public void setWeight(long kilograms){
        this.setWeight(weight / POUNDS_PER_KG);
    }
    /**
     * Returns the height in feet and inches
     * @return the height in feet and inches
     */
    public String getHeightInFeetAndInches() {
        int feet = height / INCHES_PER_FOOT;
        int inch = height % INCHES_PER_FOOT;
        String strHeight = feet + " feet ";

        if (inch == 0){
            return strHeight;
        }
        else if(inch == 1){
            return strHeight + inch + " inch";
        }
        else
            return strHeight + inch + " inches";
    }

    /**
     * Prints detail information about this Model
     */
    public void printDetails() {

    }

    public long getWeightKg(){
        return 0;

    }

}
