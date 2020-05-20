/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_8_7_4;

/**
 *
 * @author foldyistvan
 */
public class Feladat_8_7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int identityMatrix[][] = new int[5][5];
        System.out.println("Egységmátrix: ");
        for (int i = 0; i <= identityMatrix.length - 1; i++) {
            for (int j = 0; j <= identityMatrix.length - 1; j++) {
                if(i == j) {
                    identityMatrix[i][j] = 1;
                } else {
                    identityMatrix[i][j] = 0;
                }
                System.out.print(identityMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
