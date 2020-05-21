/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_10_4_2;

/**
 *
 * @author foldyistvan
 */
public class Feladat_10_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char start = 'A';
        char end = 'Z';
        char lastLetter;
        for (char firstLetter = start; firstLetter <= end; firstLetter++) {
            for (lastLetter = firstLetter; lastLetter <= end; lastLetter++) {
                System.out.print(lastLetter);
            }
            for (lastLetter = start; lastLetter < firstLetter; lastLetter++) {
                System.out.print(lastLetter);
            }
            System.out.println();
        }
    }
    
}
