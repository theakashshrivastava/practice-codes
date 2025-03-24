package sort.objects.comparator.multiple.sorting.questions.flattening;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;

public class Having_A_And_B_As_Skills {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        List<Employee> employeeWith_A_and_B_Skills = empList.stream()
                .filter(emp -> emp.getTechSkills().contains("Java") && emp.getTechSkills().contains("Python"))
                .toList();
        System.out.println("Employees who have Java and Python as skills: ");
        employeeWith_A_and_B_Skills.forEach(System.out::println);
    }
}
