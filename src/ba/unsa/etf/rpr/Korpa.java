package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] artikli = new Artikl[50];

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl artiklKojiSeDodaje) {
        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] == null) {
                artikli[i] = artiklKojiSeDodaje;
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

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijenaArtikala = 0;
        for (Artikl artikl : artikli) {
            if (artikl != null) ukupnaCijenaArtikala = ukupnaCijenaArtikala + artikl.getCijena();
        }
        return ukupnaCijenaArtikala;
    }
}
