package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class OnlyNameAndAge {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        e.stream()
                .map(emp-> emp.getName() + " " + emp.getAge())
                .toList()
                .forEach(System.out::println);
    }
}
