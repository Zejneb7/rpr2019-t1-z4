package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;

    public Korpa() {
        artikli = new Artikl[50];
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i = 0; i < 50; i++) {
            if (artikli[i] != null) suma = suma + artikli[i].getCijena();
        }
        return suma;
    }

    public boolean dodajArtikl (Artikl novi_artikl) {
        for (int i = 0; i < 50; i++) {
            if (artikli[i] == null) {
                artikli[i] = new Artikl(novi_artikl.getNaziv(), novi_artikl.getCijena(), novi_artikl.getKod());
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod_artikla) {
        Artikl nas_artikl = new Artikl();
        for (int i = 0; i < 50; i++) {
            if (artikli[i] != null) {
                if (kod_artikla.equals(artikli[i].getKod())) {
                    nas_artikl = artikli[i];
                    artikli[i] = null;
                    break;
                }
            }
        }
        return nas_artikl;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
