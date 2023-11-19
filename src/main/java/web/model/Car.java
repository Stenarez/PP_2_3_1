package web.model;

public class Car {
    private String name;
    private String series;
    private int id;

    public Car(String name, String series, int id) {
        this.name = name;
        this.series = series;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", series='" + series + '\'' +
                ", id=" + id +
                '}';
    }

}
