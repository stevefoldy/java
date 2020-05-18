/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_6_6_3;

/**
 *
 * @author foldyistvan
 */
public class Feladat_6_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);
        System.out.println("1. szám = " + num1);
        System.out.println("2. szám = " + num2);
        if (num1 > num2) {
            System.out.println("Különbség a két számnak: " + (num1 - num2));
        } else {
            System.out.println("A két szám különbsége: " + (num2 - num1));
        }
    }
    
}
