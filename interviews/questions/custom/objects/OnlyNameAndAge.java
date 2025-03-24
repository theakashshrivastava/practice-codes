package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class OnlyNameAndAge {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        List<Employee> cloneEmp = e.stream()
//                .map(e1 -> new Employee(0,e1.getName(),e1.getAge(),0,null,null,null))
                .map(e1-> new Employee(e1.getName(),e1.getAge()))
                .toList();
        for(Employee ex : cloneEmp){
            System.out.println(ex.getName() + " " + ex.getAge());
        }
    }
}
