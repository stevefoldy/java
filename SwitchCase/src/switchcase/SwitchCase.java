/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

/**
 *
 * @author foldyistvan
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 2;
        switch(c) {
            case 1: System.out.println("egy");
            case 2: System.out.println("kettő");
            case 3: System.out.println("három");
            default: System.out.println("Nem jó szám");
        }
    }
    
}
