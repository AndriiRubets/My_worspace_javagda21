package zad_comparator;

import java.util.Comparator;

public class OsobaComparator implements Comparator<OfertySprzedazy> {


    public int compare(OfertySprzedazy o1, OfertySprzedazy o2) {
        if (o1.getWiek() > o2.getWiek()) {
            return 1;
        }else if (o1.getWiek() < o2.getWiek()){
            return -1;
        }else
        return 0;
    }
}
