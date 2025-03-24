package sort.objects.comparator.multiple.sorting.questions.sorting;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Comparator;
import java.util.List;

public class BySalary_AndThen_ByWorkEx {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        empList = empList.stream()
                        .sorted(Comparator.comparing((Employee emp) -> emp.getWorkEx()<=10)
                                .thenComparing(Employee::getSalary))
                                .toList();
        System.out.println("Employees sorted by salary and then by work experience: " + empList);
    }
}
