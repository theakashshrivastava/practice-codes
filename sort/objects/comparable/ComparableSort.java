package sort.objects.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {
    public static void main(String[] args) {
        Book b1 = new Book(121,"Java","795");
        Book b2 = new Book(30,"C","592");
        Book b3 = new Book(526,"C++","476");
        Book b4 = new Book(361,"C#","459");

        List<Book> bList = new ArrayList<>();
        bList.add(b1);
        bList.add(b2);
        bList.add(b3);
        bList.add(b4);

        //Sorting via Comparable
        Collections.sort(bList);

        System.out.println(bList);
    }
}
