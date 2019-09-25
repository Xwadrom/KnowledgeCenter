package Interface.Wielodziedziczenie;

public class Amphibia implements Car,Boat {
    //Problem pojawia się od Javy 8, która za pomocą interfejsów i metod domyślnych daje teoretyczną możliwość wielodziedziczenia. Załóżmy, że mamy interfejsy Car i Boat (łódź) z metodą domyślną o takiej samej sygnaturze. Teraz tworząc klasę implementującą dwa powyższe interfejsy doprowadzamy do konfliktu, ponieważ kompilator nie wie, którą z metod printName() wybrać do dziedziczenia:

    @Override
    public void printName() {//Problem można jednak rozwiązać dzięki nadpisaniu problematycznej metody.

//Ostatnim istotnym elementem, który może być przydatny w kontekście metod domyślnych jest odwołanie się do konkretnej implementacji. Czyli w jaki sposób wywołać metodę printName() z klasy Boat lub Car w klasie Amphibia. Otóż możemy to zrobić przez zapis:
        System.out.print("Amfibia to trochę ");
        Car.super.printName();
        System.out.print(" a trochę ");
        Boat.super.printName();
//
    }
}
