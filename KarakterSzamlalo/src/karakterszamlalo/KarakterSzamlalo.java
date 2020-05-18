/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karakterszamlalo;

/**
 *
 * @author foldyistvan
 */
public class KarakterSzamlalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int db = 0;
        String str = "Ma süt a nap";
        System.out.println(str);
        for (int i=0; i<= (str.length()-1); i++) {
            if (str.charAt(i) == 'a') {
                db++;
            }
        }
        System.out.println("Az a betűk száma = " + db);
    }
    
}
