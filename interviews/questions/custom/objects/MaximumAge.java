package interviews.questions.custom.objects;

import java.util.Comparator;
import java.util.List;

public class MaximumAge {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        Employee emp = e.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(emp);
    }
}
