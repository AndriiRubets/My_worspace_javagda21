package zad_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OfertySprzedazy> osoby=new ArrayList<OfertySprzedazy>(Arrays.asList(
                new OfertySprzedazy("s1", "b1", 45),
                new OfertySprzedazy("s2", "b2", 23),
                new OfertySprzedazy("s3", "b3", 15),
                new OfertySprzedazy("s4", "b4", 35)
        ));

        Collections.sort(osoby,new OsobaComparator());
        System.out.println(osoby);
    }
}
