package sort.objects.comparator.multiple.sorting.questions.grouping.and.advanced;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_Employee_In_Each_Department {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String,Long> m2 = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()));
        System.out.println(m2);

    }
}
