/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamitogep;
import java.text.DecimalFormat;
/**
 *
 * @author foldyistvan
 */
public class Notebook extends Szamitogep {
    double uzemido;
    
    public Notebook(String processzor, double sebesseg, int ram, int hdd, double uzemido) {
        super(processzor, sebesseg, ram, hdd);
        this.uzemido = uzemido;
    }
    
    public Notebook(String processzor, double sebesseg, int hdd, double uzemido) {
        super(processzor, sebesseg, 2048, hdd);
        this.uzemido = uzemido;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.0");
        return super.toString() + ", " + df.format(uzemido) + " óra üzemidő";
    }
    
    public double getUzemido() {
        return uzemido;
    }
    
    @Override
    public boolean korszeru() {
        return (super.getSebesseg() > 1.0 && super.getRam() >= 1024 && super.getHdd() >= 120 && uzemido >= 3.0);
    }
}
