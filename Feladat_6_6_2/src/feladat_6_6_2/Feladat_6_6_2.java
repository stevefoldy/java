/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_6_6_2;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_6_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int x = scanNum.nextInt();
        System.out.println("Kérem a második számot: ");
        int y = scanNum.nextInt();
        if (x > y) {
            System.out.println("Az első számod nagyobb a második számnál");
        } else if (x < y) {
            System.out.println("Az második számod nagyobb az elsőnél");
        } else {
            System.out.println("Egyenlő a két szám!");
        }
    }
    
}
