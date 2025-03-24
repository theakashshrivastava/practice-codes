package sort.objects.comparator.multiple.sorting.questions.grouping.and.advanced;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Highest_Paid_Employee_In_Each_Department {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String, Optional<Employee>> m1 = empList.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartmentName,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        m1.forEach((k, v) -> System.out.println(k + " : " + v.get()));
    }
}
