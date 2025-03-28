package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class GroupByAge {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

        emp.stream().collect(Collectors.groupingBy(Employee::getAge,counting()))
                .entrySet()
                .forEach(System.out::println);

        emp.stream().collect(Collectors.groupingBy(Employee::getAge))
                .entrySet()
                .forEach(System.out::println);
    }
}
