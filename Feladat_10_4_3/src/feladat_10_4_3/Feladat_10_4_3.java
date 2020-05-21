/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_10_4_3;
import java.util.Scanner;
/**
 *
 * @author foldyistvan
 */
public class Feladat_10_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy ékezeteket tartalmazó szöveget!: ");
        String text = sc.nextLine();
        System.out.println();
        
        char cLetter;
        String letter;
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            letter = text.substring(i, i + 1);
            cLetter = letter.charAt(0);
            if ((cLetter >= 'a' && cLetter <= 'z') || (cLetter >= 'A' && cLetter <= 'Z') || (cLetter >= '0' && cLetter <= '9')) {
                newText += letter;
            } else {
                if (letter.matches("á|Á")) {
                    newText += "a";
                }
                else if (letter.matches("é|É")) {
                    newText += "e";
                } 
                else if (letter.matches("í|Í")) {
                    newText += "i";
                }
                else if (letter.matches("ó|Ó|ö|Ö|ő|Ő")) {
                    newText += "o";
                } else if (letter.matches("ú|Ú|ü|Ü|ű|Ű")) {
                    newText += "u";
                }
            }
        }
        newText = newText.toUpperCase();
        System.out.println("Végeredmény: ");
        System.out.println(newText);
    }
    
}
