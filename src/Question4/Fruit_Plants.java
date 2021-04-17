package Question4;

/**
 *
 * @author Giridhar Addagalla
 */
public class Fruit_Plants extends Plants {

    private String fruitName;

    public Fruit_Plants(String fruitName, String season, String plant_color) {
        super(season, plant_color);
        this.fruitName = fruitName;
    }

    /**
     * overriding the method toString from the parent class
     *
     * @return
     */
    @Override
    public String toString() {
        System.out.println("Inside Fruit Plants Sub class");
        return super.toString() + ", Fruit Name is " + fruitName;
    }

}
