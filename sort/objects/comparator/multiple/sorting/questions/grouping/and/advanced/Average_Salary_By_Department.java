package sort.objects.comparator.multiple.sorting.questions.grouping.and.advanced;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Average_Salary_By_Department {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String,Double> m1 = empList.stream().
                collect(Collectors
                        .groupingBy(Employee::getDepartmentName,Collectors.averagingLong(Employee::getSalary)));

        System.out.println("Average Salary by Department: " + m1);

    }
}
