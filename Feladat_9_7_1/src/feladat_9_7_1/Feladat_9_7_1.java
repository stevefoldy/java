/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_9_7_1;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_9_7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első egész számot: ");
        int a = sc.nextInt();
        System.out.println("Kérem a második egész számot: ");
        int b = sc.nextInt();
        System.out.println("A két szám szorzata: " + (a*b));
    }
    
}
