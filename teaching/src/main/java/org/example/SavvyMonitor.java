package org.example;

public class SavvyMonitor {

    //Attributes or fields
    private String color;
    private int size;
    private int numberOfPorts;
    private int price;
    private String manufacturer;
    private int volume;

    //constructor

    public SavvyMonitor(String color, int size, int numberOfPorts, int price, String manufacturer, int volume) {
        this.color = color;
        this.size = size;
        this.numberOfPorts = numberOfPorts;
        this.price = price;
        this.manufacturer = manufacturer;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SavvyMonitor{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", numberOfPorts=" + numberOfPorts +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", volume=" + volume +
                '}';
    }

    //Methods
    public void display() {
        System.out.println("Hello, world. This monitor belongs to Savvy and it works");
    }

    public int increaseVolume(){
        return volume++;
    }

    public int decreaseVolume(){
        return volume--;
    }
}
