package interviews.questions.custom.objects;

import java.util.List;
import java.util.Optional;

public class AnyEmployeeFromADepartment {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        Optional<Employee> m1 = e.stream().filter(e1->e1.getDeptName()=="IT").findFirst();
        System.out.println(m1);
    }
}
