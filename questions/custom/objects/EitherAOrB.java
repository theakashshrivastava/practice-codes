package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class EitherAOrB {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        e.stream().filter(emp->"Mumbai".equals(emp.getCity())||"Pune".equals(emp.getCity()))
                .findFirst().ifPresentOrElse(System.out::println,()-> System.out.println("No employee found"));
    }
}
