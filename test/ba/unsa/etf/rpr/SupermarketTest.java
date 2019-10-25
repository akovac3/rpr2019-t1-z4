package ba.unsa.etf.rpr;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Supermarket supermarket;
    private Artikl artikl;

    @BeforeEach
    public void setUp(){
        supermarket=new Supermarket();
        artikl=new Artikl("Bicklo", 200, "art2");
    }

    @Test
    public void testIzbacivanjaNepostojeceg(){
        assertNull(supermarket.izbaciArtiklSaKodom("art1"));
    }


}