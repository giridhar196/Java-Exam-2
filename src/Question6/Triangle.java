package Question6;

/**
 *
 * @author Giridhar Addagalla
 */
public class Triangle extends GeometricObject {

    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private boolean isFilled;
    private String triangleColor;

    public Triangle(double firstSide, double secondSide, double thirdSide, boolean isFilled, String triangleColor) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.isFilled = isFilled;
        this.triangleColor = triangleColor;
    }

    @Override
    double perimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }

    @Override
    double area() {
        double pHAF = this.perimeter() / 2;
        return Math.sqrt(Math.abs(pHAF * (pHAF - firstSide)
                * (pHAF - secondSide) * (pHAF - thirdSide)));
    }

    @Override
    public String toString() {
        return "Triangle properties: \nArea is "
                + Math.round(this.area() * 100) / 100.0
                + "\nPerimeter is " + this.perimeter()
                + "\nThe Triangle is "
                + (isFilled ? "Filled" : "Not Filled ")
                + "\nTriangle Color is " + triangleColor;
    }

}
