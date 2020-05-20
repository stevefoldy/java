/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_8_7_5;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_8_7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numbers = new double[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= numbers.length - 1; i++) {
            System.out.print("Kérem az " + (i+1) + ". számot!: ");
            double a = sc.nextDouble();
            numbers[i] = a;
            // System.out.println(numbers[i]);
        }
        System.out.println("Bevitt számok: ");
        for(int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i]+ " ");
        }
        double least = numbers[0];
        for (int i = 1; i <= numbers.length - 1; i++) {
            if(numbers[i] < least) {
                least = numbers[i];
            }
        }
        System.out.println("A legkisebb szám: " + least);
    }
    
}
