package pl.javastart.logic;

import pl.javastart.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2311, "Audi", "A5", "Czarne");
        Car audiA4 = new Car(2015, "Audi", "A4");
        //w międzyczasie klient wybiera kolor:
        audiA4.setColor("Czerwony");
        audiA4.setYear(-1000);

        System.out.println(audiA4.getBrand() + " " + audiA4.getModel() + " " + audiA4.getYear() + " " + audiA4.getColor());
        System.out.println(audiA5.getBrand() + " " + audiA5.getModel() + " " + audiA5.getYear() + " " + audiA5.getColor());
    }
}

//Podsumowanie
//        Pakiety pozwalają na wygodną organizację klas. Za pomocą słowa package wskazujemy w jakim pakiecie znajduje się klasa, a za pomocą słowa import wskazujemy klasę z innego pakietu, którą będziemy wykorzystywali.
//public mówi o tym, że do klasy lub jej składowej można się odwoływać ze wszystkich pakietów.
//protected i default ograniczają dostęp do danej klasy lub jej składowych do pakietu, w którym ta klasa się znajduje.
//private ogranicza dostęp do składowych klasy tylko do tej konkretnej klasy.
//        słowa protected i private nie mogą być stosowane w stosunku do klas (chyba, że będą to klasy wewnętrzne).