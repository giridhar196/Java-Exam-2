/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Giridhar Addagalla
 */
public class oneDimensionArray {

    public static void main(String[] args) {
        System.out.println("Giridhar Addagalla | S542357");
        System.err.print("Enter ten integers: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<>();
        while (intArray.size() < 10) {
            intArray.add(sc.nextInt());
        }
        removeDuplicate(intArray);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                    list.remove(j);
                }
            }
        }
        System.out.print("The distinct integers are ");
        for (int l : list) {
            System.out.print(l + " ");
        }
        System.out.println("");
    }
}
