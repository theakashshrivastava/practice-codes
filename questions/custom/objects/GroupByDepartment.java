package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

        emp.stream().
                collect(Collectors.groupingBy(Employee::getDeptName))
                        .entrySet()
                                .forEach(System.out::println);
    }
}
