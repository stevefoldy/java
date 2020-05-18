/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszead;

/**
 *
 * @author foldyistvan
 */
public class Osszead {

    /**
     * @param args the command line arguments
     */
    private static int z;
    public static void main(String[] args) {
        int x = 6;
        int y = 13;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        z = sum(x,y);
        System.out.println("Az összeg: " + z);
    }
    
    private static int sum(int x, int y) {
        z = x + y;
        return z;
    }
}
