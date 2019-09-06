public class Car {
    int year;
    String brand;
    String model;
    String color;



    Car(int y, String b, String m, String c){ // w ramach jednej klasy można zdefiniowac wiele konstruktorów
//        year=y;
//        brand=b;
//        model=m;
        this (y,b,m); // trzy powyższe linie kodu mozemy zapisac za pomocą funkcji this - wywołanie parametrów z innego
        // konstruktora w tym przypadku akurat z tego na dole bo ma mniej parametrów
        this.color=c;
        System.out.println("Konstruktor 1");
    }

    Car(int year, String brand, String model){ //nowy typ konstruktora bez pola color
//        year=y;
//        brand=b;
//        model=m;
        this.year=year; // this.year odwolanie sie do składowej klasy bo nie moze byc year=year
        this.brand=brand; // przez referencje this odwołujemy się do pola brand w obiekcie np. (new Car ()) i do niego przypisujemy np. BMW
        this.model=model;
        System.out.println("Konstruktor 2");
    }

    Car(){  // daje nam mozliwosc przypisania konstruktora bez parametrów Car car3= new Car();


}
}
//Jeżeli w ramach jednej klasy definiujemy metody o takiej samej nazwie, to muszą one mieć inną liczbę parametrów lub typy tych parametrów muszą być różne.
//Jeżeli w klasie istnieje kilka konstruktorów, to mówimy, że są one przeciążone. Konstruktory takie muszą się różnić liczbą parametrów lub w przypadku takiej samej liczby parametrów ich typy muszą być różne.