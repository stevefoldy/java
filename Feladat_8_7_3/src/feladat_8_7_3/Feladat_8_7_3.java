/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_8_7_3;

/**
 *
 * @author foldyistvan
 */
public class Feladat_8_7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int[][] numbers = new int[6][6];
        for(int i = 0; i <= numbers.length - 1; i++) {
            for(int j = 0; j <= numbers.length - 1; j++) {
                numbers[i][j] = (int)(Math.random()*9)+1;
                System.out.print(numbers[i][j] + " ");
                sum += numbers[i][j] ;
            }
            System.out.println("");
        }
        System.out.println("Összeg: " + sum);
        System.out.println(numbers.length * numbers[0].length);
        System.out.println("A számok átlaga: " + (double)(sum / (numbers.length * numbers[0].length)));
    }
    
}
