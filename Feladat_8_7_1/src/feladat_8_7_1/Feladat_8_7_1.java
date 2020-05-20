/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_8_7_1;

/**
 *
 * @author foldyistvan
 */
public class Feladat_8_7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = {
            {0,1,2},
            {3,4,4},
            {0,0,0}
        };
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
}
