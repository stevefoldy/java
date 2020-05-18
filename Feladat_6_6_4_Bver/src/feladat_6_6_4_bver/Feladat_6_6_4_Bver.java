/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_6_6_4_bver;

import java.util.Scanner;

/**
 *
 * @author foldyistvan
 */
public class Feladat_6_6_4_Bver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Kérem az érdemjegyet: ");
        int grade = scanNum.nextInt();
        if (grade == 1) {
            System.out.println("elégtelen");
        } else if (grade == 2) {
            System.out.println("elégséges");
        } else if (grade == 3) {
            System.out.println("közepes");
        } else if (grade == 4) {
            System.out.println("jó");
        } else if (grade == 5) {
            System.out.println("jeles");
        } else {
            System.out.println("Nem létezik ilyen érdemjegy!");
        }
    }
    
}
