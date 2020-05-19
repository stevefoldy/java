/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_7_7_5;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_7_7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg 'n' értékét:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
}
