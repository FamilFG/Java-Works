package set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSets {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(123);
        student.setName("John");
        Student student2 = new Student();
        student2.setId(122);
        student2.setName("Akif");
        Student student3 = new Student();
        student3.setId(124);
        student3.setName("Bamil");

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
