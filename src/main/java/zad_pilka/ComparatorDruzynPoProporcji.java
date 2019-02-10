package zad_pilka;

import java.util.Comparator;

public class ComparatorDruzynPoProporcji implements Comparator<DrurzynaPilkarska> {
    public int compare(DrurzynaPilkarska o1, DrurzynaPilkarska o2) {
        if ((o1.getSilaDruzyny() / o1.getPozycjaWRankingu()) > (o2.getSilaDruzyny() / o2.getPozycjaWRankingu())){

            return 1;
        }else if ((o1.getSilaDruzyny() / o1.getPozycjaWRankingu()) < (o2.getSilaDruzyny() / o2.getPozycjaWRankingu())){
            return -1;
        }else
            return 0;

    }
}
