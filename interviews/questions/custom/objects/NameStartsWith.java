package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class NameStartsWith {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

        List<Employee> e1 = emp.stream().
                filter(e->e.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println(e1);
    }
}
