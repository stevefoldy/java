/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztas;

/**
 *
 * @author foldyistvan
 */
public class Osztas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 13;
        int y = 6;
        System.out.println("Normál és a maradákos osztás közötti különbség bemutatása:");
        System.out.println("x = 13 és y = 6");
        System.out.println("1. Normál osztás:");
        System.out.println("13 / 6 = " + x / y);
        System.out.println("2. Maradákos osztás:");
        System.out.println("13 % 6 = " + x % y);
        System.out.println("Típuskényszerítéssel:");
        System.out.println("x / y = " + (double) x / y);
        
    }
    
}
