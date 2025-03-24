package interviews.questions.custom.objects;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateKey {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        Map<String,Employee> e1 =
                e.stream()
                        .collect(Collectors.toMap(
                                Employee::getName,
                                emp -> emp,
                                (existing, replacement) -> replacement,
                                LinkedHashMap::new
                        ));
        e1.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
