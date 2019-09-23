public class CarDrive {
    public static void main(String[] args) {
        Car car= new Car();
        car.refuel(100);
        System.out.println(car);

        car.drive();
        System.out.println(car);
    }
}
