package lesson34;

public class DI_test {
    public static void main(String[] args) {

        DieselEngine dieselEngine = new DieselEngine();
        ElectricalEngine electricalEngine = new ElectricalEngine();

        Car car = new Car("BMW", "X5",dieselEngine );
        car.start();
    }
}
