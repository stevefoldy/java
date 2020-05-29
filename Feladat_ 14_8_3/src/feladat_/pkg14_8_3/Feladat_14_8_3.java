/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_.pkg14_8_3;
import java.io.*;
/**
 *
 * @author foldyistvan
 */
public class Feladat_14_8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = null;
        BufferedReader br = null;
        String word = null;
        
        try {
            br = new BufferedReader(new FileReader("vissza.txt"));
            word = br.readLine();
            int length = word.length();
            sb = new StringBuffer(length);
            for (int i = length - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ioe) {}
            }
        }
        System.out.println(word);
        System.out.println(sb.toString());
    }
    
}
