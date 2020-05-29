/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_14_8_2;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author foldyistvan
 */
public class Feladat_14_8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek több egész számot vesszóvel elválasztva!");
        String line = sc.nextLine();
        
        
        String tkn = null;
        StringTokenizer st = new StringTokenizer(line, " 23");
        int piece = st.countTokens();
        while (st.hasMoreTokens()) {
            try {
                tkn = st.nextToken();
                sum += Integer.parseInt(tkn);
            }
            
            catch (NumberFormatException nfe) {
                System.err.println(tkn + " nem egész!");
                piece--;
            }
        } 
        System.out.println("A beolvasott számok (" + piece + " db) összege:" + sum);
    }
    
}
