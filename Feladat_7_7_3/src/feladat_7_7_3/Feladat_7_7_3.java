/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_7_7_3;

/**
 *
 * @author foldyistvan
 */
public class Feladat_7_7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            double rand = Math.random();
            /*System.out.println(rand);*/
            System.out.println(((int) (rand *6)+1) +" ");
        }
    }
    
}
