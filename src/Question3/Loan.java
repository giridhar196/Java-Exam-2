package Question3;

/**
 *
 * @author Giridhar Addagalla
 */
public class Loan {

    private String lName;
    private double lAmount;
    private int repayPeriod;

    public Loan(String lName, double lAmount, int repayPeriod) {
        this.lName = lName;
        this.lAmount = lAmount;
        this.repayPeriod = repayPeriod;
    }

    @Override
    public String toString() {
        return "Loan Details: \n" + "Name:" + lName + ", Loan Amount=" + lAmount + ", Repay Period=" + repayPeriod;
    }

}
