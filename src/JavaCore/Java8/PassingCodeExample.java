package JavaCore.Java8;

import java.util.ArrayList;
import java.util.List;

public class PassingCodeExample {
    public static boolean isInHCM(Student student){
        return "HCM".equals(student.getAddress());
    }
    public static boolean isOldStudent(Student student){
        return student.getAge() > 50;
    }
    public interface Predicate<T>{
        boolean test(T t);
    }
    public static List<Student> filterStudents(List<Student> _class, Predicate<Student> p){
        List<Student> result = new ArrayList<>();
        for(Student student : _class){
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
        listStudents.add(new Student(3, "Phu", 20, "Hue"));
        listStudents.add(new Student(4, "Quy", 22, "HCM"));
        //filter students have address in HCM using pass method around
        listStudents = filterStudents(listStudents, PassingCodeExample::isInHCM);
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
