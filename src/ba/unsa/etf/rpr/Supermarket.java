package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;

    public Supermarket() {
        artikli = new Artikl[1000];
    }

    public Artikl[] getArtikli () {
        return artikli;
    }

    public void dodajArtikl(Artikl novi_artikl) {
        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] == null) {
                artikli[i] = novi_artikl;
                break;
            }
        }
    }

    public Artikl izbaciArtiklSaKodom(String kod_artikla) {
        Artikl nas_artikl = new Artikl();
        for (int i = 0; i < artikli.length; i++) {
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
}
