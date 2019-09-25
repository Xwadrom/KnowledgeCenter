package Abstract;

import Abstract.Car;

public class CarApp {
    public static void main(String[] args) {
        //Błąd nie można tworzyć obiektów typów abstrakcyjnych
        //Vehicle vehicle1= new Vehicle()

        Vehicle car1=new Car();
        car1.speedUp();
        System.out.println(" Samochód jedzie z prędkością: "+car1.getSpeed());
    }
}
