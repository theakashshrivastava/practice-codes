package sort.objects.comparator.multiple.sorting.questions.flattening;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;

public class Employee_With_More_Than_2_Companies {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        List<Employee> empWithMoreThan2Companies = empList.stream()
                .filter(emp -> emp.getPreviousEmployers().size()>2)
                .toList();
        System.out.println("Employees who worked in more than 2 companies: ");
        empWithMoreThan2Companies.forEach(System.out::println);
    }
}
