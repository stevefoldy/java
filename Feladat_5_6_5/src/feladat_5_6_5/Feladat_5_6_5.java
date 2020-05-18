/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_5_6_5;

/**
 *
 * @author foldyistvan
 */
public class Feladat_5_6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num = 333.33;
        String str = Double.toString(num);
        System.out.println("Eredeti szám: " + num);
        System.out.println("Átalakított szám: " + str.replace('.', ','));
    }
    
}
