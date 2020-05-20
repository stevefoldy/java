/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_9_7_3;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author foldyistvan
 */
public class Feladat_9_7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setProperty("file.encoding", "UTF8");
            PrintWriter pw = new PrintWriter("napok.txt");
            pw.println("hétfő");
            pw.println("kedd");
            pw.println("szerda");
            pw.println("csütörtök");
            pw.println("péntek");
            pw.println("szombat");
            pw.println("vasárnap");
            pw.close();
        }
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("napok.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line + (line.equals("vasárnap") ? "" : ", "));
            }
            System.out.println("");
            br.close();
        }
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    
}
