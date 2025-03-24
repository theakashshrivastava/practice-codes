package sort.objects.comparator.multiple.sorting.questions.comparing.and.then;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Highest_Salary_In_IT_Optional {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Optional<Employee> highestSalaryEmployee = empList.stream()
                .filter(emp -> "IT".equals(emp.getDepartmentName()))
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println("Highest Salary Employee in IT Department: ");
        highestSalaryEmployee.ifPresent(System.out::println);
    }
}
