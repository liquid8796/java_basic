package JavaCore.Collections;

import JavaCore.Java8.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args){
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 24, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));

        // sort list student by it's name ASC
        System.out.println("sort list student by it's name ASC: ");
        Collections.sort(listStudents, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        // show list students
        for (Student student : listStudents) {
            System.err.println(student.toString());
        }
        // sort list student by age ASC
        System.out.println("sort list student by it's age ASC: ");
        Collections.sort(listStudents, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
