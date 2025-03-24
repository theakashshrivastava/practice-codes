package interviews.questions.custom.objects;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LargestDepartment {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();
        e.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
        }
    }

