package ConstructorReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class PersonsGenerator {
    public static void main(String[] args) {
        List<Person> persons = generate(10, Person::new);//można rozbić na dwa etapy: Supplier<Person>      personConstructor = Person::new;
//      List<Person> persons = generate(10, personConstructor);
//      Co odpowiada wersji z wyrażeniem lambda:
//
//      Supplier<Person> personConstructor = () -> new Person();
//      List<Person> persons = generate(10, personConstructor);
        persons.forEach(System.out::println);
    }

    private static <T> List<T> generate(int num, Supplier<T> sup) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < num; i++) {
            result.add(sup.get());
        }
        return result;
    }
}
//Ponownie przykład może wydawać ci się mało sensowny, bo przecież to samo można zrobić za pomocą jednej pętli, jednak spójrz na to szerzej i zauważ, że korzystając z metody generate() dokładnie w takiej formie możesz wygenerować w prosty sposób listę obiektów dowolnego typu przekazując jedynie wielkość listy oraz referencję do konstruktora klasy.
//
//Zwróc też uwagę na metodę forEach() dodaną do interfejsu Iterable w Javie 8. Dzięki niej możemy wyświetlić obiekty w kolekcji zapisując tylko jedną linijkę, jest to jeszcze prostsze niż pętla for each.
//
//Korzystanie z referencji do konstruktora jest możliwe, ponieważ każdy konstruktor bezparametrowy spełnia tak naprawdę sygnaturę metody get() z interfejsu Supplier.