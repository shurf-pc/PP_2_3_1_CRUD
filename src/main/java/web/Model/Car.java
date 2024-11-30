package web.Model;

public class Car {
    private String type;
    private String model;
    private int year;

    public Car(String type, String model, int year) {
        this.type = type;
        this.year = year;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
