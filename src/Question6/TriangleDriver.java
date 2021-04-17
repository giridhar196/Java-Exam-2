package Question6;

import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        double firstSide = 0, secondSide = 0, thirdSide = 0;
        do {
            flag = false;
            System.out.print("Enter First Side of triangle: ");
            firstSide = scan.nextDouble();
            System.out.print("Enter Second Side of triangle: ");
            secondSide = scan.nextDouble();
            System.out.print("Enter Third Side of triangle: ");
            thirdSide = scan.nextDouble();
            if (firstSide + secondSide <= thirdSide || secondSide + thirdSide <= firstSide || thirdSide + firstSide <= secondSide) {
                System.out.println("The sum of 2 sides should be greater than the third side");
                flag = true;
            }
        } while (flag == true);
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide, true, "Blue");
        System.out.println(triangle);

    }

}
