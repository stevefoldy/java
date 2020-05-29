/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamitogep;

/**
 *
 * @author foldyistvan
 */
public class Main {
    public static void main(String[] args) {
        Szamitogep szg1 = new Szamitogep("AMD", 3.2, 4096, 400);
        Szamitogep szg2 = new Szamitogep("Intel", 2.6, 2048, 500);
        
        System.out.println(szg1);
        System.out.println(szg2);
        
        Notebook nb1 = new Notebook("AMD Turion X2", 1.8, 3072, 250, 3.55);
        Notebook nb2 = new Notebook("Intel Atom", 1.6, 120, 2.2);
        
        System.out.println(nb1);
        System.out.println(nb2);
        
        Szamitogep szg3 = new Szamitogep("AMD", 2.8, 2072, 500);
        Szamitogep szg4 = new Szamitogep("Intel", 2.6, 1024, 320);
        
        System.out.println("Az szg1" + (szg1.korszeru()?"":" nem") + " korszerű.");
        System.out.println("Az szg2" + (szg2.korszeru()?"":" nem") + " korszerű.");
        System.out.println("Az szg3" + (szg3.korszeru()?"":" nem") + " korszerű.");
        System.out.println("Az szg4" + (szg4.korszeru()?"":" nem") + " korszerű.");
        
        System.out.println("Az nb1" + (nb1.korszeru()?"":" nem") + " korszerű.");
        System.out.println("Az nb2" + (nb2.korszeru()?"":" nem") + " korszerű.");
        
        Pda p1 = new Pda("Samsung", 0.4, 512, 64, 3, 125);
        System.out.println(p1);
        
        System.out.println("A p1 " + (p1.korszeru()? "" : "nem") + "korszerű");
    }
}
