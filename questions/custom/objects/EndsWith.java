package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class EndsWith {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();
        List<Employee> e1;

        e1 = e.stream().filter(x->x.getDeptName().endsWith("T")).collect(Collectors.toList());
        System.out.println(e1);
    }
}
