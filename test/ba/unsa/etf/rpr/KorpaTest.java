package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa;
    private Artikl artikl;

    @BeforeEach
    public void setBeforeEach(){
        korpa=new Korpa();
        artikl=new Artikl("Biciklo", 100, "art1");
    }

  @Test
    public void testDodavanja(){
    //
      for(int i=0;i<50;i++){
          korpa.dodajArtikl(artikl);
      }
      assertFalse(korpa.dodajArtikl(artikl));
  }

  @Test
    public void testIzbacivanjaNepostojeceg(){
        assertNull(korpa.izbaciArtiklSaKodom("kod"));
  }

}