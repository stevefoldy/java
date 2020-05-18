/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_5_6_2;

/**
 *
 * @author foldyistvan
 */
public class Feladat_5_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "_3 A MAGYAR IGAZSÁG_";
        String str2 = "Egyszer volt hol nem volt, volt egyszer egy ...";
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.replace('e', str1.charAt(1)));
    }
    
}
