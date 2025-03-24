package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class CountEmployeeInEachDepartment {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        Map<String, Integer> m1 = e.stream().
                collect(Collectors.toMap(Employee::getDeptName, department-> 1, Integer::sum));
        System.out.println(m1.entrySet());
    }
}
