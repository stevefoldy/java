/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_9_7_2;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author foldyistvan
 */
public class Feladat_9_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("abc.txt");
            for (int i = 97; i <= 122; i++) {
                fw.write(i);
            }
            fw.close();
        }
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        
        try {
            FileReader fr = new FileReader("abc.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char)(c-32));
            }
            System.out.println("");
            fr.close();
        }
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    
}
