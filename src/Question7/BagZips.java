package Question7;

/**
 *
 * @author Giridhar Addagalla
 */
public enum BagZips {
    SCHOOLBAG(2), COLLEGEBAG(3), TOURBAG(4), HANDBAG(1);
    private int bagZips;

    private BagZips(int bagZips) {
        this.bagZips = bagZips;
    }

    public int getNofZips() {
        return bagZips;
    }
}
