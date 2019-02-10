package zad_pilka;

public class DrurzynaPilkarska {
    private String nazwa;
    private double pozycjaWRankingu;
    private double silaDruzyny;

    public DrurzynaPilkarska(String nazwa, double pozycjaWRankingu, double silaDruzyny) {
        this.nazwa = nazwa;
        this.pozycjaWRankingu = pozycjaWRankingu;
        this.silaDruzyny = silaDruzyny;
    }

    @Override
    public String toString() {
        return "DrurzynaPilkarska{" +
                "nazwa='" + nazwa + '\'' +
                ", pozycjaWRankingu=" + pozycjaWRankingu +
                ", silaDruzyny=" + silaDruzyny +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getPozycjaWRankingu() {
        return pozycjaWRankingu;
    }

    public void setPozycjaWRankingu(double pozycjaWRankingu) {
        this.pozycjaWRankingu = pozycjaWRankingu;
    }

    public double getSilaDruzyny() {
        return silaDruzyny;
    }

    public void setSilaDruzyny(double silaDruzyny) {
        this.silaDruzyny = silaDruzyny;
    }
}
