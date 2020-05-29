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
public class Pda extends Notebook {

    int suly;

    public Pda(String processzor, double sebesseg, int ram, int hdd, double uzemido, int suly) {
        super(processzor, sebesseg, ram, hdd, uzemido);
        this.suly = suly;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }
    
    @Override
    public String toString() {
        return super.getProcesszor() + " " + super.getSebesseg() + " GHz CPU, " +
            super.getRam() + " MB RAM, " + super.getHdd() + " GD háttértár," +
            super.getUzemido() + " óra üzemidő,  " + suly + " gramm.";
    }
    
    @Override
    public boolean korszeru() {
        return (super.getSebesseg() > 0.3 && super.getRam() >= 128 && super.getHdd() >= 16 && uzemido >= 2.5 && suly < 150);
    }
}
