/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_6_6_4;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_6_6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Kérem az érdemjegyet: ");
        int grade = scanNum.nextInt();
        switch(grade) {
            case 1: System.out.println("elégtelen");
                break;
            case 2: System.out.println("elégséges");
                break;
            case 3: System.out.println("közepes");
                break;
            case 4: System.out.println("jó");
                break;
            case 5: System.out.println("jeles");
                break;
            default: System.out.println("Nem létező érdemjegyet adtál meg");
        }
    }
    
}
