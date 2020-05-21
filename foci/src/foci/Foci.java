/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foci;
import java.io.*;
import java.util.*;
/**
 *
 * @author foldyistvan
 */
public class Foci {

    static int[][] T1; // mérkőzések számadatai
    static String[][] T2; // mérkőzések szöveges adatai

    public static int MaxMin(int z) {
        return Math.max(T1[z][1], T1[z][2]) * 10 + Math.min(T1[z][1], T1[z][2]);
    }

    public static void main(String[] args) throws IOException {

        // 1. feladat
        int i = 0;
        int msz = 0;
        BufferedReader br = new BufferedReader(new FileReader("meccs.txt"));
        msz = Integer.parseInt(br.readLine());
        T1 = new int [msz][6];
        T2 = new String [msz][2];
        String sor;
        while ((sor = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(sor," ");
            for (int j = 0; j<5; j++) {
                T1[i][j] = Integer.parseInt(st.nextToken());
            }
            T1[i][5] = 0;
            T2[i][0] = st.nextToken();
            T2[i][1] = st.nextToken();
            i++;
        }
        br.close();

        System.out.println("2. feladat:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a forduló számát!");
        int fsz = sc.nextInt();
        for (int j = 0; j < msz; j++)
            if (T1[j][0] == fsz)
                System.out.println(T2[j][0]+"-"+T2[j][1]+": "+T1[j][1]+"-"+T1[j][2]
                        +" ("+T1[j][3]+"-"+T1[j][4]+")" );
        System.out.println("");
        
        System.out.println("3. feladat:");
        for (int j = 0; j < msz; j++)
            if ((T1[j][3] < T1[j][4]) && (T1[j][1] > T1[j][2]))
                System.out.println(T1[j][0]+" "+T2[j][0]);
            else if ((T1[j][4] < T1[j][3]) && (T1[j][2] > T1[j][1]))
                System.out.println(T1[j][0]+" "+T2[j][1]);
        System.out.println("");

        System.out.println("4. feladat:");
        sc = new Scanner(System.in);
        System.out.println("Kérem egy csapat nevét!");
        String csn = sc.next();
        System.out.println("");

        System.out.println("5. feladat:");
        int lőtt = 0;
        int kapott = 0;
        for (int j = 0;j < msz; j++) 
            if  (csn.matches(T2[j][0])) {
                lőtt += T1[j][1];
                kapott += T1[j][2];
            } else if (csn.matches(T2[j][1])) {
                lőtt += T1[j][2];
                kapott += T1[j][1];                
            }
        System.out.println("lőtt: "+lőtt+", kapott: "+kapott);
        System.out.println("");

        System.out.println("6. feladat:");
        boolean kikapott = false;
        int j = 0;
        while ((! kikapott) && (j < msz)) {
            if (csn.matches(T2[j][0]) && (T1[j][1] < T1[j][2]))
                kikapott = true;
            j++;
        } 
        if (! kikapott)
            System.out.println("A csapat otthon veretlen maradt.");
        else
            System.out.println(T1[j-1][0]+" "+T2[j-1][1]);
        System.out.println("");

        // 7. feladat
        PrintWriter pw = new PrintWriter("stat.txt");
        for (i = 0; i < msz; i++) 
            for (int k = 0; k <= i; k++)
                if (MaxMin(i) == MaxMin(k)) {
                    T1[k][5]++;
                    break;
                }
        
        for (i = 0; i < msz; i++)
            if (T1[i][5] != 0) 
                pw.println(Math.max(T1[i][1], T1[i][2]) + "-" + Math.min(T1[i][1], T1[i][2])
                         + ": " + T1[i][5] + " darab");
        pw.close();
    }
}
