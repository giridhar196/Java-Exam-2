package Question5;

import java.util.Date;

/**
 *
 * @author Giridhar Addagalla
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        // TODO code application logic here
        Date d = new Date();
        Person personObj = new Person("Giridhar Addagalla", "Maryville",
                91960321, "g196@gmail.com");
        Student stuObj = new Student(10.0, "Vasavi", "Maryville",
                98334462, "v@gmail.com");
        Employee empObj = new Employee("Northwest", 13000, d, "Natesh",
                "Maryville", 123456, "nghan@gmail.com");
        Staff staffObj = new Staff("Service Worker", "Dinning", 15000, d,
                "Sujith", "MAryville", 3256789, "sujith@gmail.com");
        Faculty facObj = new Faculty(12, 3, "Colden Hall", 700000, d,
                "Terri", "Northwest", 787878787, "terri@gmail.com");

        System.out.println(personObj);
        System.out.println(stuObj);
        System.out.println(empObj);
        System.out.println(staffObj);
        System.out.println(facObj);
    }

}
