/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuggveny;

/**
 *
 * @author foldyistvan
 */
public class Fuggveny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 2;
        
        System.out.println("x= " + x);
        x = duplaz(x);
        System.out.println("x= " + x);
    }
    private static int duplaz(int x) {
        return x = 2 * x;
    }
}
