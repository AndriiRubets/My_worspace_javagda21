package zad_pilka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DrurzynaPilkarska> druzyny=new ArrayList<DrurzynaPilkarska>(Arrays.asList(
                new DrurzynaPilkarska("Dnipro",10,97),
                new DrurzynaPilkarska("Dynamo",20,85),
                new DrurzynaPilkarska("Shaktar",30,66)
        ));
        System.out.println(druzyny);
        Collections.sort(druzyny, new ComparatorDruzynPoPozycji());
        System.out.println(druzyny);




    }

}
