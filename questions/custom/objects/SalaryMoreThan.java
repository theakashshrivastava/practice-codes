package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class SalaryMoreThan {
    public static void main(String[] args) {
        List<Employee> e1 = EmployeeList.getEmployees();

        e1.stream().
                filter(e->(e.getSalary()>500000))
                .forEach(System.out::println);
    }
}
