
package JavaCore.Collections;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

public class ComparatorExampleJava8 {
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
        listStudents.sort(comparing(Student::getName));
        // show list students
        for (Student student : listStudents) {
            System.err.println(student.toString());
        }
        // sort list student by it's age ASC
        System.out.println("sort list student by it's age ASC: ");
        listStudents.sort(comparing(Student::getAge));
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
