package interviews.questions.collector.framework.student;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueStudent {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();
        System.out.println("List of students with duplicates " + students.size());

        Map<Integer,String> m1 = students.stream().collect(Collectors.toMap(
                Student::getId,
                Student::getName,
                (name1,name2) -> name2));

        System.out.println("List of students without duplicates "+ m1.size());
        System.out.println(m1);
    }
}
