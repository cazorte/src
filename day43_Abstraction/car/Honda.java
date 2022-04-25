package day43_Abstraction.car;

public final class Honda extends Car{


    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }
}
