/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korkeruletterulet;

/**
 *
 * @author foldyistvan
 */
public class KorKeruletTerulet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r = 5;
        final double PI = 3.1415926535;
        double kerulet, terulet;
        kerulet = 2 * r * PI;
        terulet = Math.pow(r, 2) * PI;
        System.out.println("Kör kerülete: " + kerulet);
        System.out.println("Kör területe: " + terulet);
    }
    
}
