package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class SalaryMoreThan {
    public static void main(String[] args) {
        List<Employee> e1 = EmployeeList.getEmployees();

        List<Employee> e2 = e1.stream().
                filter(e->(e.getSalary()>500000)).collect(Collectors.toList());
        System.out.println(e2);
    }
}
