/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_7_7_4;

/**
 *
 * @author foldyistvan
 */
public class Feladat_7_7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 5 == 0 && i % 25 != 0) {
                System.out.println(i + " ");
            }
        }
    }
    
}
