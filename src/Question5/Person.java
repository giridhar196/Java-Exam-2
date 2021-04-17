package Question5;

/**
 *
 * @author Giridhar Addagalla
 */
public class Person {

    private String name;
    private String address;
    private long phoneNumber;
    private String emailAddress;

    public Person(String name, String address,
            long phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person from " + this.getClass().getName() + " class is " + name;
    }

}
