package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryDepartmentWise {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        e.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDeptName,Collectors.averagingLong(Employee::getSalary)))
                        .entrySet()
                .forEach(System.out::println);
    }
}
