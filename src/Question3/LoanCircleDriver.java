package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Giridhar Addagalla
 */
public class LoanCircleDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        ArrayList<Object> objArrayList = new ArrayList<>();
        objArrayList.add(new Loan("Soukya", 1500000, 20));
        objArrayList.add(new Circle(12, true, false));
        objArrayList.add("Giridhar");
        objArrayList.add(new Date());
        for (Object obj : objArrayList) {
            System.out.println(obj.toString());
        }
    }

}
