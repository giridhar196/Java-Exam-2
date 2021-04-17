/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8_Example2;

/**
 *
 * @author Giridhar Addagalla
 */
public class Beds extends BedProperties {

    private double length, breath;

    Beds(double length, double breath) {
        this.breath = breath;
        this.length = length;
    }

    @Override
    String beadSize() {
        if (length > 12 && breath > 20) {
            return "Small Size";
        } else if (length > 20 && breath > 30) {
            return "Queen size";
        } else {
            return "King Size";
        }
    }
}
