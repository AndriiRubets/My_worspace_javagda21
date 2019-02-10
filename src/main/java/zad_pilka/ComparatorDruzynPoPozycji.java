package zad_pilka;

import java.util.Comparator;

public class ComparatorDruzynPoPozycji implements Comparator<DrurzynaPilkarska> {

    public int compare(DrurzynaPilkarska o1, DrurzynaPilkarska o2) {
        if (o1.getPozycjaWRankingu()>o2.getPozycjaWRankingu()) {
            return 1;
        }else if ((o1.getPozycjaWRankingu()<o2.getPozycjaWRankingu())) {
            return -1;
        }
        return 0;
    }
}
