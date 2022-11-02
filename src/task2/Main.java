package task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2021);
        Car car4 = new Car("Grey");
        Car car5 = new Car(2022, "Black");
        System.out.println(car2.year);
    }
}
