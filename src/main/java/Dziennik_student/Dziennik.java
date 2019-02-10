package Dziennik_student;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {

    List<Student> studenty = new ArrayList<Student>();

    public void dodajStudenta(Student student) {
        studenty.add(student);

    }

    public void dodajStudentów(Student... students) {
        for (Student s : students) {
            studenty.add(s);
        }
    }

    public void usunStudentów(Student... students) {
        for (Student s : students) {
            studenty.remove(s);
        }
    }

    public void usunStudenta(String indeks) {
        for (Student student :
                studenty) {
            if (student.getIndeksStudenta().equalsIgnoreCase(indeks)) {
                studenty.remove(student);
                return;
            }
        }
    }

    public void usunStudenta(String... indeksyStudentów) {
        for (Student student :
                studenty) {
            for (int i = 0; i < indeksyStudentów.length; i++) {
                if (student.getIndeksStudenta().equalsIgnoreCase(indeksyStudentów[i])) {
                    studenty.remove(student);
                    break;
                }
            }
        }
    }

    public Student zwrocStudenta(String indeksStudenta) {
        for (Student s :
                studenty) {
            if (s.getIndeksStudenta().equalsIgnoreCase(indeksStudenta)) {
                return s;
            }
        }
        return null;
    }

//    public double podajSrediaStudenta(String indeksStudenta) {
//        for (Student s :
//                studenty) {
//            if (s.getIndeksStudenta().equalsIgnoreCase(indeksStudenta)) {
//                double suma = 0;
//                for (Double ocena : s.getOcenyStudenty()
//                ) {
//                    suma += ocena;
//                }
//                return suma / s.getOcenyStudenty().size();
//            }
//        }
//        return
//
//


}

