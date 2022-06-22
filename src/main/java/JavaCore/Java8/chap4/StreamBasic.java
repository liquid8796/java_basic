package JavaCore.Java8.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamBasic {
    public static List<String> getYoungEmployeesInJava7(List<Employee> employees){
        List<Employee> youngEmployees = new ArrayList<>();
        for (Employee employee: employees) {
            if(employee.getAge() < 27){
                youngEmployees.add(employee);
            }
        }
        List<String> youngEmployeesName = new ArrayList<>();
        Collections.sort(youngEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() < o2.getAge() ? -1 : 1;
            }
        });
        for(Employee e : youngEmployees){
            youngEmployeesName.add(e.getName());
        }
        return youngEmployeesName;
    }
    public static List<String> getYoungEmployeesInJava8(List<Employee> employees){
        return employees.stream()
                        .filter(e -> e.getAge() < 27)
                        .sorted(comparing(Employee::getAge))
                        .map(Employee::getName)
                        .collect(toList());
    }

    public static void main(String...args) {
        // Java 7
        getYoungEmployeesInJava7(Employee.employees).forEach(System.out::println);

        System.out.println("---");

        // Java 8
        getYoungEmployeesInJava8(Employee.employees).forEach(System.out::println);
    }
}
