package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class GroupByAge {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

        Map<Integer,Long> m1 = emp.stream().collect(Collectors.groupingBy(Employee::getAge, counting()));

        Map<Integer,List<Employee>> m2 = emp.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(m1.entrySet());
        System.out.println(m2.entrySet());
    }
}
