package sort.objects.comparator.multiple.sorting.questions.sorting;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Comparator;
import java.util.List;

public class SortViaSalary {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        List<Employee> empSort = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println("Employees sorted by salary: " + empSort);
    }
}
