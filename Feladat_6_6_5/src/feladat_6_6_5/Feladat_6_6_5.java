/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_6_6_5;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_6_6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Kérem a betét összegét: ");
        int deposit = scanNum.nextInt();
        System.out.println("Kérem a lekötési időt (hónapban megadva): ");
        int month = scanNum.nextInt();
        double sum = deposit * Math.pow(1 + (double) 1/100, month);
        System.out.println("A kamatozott összeg: " + sum);
    }
    
}
