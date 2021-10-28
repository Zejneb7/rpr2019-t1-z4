package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli; // = new Artikl[50];

    /*public Korpa() {
        for (int i = 0; i < 50; i++) {
            artikli[i] = new Artikl();
        }
    }*/

    public Korpa(Artikl[] artikli) {
        for (int i = 0; i < 50; i++) {
            artikli[i] = new Artikl();
        }
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i = 0; i < 50; i++) {
            suma = suma + artikli[i].getCijena();
        }
        return suma;
    }

    public boolean dodajArtikl(Artikl novi_artikl) {
        for (int i = 0; i < 50; i++) {
            if ("".equals(artikli[i].getKod())) {
                artikli[i] = novi_artikl;
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod_artikla) {
        Artikl nas_artikl = new Artikl();
        for (int i = 0; i < 50; i++) {
            if (kod_artikla.equals(artikli[i].getKod())) {
                nas_artikl = artikli[i];
                artikli[i] = new Artikl();
            }
        }
        return nas_artikl;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
