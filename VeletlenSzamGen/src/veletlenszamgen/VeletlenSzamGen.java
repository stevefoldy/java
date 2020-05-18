/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veletlenszamgen;

/**
 *
 * @author foldyistvan
 */
public class VeletlenSzamGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int) ((Math.random() * 10) + 11);
        System.out.println("Az első véletlen szám: " + num1);
        int num2 = (int) ((Math.random() * 10) + 11);
        System.out.println("A második véletlen szám: " + num2);
        System.out.println("A két véletlen szám összege: " + (num1 + num2));
        System.out.println("A két véletlen szám összege: " + (num1 + num2));
    }
    
}
