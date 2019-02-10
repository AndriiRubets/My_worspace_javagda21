package zad_sprzedarza;

public class OfertaSprzedazy {
    private String nazwaProduktu;
    private int cena;

    public OfertaSprzedazy(String nazwaProduktu, int cena) {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "OfertaSprzedazy{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cena=" + cena +
                '}';
    }
}
