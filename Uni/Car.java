package Uni;

public class Car {
    String model;

    public Car(String m) {
        model = m;
    }

    public static void main(String[] args) {
        Car c = new Car("Benz");
        System.out.println(c.model);
    }
}
