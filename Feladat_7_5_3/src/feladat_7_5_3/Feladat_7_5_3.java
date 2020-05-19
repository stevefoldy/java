/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_7_5_3;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_7_5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double min, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az 1. számot!: ");
        a = sc.nextDouble();
        min = a;
        
        for (int i = 2; i <= 5; i++) {
            System.out.print("Kérem a(z) + " + i + ". számot!: ");
            a = sc.nextDouble();
            if (a < min) {
                min = a;
            }
        }
        
        System.out.println("A legkiseb szám: " + min);
    }
    
}
