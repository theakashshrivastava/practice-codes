package interviews.questions.custom.objects;

import java.util.Comparator;
import java.util.List;

public class HighestSalary {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();
        e.stream()
                .max(Comparator.comparingLong(Employee::getSalary))
                .ifPresent(System.out::println);
    }
}
