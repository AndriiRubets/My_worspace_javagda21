package Dziennik_student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Double> ocenyStudenty=new ArrayList<Double>();
    private String indeksStudenta;
    private String imieStudenta;
    private String nazwiskoStudenta;

    public Student(List<Double> ocenyStudenty, String indeksStudenta, String imieStudenta, String nazwiskoStudenta) {
        this.ocenyStudenty = ocenyStudenty;
        this.indeksStudenta = indeksStudenta;
        this.imieStudenta = imieStudenta;
        this.nazwiskoStudenta = nazwiskoStudenta;
    }

    public Student() {
    }

    public List<Double> getOcenyStudenty() {
        return ocenyStudenty;
    }

    public void setOcenyStudenty(List<Double> ocenyStudenty) {
        this.ocenyStudenty = ocenyStudenty;
    }

    public String getIndeksStudenta() {
        return indeksStudenta;
    }

    public void setIndeksStudenta(String indeksStudenta) {
        this.indeksStudenta = indeksStudenta;
    }

    public String getImieStudenta() {
        return imieStudenta;
    }

    public void setImieStudenta(String imieStudenta) {
        this.imieStudenta = imieStudenta;
    }

    public String getNazwiskoStudenta() {
        return nazwiskoStudenta;
    }

    public void setNazwiskoStudenta(String nazwiskoStudenta) {
        this.nazwiskoStudenta = nazwiskoStudenta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ocenyStudenty=" + ocenyStudenty +
                ", indeksStudenta='" + indeksStudenta + '\'' +
                ", imieStudenta='" + imieStudenta + '\'' +
                ", nazwiskoStudenta='" + nazwiskoStudenta + '\'' +
                '}';
    }
}
