package JavaCore.Java8.chap2;

import java.util.ArrayList;
import java.util.List;

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
    interface StudentPredicate{
        public boolean test(Student student);
    }
    static class StudentInHcmPredicate implements StudentPredicate{
        public boolean test(Student student) {
            return "HCM".equals(student.getAddress());
        }
    }
    static class StudentOldPredicate implements StudentPredicate{
        public boolean test(Student student) {
            return student.getAge() > 50;
        }
    }
    static class StudentOldInHcmPredicate implements StudentPredicate{
        public boolean test(Student student) {
            return student.getAge() > 50 && "HCM".equals(student.getAddress());
        }
    }
    public static List<Student> filterStudents(List<Student> classroom, StudentPredicate p){
        List<Student> result = new ArrayList<>();
        for(Student student : classroom){
            if(p.test(student)){
                result.add(student);
            }
        }
        return result;
    }

    public static void main(String...args){
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 79, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 51, "HCM"));
        listStudents.add(new Student(3, "Phu", 45, "HCM"));
        listStudents.add(new Student(4, "Quy", 22, "Da Nang"));
        //filter students have address in HCM using pass method
        List<Student> listStudentsInHcm = filterStudents(listStudents, new StudentInHcmPredicate());
        System.err.println(listStudentsInHcm);
        //filter old students using pass method
        List<Student> listStudentsOld = filterStudents(listStudents, new StudentOldPredicate());
        System.err.println(listStudentsOld);
        //filter old students using pass method
        List<Student> listStudentOldInHcm = filterStudents(listStudents, new StudentOldInHcmPredicate());
        System.err.println(listStudentOldInHcm);
        //filter students in any address using anonymous class
        List<Student> listStudentInAddress = filterStudents(listStudents, new StudentPredicate() {
            @Override
            public boolean test(Student student) {
                return student.getAddress().equals("Da Nang");
            }
        });
        System.err.println(listStudentInAddress);
    }
}
