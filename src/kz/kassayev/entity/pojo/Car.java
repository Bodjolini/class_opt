package kz.kassayev.entity.pojo;

public class Car {
    private static int idGenerator = 0;
    private int id = idGenerator++;

    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private String number;

    public Car(String mark, String model, int year, String color, int price, String number) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }
}
