package sort.objects.comparator.single.sorting;

import java.util.Comparator;

public class SortViaName implements Comparator<Device> {

    @Override
    public int compare(Device o1, Device o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
