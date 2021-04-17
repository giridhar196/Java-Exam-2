package Question7_Example2;

/**
 *
 * @author Giridhar Addagalla
 */
public class WingsDriver {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        System.out.println("The total types of fans are: " + FanWings.values().length);

        System.out.println("The different types Fans: ");
        for (FanWings value : FanWings.values()) {
            System.out.println(value);
        }

    }

}
