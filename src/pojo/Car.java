package pojo;
public class Car {

    private int year;
    private int id;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", id=" + id +
                '}';
    }
}
