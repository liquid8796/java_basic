package JavaCore.Java8.chap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;

public class FilteringStudents {
    public static class Student{
        private int id;
        private String name;
        private int age;
        private String address;

        public Student() {
        }

        public Student(int id, String name, int age, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student@id=" + id + ",name=" + name
                    + ",age=" + age + ",address=" + address;
        }
    }
    public static boolean isInHCM(Student student){
        return "HCM".equals(student.getAddress());
    }
    public static boolean isOldStudent(Student student){
        return student.getAge() > 50;
    }
    public interface Predicate<T>{
        boolean test(T t);
    }
    public static List<Student> filterStudents(List<Student> classroom, Predicate<Student> p){
        List<Student> result = new ArrayList<>();
        for(Student student : classroom){
            if(p.test(student)){
                result.add(student);
            }
        }
        return result;
    }
    public static void main(String[] args){
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 24, "HCM"));
        listStudents.add(new Student(3, "Phu", 20, "HCM"));
        listStudents.add(new Student(4, "Quy", 22, "Da Nang"));

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
        //filter students have address in HCM using pass method around
        listStudents = filterStudents(listStudents, FilteringStudents::isInHCM);
        for(Student student : listStudents){
            System.err.println(student);
        }
        //filter students have address in HCM using lambdas
        listStudents = filterStudents(listStudents, (Student a) -> "HCM".equals(a.getAddress()));
        for(Student student : listStudents){
            System.out.println(student);
        }
    }
}
