package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

        Map<String, List<Employee>> m1 = emp.stream().
                collect(Collectors.groupingBy(Employee::getDeptName));
        System.out.println(m1.entrySet());
    }
}
