package MyText3对象数组练习;

public class Team {
    private String id;
    private String name;
    private double price;
    private int count;

    public Team() {
    }

    public Team(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "team{id = " + id + ", name = " + name + ", price = " + price + ", count = " + count + "}";
    }
}
