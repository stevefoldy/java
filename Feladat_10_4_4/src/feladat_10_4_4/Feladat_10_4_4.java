/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_10_4_4;
import java.io.*;
/**
 *
 * @author foldyistvan
 */
public class Feladat_10_4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int i = 0;
        int word = 0;
        String[] wordArray;

        BufferedReader br = new BufferedReader(new FileReader("szavak.txt"));
        word = Integer.parseInt(br.readLine());
        wordArray = new String [word];
        String sor;
        while ((sor = br.readLine()) != null) {
            wordArray[i] = sor;
            i++;
        }
        br.close();

        int minlength = 100; 
        int maxlength = 0;
        for (i = 0; i < word; i++) {
            minlength = Math.min(minlength, wordArray[i].length());
            maxlength = Math.max(maxlength, wordArray[i].length());
        }

        System.out.println("A legrövidebb szavak listája:");
        for (i = 0; i < word; i++) {
            if (wordArray[i].length() == minlength) {
                System.out.println(wordArray[i]);
            }
        }
        System.out.println();

        System.out.println("A leghosszabb szavak listája:");
        for (i = 0; i < word; i++) {
            if (wordArray[i].length() == maxlength) {
                System.out.println(wordArray[i]);
            }
        }
        System.out.println();

        int[] Stat = new int [maxlength];
        for (i = 0; i < word; i++) {
            Stat[wordArray[i].length()-1]++;
        }
            
        for (i = minlength-1; i < maxlength; i++) {
            if (Stat[i] > 0 ) {
                System.out.println((i+1) + " betűs szavak száma: " + Stat[i]);
            }
        }
    }
    
}
