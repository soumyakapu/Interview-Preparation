package Logical;

import lombok.*;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortOfEmployees {
    public static void main(String[] args) {
    List<Employees> employeesList = new LinkedList<>();
    employeesList.add(new Employees(1,"emp1","emp1@gmail.com",12000));
    employeesList.add(new Employees(2,"emp2","emp2@gmail.com",10000));
    employeesList.add(new Employees(3,"emp3","emp3@gmail.com",9000));

//    List<Employees> emp=employeesList.stream()
//                 .filter(c->c.getSalary()<13000)
//            .sorted()
//            .collect(Collectors.toList());
//        System.out.println(emp);
        Stream<Employees> stream=employeesList.stream();
        stream.sorted(
               (s1,s2)->  (s1.getSalary() - s2.getSalary())
        ).forEach(System.out::println);
    }

}
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Employees{
    private int empId;
    private String name;
    private String email;
    private  int  salary;
}
