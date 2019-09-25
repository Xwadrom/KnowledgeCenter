package DefaultMethods;
//Od Javy w wersji 8 wprowadzono tzw. metody domyślne (eng. default metods), które oznaczamy słowem kluczowym default. Są to metody, które nie są abstrakcyjne, a więc nie muszą być nadpisywane w klasach implementujących dany interfejs, a co najważniejsze mogą wykonywać pewne obliczenia.

public interface Vehicle {
    //Przykładowo mając interfejs Vehicle nie wiemy o ile przyspiesza samochód, czy samolot, ale możemy zaimplementować domyślną metodę speedUp(), która zwiększy prędkość o jedną jednostkę.
    default public int speedUp(int speed){
        return speed++;
    }

    //To co ważne, to fakt, że dodając metodę domyślną do interfejsu, nie "psujemy" reszty kodu, który z tego interfejsu korzysta.
    //
    //Możliwość taką wprowadzono ponieważ w innym przypadku nie dało się dodać do istniejących już w Javie interfejsów nowych metod bez niszczenia kompatybilności wstecznej. Przykładowo jeśli w naszym wcześniejszym przykładzie z kształtami dopisalibyśmy sobie dodatkową metodę w interfejsie Shape i metoda ta nie byłaby domyślna, to automatycznie nasz projekt przestanie się kompilować dopóki nie zaimplementujemy tych metod w klasach Rectangle i Circle.

}
