package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
    }

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Mlijeko", 2, "22");
        assertTrue(k.dodajArtikl(a));
        /*Artikl b = new Artikl("Jaja", 3, "23");
        assertTrue(k.dodajArtikl(b));*/
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Mlijeko", 2, "22");
        k.dodajArtikl(a);
        assertEquals(a, k.izbaciArtiklSaKodom("22"));
    }

    @Test
    void izbaciNepostojeciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Mlijeko", 2, "22");
        k.dodajArtikl(a);
        assertNull(k.izbaciArtiklSaKodom("23"));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Hljeb", 1, "21");
        Artikl b = new Artikl("Mlijeko", 2, "22");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        assertEquals(3, k.dajUkupnuCijenuArtikala());
    }
    @Test
    void dajUkupnuCijenuKadaNemaArtikala() {
        Korpa k = new Korpa();
        assertEquals(0, k.dajUkupnuCijenuArtikala());
    }
}