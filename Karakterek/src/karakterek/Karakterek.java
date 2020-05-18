/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karakterek;

/**
 *
 * @author foldyistvan
 */
public class Karakterek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c  = 'c';
        Character a = new Character('a');
        Character a1 = new Character('a');
        Character a2 = new Character('b');
        Character b = new Character('b');
        Character d = new Character('D');
        Character s = new Character(' ');
        Character l = new Character('1');
        System.out.println("a egyenlő a1?: " + (a.equals(a1)));
        System.out.println("b nagyobb mint a ?: " + (b.compareTo(a)));
        System.out.println("A d az nagybetű?: " + Character.isUpperCase(d));
        System.out.println("A d az kisbetű?: " + Character.isLowerCase(d));
        System.out.println("s egy szóköz?: " + Character.isSpaceChar(s));
        System.out.println("Az 1 az számjegy?: " + Character.isDigit(l));
    }
    
}
