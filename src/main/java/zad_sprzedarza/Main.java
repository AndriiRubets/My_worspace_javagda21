package zad_sprzedarza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OfertaSprzedazy> oferty = new ArrayList<OfertaSprzedazy>(Arrays.asList(
                new OfertaSprzedazy("chleb", 5),
                new OfertaSprzedazy("mleko", 4),
                new OfertaSprzedazy("piwo", 6)
        ));

        System.out.println(oferty);
        Collections.sort(oferty, new OfertyComparator(true));
        System.out.println(oferty);
        Collections.sort(oferty, new OfertyComparator(false));
        System.out.println(oferty);
    }
}
