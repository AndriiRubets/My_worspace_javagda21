package zad_sprzedarza;

import zad_sprzedarza.OfertaSprzedazy;

import java.util.Comparator;

public class OfertyComparator implements Comparator<OfertaSprzedazy>{
    private boolean czyRosnaco;

    public OfertyComparator(boolean czyRosnaco) {
        this.czyRosnaco = czyRosnaco;
    }


    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
        if (o1.getCena()>o2.getCena()) {
            return -1*(czyRosnaco?1:-1);
        }else if (o1.getCena()<o2.getCena()) {
            return 1*(czyRosnaco?1:-1);
        }
        return 0;
    }

}

