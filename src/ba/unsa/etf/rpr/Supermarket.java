package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli = new Artikl[1000];

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void dodajArtikl(Artikl artiklKojiSeDodaje) {
        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] == null) {
                artikli[i] = artiklKojiSeDodaje;
                break;
            }
        }
    }

    public Artikl izbaciArtiklSaKodom(String kodArtiklaKojiSeIzbacuje) {
        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] != null) {
                if (kodArtiklaKojiSeIzbacuje.equals(artikli[i].getKod())) {
                    Artikl artiklKojiSeIzbacuje = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                    artikli[i] = null;
                    return artiklKojiSeIzbacuje;
                }
            }
        }
        return null;
    }
}
