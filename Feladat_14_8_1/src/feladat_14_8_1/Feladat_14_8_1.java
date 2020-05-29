/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_14_8_1;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_14_8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérek egy számot: ");
        
        try {
            double num = scan.nextDouble();
            double squareRoot = Math.sqrt(num);
            if (Double.isNaN(squareRoot)) {
                throw new Exception();
            }
            System.out.println(df.format(num) + " négyzetgyöke " + df.format(squareRoot));
        }
        catch (InputMismatchException ime) {
            System.err.println("Csak számot adhatsz meg!");
        }
        catch (Exception e) {
            System.err.println("Nem adhastz meg negatív számot, ebből nem vonható négyzetgyök!");
        }
    }
    
}
