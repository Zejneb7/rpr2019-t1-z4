package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArtiklTest {

    @Test
    void testKonstruktora() {
        Artikl a = new Artikl("Hljeb", 1, "21");
    }

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Hljeb", 1, "21");
        assertEquals("Hljeb", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Hljeb", 1, "21");
        assertEquals(1, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Hljeb", 1, "21");
        assertEquals("21", a.getKod());
    }
}