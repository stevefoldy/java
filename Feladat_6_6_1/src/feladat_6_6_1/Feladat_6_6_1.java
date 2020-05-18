/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_6_6_1;
import java.util.Scanner;

/**
 *
 * @author foldyistvan
 */
public class Feladat_6_6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Kérek egy számot: ");
        int x = scanNum.nextInt();
        if (x % 2 == 0) {
            System.out.println("Osztható 2-vel!");
        } else if (x % 3 == 0) {
            System.out.println("Osztható 3-al!");
        } else {
            System.out.println("Nem osztható 2-vel és 3-al sem!");
        }
    }
    
}
