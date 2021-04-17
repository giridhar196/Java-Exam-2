package Question5;

import java.util.Date;

/**
 *
 * @author Giridhar Addagalla
 */
public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String office, double salary, Date dateHired, String name,
            String address, long phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Person name from " + this.getClass().getName()
                + " is " + super.getName();
    }

}
