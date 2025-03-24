package interviews.questions.custom.objects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortSalaryWise {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        List<Employee> sortSalary = e.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary)).toList();
        System.out.println(sortSalary);
    }
}
