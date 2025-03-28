package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();
       e.stream().mapToInt(Employee::getAge).average()
               .ifPresentOrElse(System.out::println,
                       ()-> System.out.println("No employees found"));
    }
}
