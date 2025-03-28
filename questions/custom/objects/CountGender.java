package interviews.questions.custom.objects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountGender {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

        emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
