public class car2Test {
    public static void main(String[] args) {
        Car car1 = new Car ();// NazwaTypu nazwaZmiennej = new NazwaTypu();
        Car car2 = new Car ();//car1 i car2 sa referencjami na dwa różne obiekty przy czym car1.model itd. nie zostały jeszcze zdefiniowanw
        // , wiec wynik car1Info bedzie zwracal wartosci domysle null dla car1.model car1.Color car2.Tires
        car1.brand="Audi";//nazwaZmiennej.poleObiektu = nowaWartosc;
        car2.model="A4";
        car2.carColor="Czarny";
        car1.wheelsColor="Srebrny";
        car2.tiresColor="Czarny";
        car1.doors=5;
        String car1Info = car1.brand + "' " + car1.model + "' "+ car1.carColor+ "' "+
                car1.wheelsColor+ "' "+car1.tiresColor+ "' "+ car1.doors;
        System.out.println(car1Info);
    }
}
