package JavaCore.Java8.chap4;

import JavaCore.Collections.Student;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private String type;

    public Employee() {
    }

    public Employee(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }

    public static final List<Employee> employees=
            Arrays.asList( new Employee("Tran Le Ha Nam", 25, "Fresher"),
                           new Employee("Nguyen Minh Man", 22, "Fresher"),
                           new Employee("Nguyen Van Cuong", 26, "Junior"),
                           new Employee("Tran Bao Toan", 30, "Senior"),
                           new Employee("Nguyen Van Nam", 34, "PM"),
                           new Employee("Nguyen Bao Chau", 23, "Junior"),
                           new Employee("Vuong Kha Manh", 28, "Leader")
            );
}
