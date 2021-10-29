package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;

    public Korpa() {
        artikli = new Artikl[50];
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (Artikl artikl : artikli) {
            if (artikl != null) suma = suma + artikl.getCijena();
        }
        return suma;
    }

    public boolean dodajArtikl (Artikl artiklKojiSeDodaje) {
        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] == null) {
                artikli[i] = new Artikl(artiklKojiSeDodaje.getNaziv(), artiklKojiSeDodaje.getCijena(), artiklKojiSeDodaje.getKod());
                return true;
            }
        }
        return false;
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

    public Artikl[] getArtikli() {
        return artikli;
    }
}
