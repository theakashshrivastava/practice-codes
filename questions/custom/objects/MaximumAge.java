package interviews.questions.custom.objects;

import java.util.Comparator;
import java.util.List;

public class MaximumAge {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        e.stream().max(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
    }
}
