package task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
    }

    public Car(double speed) { this.speed = speed; }

    public Car(int year, double speed) {
        this(speed);
        this.year = year;

    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
}
