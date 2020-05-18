/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisebbikszamnegyzetgyoke;

/**
 *
 * @author foldyistvan
 */
public class KisebbikSzamNegyzetgyoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 34;
        int y = 26;
        double xNum = Double.valueOf(x);
        double yNum = Double.valueOf(y);
        double small = Math.min(xNum, yNum);
        System.out.println("A két szám közül a kisebbik: " + small);
        double sqrt = Math.sqrt(small);
        System.out.println("A kisebbik szám négyzetgyüke: " + sqrt);
    }
    
}
