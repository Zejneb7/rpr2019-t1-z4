package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli; // = new Artikl[1000];

    /*public Supermarket() {
        for (int i = 0; i < 1000; i++) {
            artikli[i] = new Artikl();
        }
    }*/

    public Artikl[] getArtikli () {
        return artikli;
    }

    public void dodajArtikl(Artikl novi_artikl) {
        for (int i = 0; i < 1000; i++) {
            if ("".equals(artikli[i].getKod())) {
                artikli[i] = novi_artikl;
                break;
            }
        }
        //if (i == 1000) System.out.println("Supermarket je pun");
    }
    public Artikl izbaciArtiklSaKodom(String kod_artikla) {
        Artikl nas_artikl = new Artikl();
        for (int i = 0; i < 1000; i++) {
            if (kod_artikla.equals(artikli[i].getKod())) {
                nas_artikl = artikli[i];
                artikli[i] = new Artikl();
            }
        }
        return nas_artikl;
    }
}
