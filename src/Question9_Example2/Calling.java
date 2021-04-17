/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9_Example2;

/**
 *
 * @author Giridhar Addagalla
 */
public class Calling implements CallCharges {

    @Override
    public double local() {
        return CallCharges.super.local(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double sTDCalls() {
        return 0.5;
    }

    @Override
    public double iSDCalls() {
        return 10;
    }

}
