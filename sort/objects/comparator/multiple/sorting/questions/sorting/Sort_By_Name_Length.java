package sort.objects.comparator.multiple.sorting.questions.sorting;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Comparator;
import java.util.List;

public class Sort_By_Name_Length {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        empList = empList.stream().sorted(Comparator.comparing(emp->emp.getName().length())).toList();
        System.out.println("Employees sorted by name length: " + empList);
    }
}
