package Question10;

/**
 *
 * @author Giridhar Addagalla
 */
public class DriverClass {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        One hippo = new Three();
        System.out.println(hippo.guess(4));
        System.out.println(hippo.apply(12));

        One lion = new One(-1);
        System.out.println(lion.guess(5));
        System.out.println(lion.apply(6));
    }

}
