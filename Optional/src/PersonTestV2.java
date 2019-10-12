import java.util.Optional;
//Wykonanie akcji na obiekcie nie wymaga przypisywania go do osobnej zmiennej. Jeśli jakaś czynność się powtarza, to można ją także wydzielić do osobnej metody i skorzystać z referencji do niej:
class PersonTestV2 {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(5, "Jan", "Kowalski"));
        db.add(new Person(6, "Karol", "Zawadzki"));
        db.add(new Person(7, "Bartosz", "Abacki"));
        db.add(new Person(8, "Ania", "Walczak"));

        db.findById(5).ifPresent(PersonTestV2::printLastName);
        Optional<Person> optPerson = db.findById(55);

        optPerson.ifPresent(PersonTestV2::printLastName);
        optPerson.ifPresentOrElse(
                PersonTestV2::printLastName,
                () -> System.out.println("Brak obiektu o wskazanym id")
        );
//Typ Optional zachęca więc do korzystania z wyrażeń lambda i współczesnego podejścia do pisania kodu w Javie.
    }
    private static void printLastName(Person person) {
        System.out.println(person.getLastName());
    }
}
//Dobre praktyki
//Sprawne korzystanie z typu Optional wymaga dużo praktyki i konsekwencji, jednak jest kilka prostych reguł, które warto przestrzegać od samego początku.
//
//Używaj typu Optional tylko jako typu zwracanego w metodach, w których istnieje potrzeba reprezentacji przypadku pustej wartości. Unikaj jego używania do definiowania zmiennych, pól klasy, czy parametrów metod / konstruktorów.
//Unikaj definiowania zmiennych Optional w celu zastąpienia instrukcji if else.
//Nigdy nie wywołuj metody get() bez wcześniejszego sprawdzenia, czy obiekt jest obecny przy pomocy metody isPresent(). Staraj się unikać sytuacji, gdy wywoływanie metody get() jest konieczne i preferuj w to miejsce np. metodę orElse() i podobne.