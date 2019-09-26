package klasyWewnetrzne;

public class CarTest     {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.refuel(40);
        car.go();

//Jeżeli z jakiegoś powodu chcielibyśmy stworzyć instancję klasy Engine poza klasą KlasyWewnetrzne.Car, to możemy to zrobić w następujący sposób:
        Car.Engine engine = new Car().new Engine("Lamborghini");
    }
}
