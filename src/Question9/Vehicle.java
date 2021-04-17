/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Giridhar Addagalla
 */
public class Vehicle implements TollGate {

    private int noOfWheels;

    public Vehicle(int noOfWheels) {

        this.noOfWheels = noOfWheels;
    }

    @Override
    public String vehicleType() {
        if (noOfWheels == 4) {
            return "Car";
        } else if (noOfWheels == 2) {
            return "Two Wheeler";
        } else {
            return "Truck";
        }

    }

    @Override
    public double tax() {
        if (null == vehicleType()) {
            return 20;
        } else {
            switch (vehicleType()) {
                case "Car":
                    return 10;
                case "Two Wheeler":
                    return 5;
                default:
                    return 20;
            }
        }
    }

    @Override
    public String toString() {
        return "Vehicle: " + vehicleType() + " No Of Wheels: " + noOfWheels + " Tax: " + tax();
    }

}
