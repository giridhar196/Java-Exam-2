package Question2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class twodArrays {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        int[][] arrayOne = new int[3][3];
        int[][] arrayTwo = new int[3][3];
        System.out.print("Enter list1: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayOne[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayTwo[i][j] = sc.nextInt();
            }
        }
        if (equals(arrayOne, arrayTwo)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length == m2.length) {
            for (int i = 0; i < m1.length; i++) {
                if (!Arrays.equals(m1[i], m2[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
