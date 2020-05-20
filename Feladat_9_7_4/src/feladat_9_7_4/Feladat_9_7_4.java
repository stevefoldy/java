/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_9_7_4;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *
 * @author foldyistvan
 */
public class Feladat_9_7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("..\\Feladat_9_7_2\\abc.txt", "rw");
            long length = raf.length();
            long pos = 2;
            int code;
            while (pos < length) {
                raf.seek(pos);
                code = raf.read();
                raf.seek(pos);
                raf.write(code - 32);
                pos = pos + 3;
            }
            raf.seek(0);
            while ((code = raf.read()) != -1 ) {
                System.out.print((char)code);
            }
            System.out.println("");
            raf.close();
        } 
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    
}
