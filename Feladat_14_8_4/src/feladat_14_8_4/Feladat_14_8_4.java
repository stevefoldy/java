/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_14_8_4;
import java.io.*;
/**
 *
 * @author foldyistvan
 */
public class Feladat_14_8_4 {
    public static int msec = 2000;

    public static void wait(int n){
        long t0, t1;
        t0 =  System.currentTimeMillis();
        do {
            t1 = System.currentTimeMillis();
        } while ((t1 - t0) < (n / msec));
    }
    public static void main(String[] args) {
        Row r = new Row();
        try {
            r.push(12);
            r.push(9);
            r.push(14);
            wait(msec);
            r.push(22);
        } catch (Row_Exception se){
            System.err.println(se);
        }
        System.out.println(); 

        try {
            r.pop();
            r.pop();
            r.pop();
            wait(msec);
            r.pop();
        } catch (Row_Exception se){
            System.err.println(se);
        }
    }
    
}
