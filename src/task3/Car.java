package task3;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
    }

    public Car(int year) { this.year = year; }

    public Car(double speed) { this.speed = speed; }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, int weight) {
        this.year = year;
        this.weight = weight;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(double speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, int weight, String color) {
        this.year = year;
        this.weight = weight;
        this.color = color;
    }

    public Car(int year, double speed, String color) {
        this.year = year;
        this.speed = speed;
        this.color = color;
    }

    public Car(double speed, int weight, String color) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
