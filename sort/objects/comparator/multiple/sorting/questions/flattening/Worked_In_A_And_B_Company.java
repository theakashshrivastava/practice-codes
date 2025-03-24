package sort.objects.comparator.multiple.sorting.questions.flattening;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;

public class Worked_In_A_And_B_Company {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        List<Employee> employeeInCompanyA_and_B = empList.stream()
                .filter(emp -> emp.getPreviousEmployers().contains("Amazon") && emp.getPreviousEmployers().contains("Google"))
                .toList();
        System.out.println("Employees who worked in Amazon and Google: ");
        employeeInCompanyA_and_B.forEach(System.out::println);
    }
}
