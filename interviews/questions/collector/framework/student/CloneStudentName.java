package interviews.questions.collector.framework.student;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CloneStudentName {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();

        Set<Student> onlyName = students.stream().map(student -> new Student(student.getName())).collect(Collectors.toSet());
        System.out.println(onlyName.size());
        for(Student student : onlyName){
            System.out.println(student.getName());
        }
    }
}
