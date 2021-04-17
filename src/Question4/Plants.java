package Question4;

/**
 *
 * @author Giridhar Addagalla
 */
public class Plants {

    private String season;
    private String plant_color;

    public Plants(String season, String color) {
        this.season = season;
        this.plant_color = color;
    }

    @Override
    public String toString() {
        System.out.println("Inside parent plant class toString() method.");
        return season + " Season plant " + ", Plant color is " + plant_color;
    }

}
