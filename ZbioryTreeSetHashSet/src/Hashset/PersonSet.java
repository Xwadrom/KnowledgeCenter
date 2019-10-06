package Hashset;

import java.util.HashSet;

public class PersonSet {
    public static void main(String[] args) {
        HashSet<Person> persons =new HashSet<>();

        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Ania", "Smolna"));
        persons.add(new Person("Ania", "Smolna"));
        persons.add(new Person("Szymon", "Zalewski"));

        System.out.println("Persons.size() " + persons.size());
        System.out.println("contains Jan Kowalski? " + persons.contains(new Person("Jan","Kowalski")));
        persons.remove(new Person("Ania", "Kawalec"));//Zauważ jedną ważną rzecz. Przy usuwaniu obiektów w metodzie remove() przekazujemy tak naprawdę inny obiekt niż ten, który przechowujemy w kolekcji (przy każdej kreacji obiektu użyliśmy słowa new, więc ich porównanie za pomocą operatora == zwróciłoby false), jednak obiekt zostaje usunięty, ponieważ metoda equals() zaimplementowana w klasie Person zwróciła true.
        System.out.println("Persons.size() " + persons.size());
    }
    //LinkedHashSet
    //LinkedHashSet jest zbiorem bardzo podobnym do HashSet, jednak dzięki dodatkowej wewnętrznej reprezentacji w postaci listy wiązanej, dodając kolejne elementy do zbioru uzyskujemy pewność, że w tej samej kolejności będziemy mogli po nich iterować. W przypadku zwykłego HashSet iteracja odbywa się w przypadkowej kolejności. Tak samo jako w pozostałych zbiorach, do iteracji trzeba jednak wykorzystać iterator lub pętlę for each.
}
