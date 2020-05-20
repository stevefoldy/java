/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_8_7_2;

/**
 *
 * @author foldyistvan
 */
public class Feladat_8_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] array = new char[20];
        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = 'a';
        }
        for(int i = 1; i <= array.length - 1; i+=2) {
            array[i] = 'b';
        }
        for(int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }
    
}
