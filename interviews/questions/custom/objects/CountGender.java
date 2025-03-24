package interviews.questions.custom.objects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountGender {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

        Map<String, Integer> genderMap = emp.stream()
                        .collect(Collectors.toMap(Employee::getGender, e -> 1, Integer::sum));
        System.out.println(genderMap.entrySet());
    }
}
