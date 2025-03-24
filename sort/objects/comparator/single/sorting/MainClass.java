package sort.objects.comparator.single.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Device d1 = new Device("Mobile","40000",23);
        Device d2 = new Device("Tablet","77890",97);
        Device d3 = new Device("TV","99878",51);
        Device d4 = new Device("Watch","3423",63);

        List<Device> deviceList = new ArrayList<>();
        deviceList.add(d1);
        deviceList.add(d2);
        deviceList.add(d3);
        deviceList.add(d4);

        //Traditional Approach
        Collections.sort(deviceList, new SortViaName());
        System.out.println(deviceList);

        //Anonymous Class
        Collections.sort(deviceList, Comparator.comparing(Device::getPrice));
        System.out.println("Sorting via Anonymous class");
        System.out.println(deviceList);

        //Streams
        List<Device> sortViaId = deviceList.stream().sorted(Comparator.comparing(Device::getId))
                .collect(Collectors.toList());
        System.out.println("Sorting via Streams");
        System.out.println(sortViaId);

        List<Device> sortViaPrice = deviceList.stream().sorted(Comparator.comparing(Device::getPrice))
                .collect(Collectors.toList());
        System.out.println(sortViaPrice);
    }
}
