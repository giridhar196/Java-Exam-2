package Question4;

/**
 *
 * @author Giridhar Addagalla
 */
public class Flower_Plants extends Plants {

    private String flowerColor;
    private String flowerLifeSpan;
    private String flowerName;

    public Flower_Plants(String flowerName, String flowerColor, String flowerLifeSpan, String season, String plant_color) {
        super(season, plant_color);
        this.flowerColor = flowerColor;
        this.flowerName = flowerName;
        this.flowerLifeSpan = flowerLifeSpan;
    }

    @Override
    public String toString() {
        System.out.println("Inside the Flower Plants Child Class:");
        return super.toString() + ", Flower Name is " + flowerName + ", Flower Color is " + flowerColor + ", Flower Life Span is " + flowerLifeSpan;
    }

}
