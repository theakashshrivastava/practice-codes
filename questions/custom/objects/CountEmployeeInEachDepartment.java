package interviews.questions.custom.objects;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class CountEmployeeInEachDepartment {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        e.stream().collect(Collectors.toMap(dept->dept,
                dept->1,
                Integer::sum,
                LinkedHashMap::new ))
                .entrySet()
                .forEach(System.out::println);

        e.stream().collect(Collectors.groupingBy(dept->dept, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
