package sort.objects.comparator.multiple.sorting.questions.comparing.and.then;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Total_Salary_Unmodifiable_Map {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String, Integer> totalSalaryByDepartment = empList.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(Employee::getDepartmentName, Collectors.summingInt(Employee::getSalary)),
                        Collections::unmodifiableMap
                ));
        System.out.println("Total Salary by Department: " + totalSalaryByDepartment);
    }
}
