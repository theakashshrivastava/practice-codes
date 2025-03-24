package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByAge {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        List<Employee> eList = e.stream().filter(emp -> emp.getAge()>30).toList();
        System.out.println(eList.size());

    }
}
