package interviews.questions.collector.framework.student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();

        Map<Integer,String> groupMap = students.stream()
                .collect(Collectors.groupingBy(Student::getId,
                        Collectors.mapping(Student::getName, Collectors.joining(" & "))));
        System.out.println(groupMap.keySet() + " " + groupMap.values());

        Map<Integer,List<Student>> groupMap2 = students.stream()
                .collect(Collectors.groupingBy(Student::getId, Collectors.toList()));
        System.out.println(groupMap2.keySet() + " " + groupMap2.values());
    }
}
