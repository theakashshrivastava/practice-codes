package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryDepartmentWise {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        Map<String, Double> m1 = e.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDeptName,Collectors.averagingLong(Employee::getSalary)));
        System.out.println(m1.entrySet());
    }
}
