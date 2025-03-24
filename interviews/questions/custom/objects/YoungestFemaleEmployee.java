package interviews.questions.custom.objects;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestFemaleEmployee {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeList.getEmployees();

       emp.stream().filter(e-> e.getGender()=="F")
               .min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);
    }
}
