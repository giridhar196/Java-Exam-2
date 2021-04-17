package Question5;

import java.util.Date;

/**
 *
 * @author Giridhar Addagalla
 */
public class Staff extends Employee {

    private String title;

    public Staff(String title, String office, double salary,
            Date dateHired, String name, String address,
            long phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address,
                phoneNumber, emailAddress);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Person name from " + this.getClass().getName()
                + " is " + super.getName();
    }

}
