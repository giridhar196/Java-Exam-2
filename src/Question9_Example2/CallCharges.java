package Question9_Example2;

/**
 *
 * @author Giridhar Addagalla
 */
public interface CallCharges {

    default double local() {
        return 0;
    }

    double sTDCalls();

    double iSDCalls();
}
