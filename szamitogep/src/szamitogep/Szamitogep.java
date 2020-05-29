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
public class Szamitogep {
    private String processzor;
    private double sebesseg;
    private int ram;
    private int hdd;
    
    public interface Comparable<T> {
        public int compareTo(T o);
    } 

    public Szamitogep(String processzor, double sebesseg, int ram, int hdd) {
        this.processzor = processzor;
        this.sebesseg = sebesseg;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getProcesszor() {
        return processzor;
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setProcesszor(String processzor) {
        this.processzor = processzor;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    
    @Override
    public String toString() {
        return processzor + " " + sebesseg + " GHz CPU, " + ram + " MB RAM, " + hdd + " Gb HDD";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Szamitogep)) {
            return false;
        }
        Szamitogep sz = (Szamitogep)obj;
        return (processzor.equals(sz.processzor) && 
                Math.abs(sebesseg / sz.sebesseg - 1) <= 0.1 &&
                Math.abs(ram / sz.ram - 1) <= 0.1 &&
                Math.abs(hdd / sz.hdd - 1) <= 0.1);
    }
    
    public int compareTo(Szamitogep sz) {
        return (int)(this.sebesseg - sz.sebesseg);
    }
    
    
    public boolean korszeru() {
        return(sebesseg >= 1.6 && ram >= 2048 && hdd > 160);
    } 
    
}
