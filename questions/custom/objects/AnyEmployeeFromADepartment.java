package interviews.questions.custom.objects;

import java.util.List;
import java.util.Optional;

public class AnyEmployeeFromADepartment {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();
        e.stream()
                .filter(e1->"ITT".equals(e1.getDeptName()))
                .findFirst()
                .ifPresentOrElse(System.out::println,()-> System.out.println("No employee found from ITT department"));
    }
}
