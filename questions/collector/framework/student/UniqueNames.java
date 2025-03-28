package interviews.questions.collector.framework.student;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNames {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();

        Set<String> uniqueName = students.stream()
                        .map(Student::getName)
                                .collect(Collectors.toSet());

        System.out.println(uniqueName);
    }
}
