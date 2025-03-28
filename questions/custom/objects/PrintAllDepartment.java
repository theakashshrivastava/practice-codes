package interviews.questions.custom.objects;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintAllDepartment {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();
        emp.stream()
                .map(Employee::getDeptName)
                .distinct().
                forEach(System.out::println);
    }
}
