/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_5_6_3;

/**
 *
 * @author foldyistvan
 */
public class Feladat_5_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character a = new Character('a'); 
        Character b = new Character('b'); 
        Character b2 = new Character('b'); 
        Character c = new Character('c');
        System.out.println("különbség = " + (c.compareTo(a)));
        System.out.println("b = b2 ? " + b.equals(b2));
    }
    
}
