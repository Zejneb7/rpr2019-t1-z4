package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
    }

    @Test
    void dodajArtikl() {
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Mlijeko", 2, "22");
        s.dodajArtikl(a);
        assertEquals(a, s.izbaciArtiklSaKodom("22"));
    }

    @Test
    void izbaciNepostojeciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Mlijeko", 2, "22");
        s.dodajArtikl(a);
        assertNull(s.izbaciArtiklSaKodom("23"));
    }
}