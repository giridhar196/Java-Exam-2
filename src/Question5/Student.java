package Question5;

/**
 *
 * @author Giridhar Addagalla
 */
public class Student extends Person {

    private double grade;
    public static final String CLASS_STATUS = "Graduate";

    public Student(double grade, String name, String address,
            long phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person name from " + this.getClass().getName() + " is "
                + super.getName();
    }

}
