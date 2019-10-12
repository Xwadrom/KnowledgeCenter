import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//Optional
//Dochodzimy więc do rozwiązania, które pojawiło się w Javie 8 - typu Optional. Jest to klasa, której obiekty mogą mieć jeden z dwóch stanów:
//
//obecny (istnieje),
//nieobecny (pusty).
//Odpowiada to naszym potrzebom, bo metoda findById() ma zwrócić obiekt jeśli ten istnieje lub pustą wartość w przypadku, gdy jest brak wyniku. W porównaniu do zwracania wartości null rozwiązanie to ma tę przewagę, że typ Optional wymaga jawnego rozpatrzenia sytuacji, gdy wartość jest pusta, nie da się tego pominąć.
//
//Optional jest typem generycznym, a obiekty tego typu możemy utworzyć przy pomocy jednej z trzech statycznych metod:
//
//of() - tworzy Optional na podstawie istniejącego obiektu, nie można do niej przekazać wartości null,
//ofNullable() - tworzy Optional na podstawie istniejącego obiektu, lub pusty Optional jeśli przekażemy wartość null,
//empty() - tworzy pusty Optional.
//Pierwszej używamy więc wtedy, gdy mamy gwarancję, że obiekt nie jest nullem, a dwóch pozostałych, gdy coś może nie istnieć. Przykłady:
//Person person = new Person(1, "Jan", "Kowalski");
//Optional<Person> personOptional = Optional.of(person);
//Optional<Object> empty = Optional.empty();

class PersonDatabase {
    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        if (person == null)
            throw new NullPointerException("Cannot add null reference");
        if (findById(person.getId()).isEmpty()) // było: if (findById(person.getId()) != null)
            throw new IllegalArgumentException("Object with such id already exists");
        people.add(person);
    }
//W naszym przypadku Optional możemy wykorzystać w metodzie findById(). Zmieńmy typ zwracany z Person na Optional<Person>.
    //Metoda findById() zwraca teraz pustą wartość Optional (empty) lub Optional z obiektem Person, jeśli taki istnieje. W pętli możemy skorzystać z metody of(), bo mamy gwarancję, że nasza lista nie przechowuje nulli. W metodzie add() zamiast porównywać teraz wynik metody findById() z nullem, wywołujemy metodę isEmpty(), która zwraca true, jeśli obiekt Optional jest pusty (metoda ta jest dostępna od Javy 11).

    public Optional<Person> findById(int id) { // było: public Person findById(int id)
        for (Person person : people) {
            if (person.getId() == id)
                return Optional.of(person);//było: return person;
        }
        return Optional.empty();//było: return null;
    }
    public String findLastNameById(int id) {
        return findById(id) // Optional<Person>
                .map(Person::getLastName) // Optional<String>
                .orElse("Anonim");
    }
}