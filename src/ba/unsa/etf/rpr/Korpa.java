package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] kupljeno= new Artikl[50];
    private int brart=0;
    public Artikl[] getArtikli(){
        return kupljeno;
    }
    public boolean dodajArtikl( Artikl artikl){
        if(brart<50){
            kupljeno[brart]=new Artikl(artikl.getNaziv(),artikl.getCijena(), artikl.getKod());
            brart++;
            return true;
        }
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaci=null;
        for(int i=0;i<brart;i++){
            if(kupljeno[i].kod.equals(kod)){
                izbaci=kupljeno[i];
                for(int j=i+1;j<brart;j++)
                    kupljeno[j-1]=kupljeno[j];
                brart--;
                break;
            }
        }
        return izbaci;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0;i<brart;i++){
            suma+=kupljeno[i].getCijena();
        }
        return suma;
    }
}
