package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Artikl {
    public String naziv=null;
    int cijena;
    String kod=null;
    public Artikl( String naziv, int cijena, String kod){
        this.naziv=naziv; this.cijena=cijena; this.kod=kod;
    }
    public String getNaziv(){return naziv;}
    public int  getCijena(){ return cijena;}
    public String getKod(){ return kod;}
}
