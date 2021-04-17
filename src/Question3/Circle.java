package Question3;

/**
 *
 * @author Giridhar Addagalla
 */
public class Circle {

    private double radius;
    private boolean in_Circle;
    private boolean ex_Circle;

    public Circle(double radius, boolean in_Circle, boolean ex_Circle) {
        this.radius = radius;
        this.in_Circle = in_Circle;
        this.ex_Circle = ex_Circle;
    }

    @Override
    public String toString() {
        return "Circle: \n" + "Radius Of Circle: " + radius + ", In Circle: " + in_Circle + ", Ex Circle: " + ex_Circle;
    }

}
