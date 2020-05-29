/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_10_4_1;

/**
 *
 * @author foldyistvan
 */
public class Feladat_10_4_1 {

    /**
     * @param args the command line arguments
     */
    static int x;
    static int y;
    
    static int Fibonacci(int a) {
        if ((a == 0) || (a ==1 )) {
            return a;
        }
        else {
            return Fibonacci(a-1) + Fibonacci(a-2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Fibonacci számok kiíratása 1-20-ig: ");
        int i = 1;
        x = 0;
        y = 1;
        while (i <= 10) {
            System.out.print(x + ", " + y + (i == 10 ? " ": ", "));
            x += y;
            y += x;
            i++;
        }
        System.out.println();
        
        System.out.println("Fibonacci számok 21-30-ig: ");
        i = 20;
        while (i <= 29) {
            System.out.print(Fibonacci(i) + (i == 29 ? " " : ", "));
            i++;
        }
        
        System.out.println();
    }
    
}
