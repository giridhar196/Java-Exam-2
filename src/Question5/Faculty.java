package Question5;

import java.util.Date;

/**
 *
 * @author Giridhar Addagalla
 */
public class Faculty extends Employee {

    private int officeHours;
    private int numberTeachingSubjects;

    public Faculty(int officeHours, int numberTeachingSubjects,
            String office, double salary, Date dateHired, String name,
            String address, long phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber,
                emailAddress);
        this.officeHours = officeHours;
        this.numberTeachingSubjects = numberTeachingSubjects;
    }

    @Override
    public String toString() {
        return "Person name from " + this.getClass().getName() + " is "
                + super.getName();
    }

}
