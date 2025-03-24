package sort.objects.comparator.multiple.sorting;

import java.util.List;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String departmentName;
    private List<String> techSkills;
    private List<String> previousEmployers;
    private int workEx;

    public Employee(int id, String name, int age, int salary, String departmentName, List<String> techSkills, List<String> previousEmployers, int workEx) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.departmentName = departmentName;
        this.techSkills = techSkills;
        this.previousEmployers = previousEmployers;
        this.workEx = workEx;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<String> getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(List<String> techSkills) {
        this.techSkills = techSkills;
    }

    public List<String> getPreviousEmployers() {
        return previousEmployers;
    }

    public void setPreviousEmployers(List<String> previousEmployers) {
        this.previousEmployers = previousEmployers;
    }

    public int getWorkEx() {
        return workEx;
    }

    public void setWorkEx(int workEx) {
        this.workEx = workEx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && salary == employee.salary && workEx == employee.workEx && Objects.equals(name, employee.name) && Objects.equals(departmentName, employee.departmentName) && Objects.equals(techSkills, employee.techSkills) && Objects.equals(previousEmployers, employee.previousEmployers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary, departmentName, techSkills, previousEmployers, workEx);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", departmentName='" + departmentName + '\'' +
                ", techSkills=" + techSkills +
                ", previousEmployers=" + previousEmployers +
                ", workEx=" + workEx +
                '}';
    }
}
