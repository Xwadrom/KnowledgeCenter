public class Car {
    private static final double FUEL_CONSUMPTION = 8; //8l/100km
    private static final double MAX_FUEL = 50;
    private double fuel;

    public void refuel(double additionalFuel) {
        if(fuel+ additionalFuel >MAX_FUEL){
            System.out.println("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maxymalnie " + (MAX_FUEL - fuel));
        }
        else
        fuel += additionalFuel;
    }

    public void drive() {
        if(fuel - FUEL_CONSUMPTION<0){
            System.out.println("Masz za mało paliwa na podróż, zatankuj.");
        }
        fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Stan paliwa: " + fuel;
    }
}
//Rozwiązanie takie działa, ale z punktu widzenia użyteczności kodu wprowadza to dużo ograniczeń. Po pierwsze w projekcie powinniśmy się starać oddzielać od siebie klasy, które przechowują dane, tzw. klasy modelu danych, od klas, które realizują obliczenia, czy też powalają się komunikować z użytkownikiem. U nas klasa Car jest modelem danych, reprezentuje samochód i pozwala nim w pewien sposób sterować. Nie jest jej rolą to, żeby wyświetlać coś w konsoli, albo wczytywać dane od użytkownika. Nie powinny się w niej pojawiać wywołania metody System.out.println().
//
//Druga kwestia wymaga trochę wyobraźni. Na razie nasze aplikacji działają tylko w konsoli, ale wyobraź sobie, że teraz chcielibyśmy, żeby samochodem dało się sterować przy pomocy przycisków w jakimś graficznym interfejsie użytkownika. Nasza klasa w aktualnej formie będzie działała jedynie w aplikacjach konsolowych, jest mało uniwersalna i musielibyśmy ją tak naprawdę przepisać od nowa, żeby dostosować jej działanie do nowej aplikacji.
//
//Obie sytuacje, które próbujemy tutaj rozwiązać, czyli próba zatankowania zbyt dużej ilości paliwa, albo próba podróżowania, gdy nie mamy wystarczająco paliwa to sytuacje, które są niepoprawne i są swego rodzaju błędami. Tak samo jak np. próba odwołania się do dziesiątego elementu w tablicy, która ma ich tylko pięć. Oba problemy da się rozwiązać przy pomocy wyjątków. Musimy więc w naszym programie stworzyć wyjątek, który będzie można następnie obsłużyć. Jeśli ktoś będzie próbował jechać samochodem, który nie ma paliwa, to program zostanie przerwany.
//
//Wyjątki to w rzeczywistości obiekty, które rzucamy przy pomocy instrukcji throw. Działa to podobnie do zwracania obiektu poprzez instrukcję return jako wynik metody. Różnica polega na tym, że obiekt wyjątku możemy później złapać w bloku try-catch, a wartość zwróconą przez return przypisać np. do zmiennej.