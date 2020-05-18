/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atlagszamitas;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class AtlagSzamitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int összeg = 0, db = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot! (0 esetén vége!)");
        int a = sc.nextInt();
        while(a != 0) {
            összeg = összeg + a;
            db++;
            System.out.println("Kérem a következő számot! (0 esetén vége!)");
            a = sc.nextInt();
        }
        System.out.println("A számok összege = " + összeg);
        System.out.println("A darabszám = " + db);
        if (db != 0) {
            System.out.println("A számok átlaga = " + ((double)összeg / db));
        } else {
            System.out.println("Nincs átlag");
        }
    }
    
}
