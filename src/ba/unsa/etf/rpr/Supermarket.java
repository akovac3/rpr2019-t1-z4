package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] proizvodi;
    private int br;

    public Supermarket(){
        proizvodi= new Artikl[1000];
        br=0;
    }

    public void dodajArtikl(Artikl art){
        if(br<1000){
            proizvodi[br]=new Artikl(art.getNaziv(),art.getCijena(), art.getKod());
            br++;
        }
    }
    public Artikl[] getArtikli(){
        return proizvodi;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaci=null;
        for(int i=0;i<br;i++){
            if(proizvodi[i].getKod().equals(kod)){
                izbaci=proizvodi[i];
                for(int j=i+1;j<br;j++)
                    proizvodi[j-1]=proizvodi[j];
                proizvodi[br-1]=null;
                br--;
                break;
            }
        }
        return izbaci;
    }
}
