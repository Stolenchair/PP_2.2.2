package web.models;

public class Car {
    private String model;

    private int price;

    private String series;

    public Car(String model, int price, String series) {
        this.model = model;
        this.price = price;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
