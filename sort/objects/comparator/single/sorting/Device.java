package sort.objects.comparator.single.sorting;

public class Device {
    private String name;

    private String price;

    private int id;

    public Device(String name, String price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", id=" + id +
                '}';
    }
}
