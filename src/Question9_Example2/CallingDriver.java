package Question9_Example2;

import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class CallingDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        Calling c = new Calling();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter calling code to verify the charges");
        int code = sc.nextInt();
        if (code == 0) {
            System.out.println("Call Extra charge " + c.local() + " of the Local");
        } else if (code == 1) {
            System.out.println("Call Extra charge " + c.iSDCalls() + " of the ISD");
        } else {
            System.out.println("Call Extra charge " + c.sTDCalls() + " of the STD");
        }
    }

}
