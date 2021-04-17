package Question7_Example2;

/**
 *
 * @author Giridhar Addagalla
 */
public enum FanWings {
    HEATERFAN(4), NORMALFAN(3), TURBOFAN(8);
    private int noOFWings;

    FanWings(int noOFWings) {
        this.noOFWings = noOFWings;
    }

    public int getNoOFWings() {
        return noOFWings;
    }

}
