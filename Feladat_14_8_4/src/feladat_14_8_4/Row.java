/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_14_8_4;

/**
 *
 * @author foldyistvan
 */
public class Row {

    private final static int SIZE = 3;
    private int [] line = new int [SIZE];
    private int pointer = 0;

    public void push(int i) throws Row_Exception {
        if (pointer < SIZE) {
            line[pointer] = i;
            System.out.println("A szám (" + i + ") a sorba helyezve!");
            pointer++; 
        } else {
           throw new Row_Exception("A sor megtelt!"); 
        }
            
    }

    public int pop() throws Row_Exception {
        if (pointer == 0) {
            throw new Row_Exception("A sor üres!");
        }
        int i = line[0]; // a szám kivétele a sorból
        for (int j = 1; j < pointer; j++)
            line[j-1] = line[j];
        pointer--;
        System.out.println("A szám (" + i + ") a sorból kivéve!");
        return i;
    }
}
