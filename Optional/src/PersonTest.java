import java.util.Optional;

class PersonTest {
    //W klasie z metodą main() będzie teraz inaczej wyglądało wywołanie metod wyświetlających informacje o osobach.
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        Optional<Person> personOpt1= db.findById(2); // Karol Zawadzki
        Optional<Person> personOpt2= db.findById(55); // Null

//        Person person1 = db.findById(2); // Karol Zawadzki
//        Person personNull = db.findById(55); // null

        personOpt1.ifPresent(p -> System.out.println(p.getLastName())); //Metoda ifPresent() wykonuje przekazaną jej jako argument funkcję tylko wtedy, gdy obiekt istnieje. Jest to odpowiednik takiego zapisu:

//        if(personOpt1.isPresent()) {
//            System.out.println(personOpt1.get().getLastName());
//        }

        personOpt2.ifPresent(p -> System.out.println(p.getLastName()));
        personOpt2.ifPresentOrElse(
                p -> System.out.println(p.getLastName()),
                () -> System.out.println("Brak obiektu o wskazanym id")
        );
    }
}
//Metoda isPresent() zwraca true, jeśli Optional nie jest pusty lub false w innym przypadku. Na obiektach Optional praktycznie nigdy nie powinno być potrzeby wywoływania metody get(), ale jeśli nie widzisz innego rozwiązania, to zawsze poprzedź to ifem jak w powyższym przykładzie. Metoda get() rzuca wyjątek NoSuchElementException jeśli Optional jest pusty. Jeden z architektów Javy, Brian Goetz, często podkreśla na konferencjach, że metoda get() powinna nazywać się getOrThrowSomethingTerrible(), żeby ludzie z niej nie korzystali, albo jeśli chcą z niej korzystać, to żeby pamiętali o dodaniu wspomnianego ifa.
//Metoda ifPresentOrElse() to z kolei odpowiednik konstrukcji if else i pozwala wykonać pewną czynność, zdefiniowaną jako drugą funkcję, w przypadku gdy Optional będzie pusty. Jest to odpowiednik takiego kodu:
//
//if(personOpt2.isPresent()) {
//    System.out.println(personOpt2.get().getLastName());
//} else {
//    System.out.println("Brak obiektu o wskazanym id");
//}
//To co jest najważniejsze w naszym nowym rozwiązaniu, to fakt, że referencje personOpt1 oraz personOpt2 mogą być pustymi wartościami, ale zignorowanie tego faktu musi być już bardzo świadome. Dodatkowo Optional dzięki swojej budowie zachęca do pisania zwięzłego i czytelnego kodu. Moglibyśmy nasz przykład zapisać w ten sposób:
//
//db.findById(2).ifPresent(p -> System.out.println(p.getLastName()));