import java.util.Objects;

public class Person {

    public Person(){

    }

    private String firstName;
    private String lastName;
    private String PESEL;

    public Person(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PESEL = PESEL;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(PESEL, person.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, PESEL);
    }
}
//Zadanie
//Napisz program, w którym zaimplementujesz funkcjonalność zgodną z poniższym opisem.
//
//Klasa Person przechowuje informacje pozwalające zidentyfikować osobę poprzez imię, nazwisko oraz PESEL. Każde z tych pól powinno być reprezentowane przez wartość typu String, a klasa powinna mieć zdefiniowane także metody equals() i toString() oraz konstruktor pozwalający ustawić wszystkie pola.
//
//Klasa PersonDatabase reprezentuje prostą bazę danych służącą do przechowywania informacji o osobach. Powinna przechowywać informacje w tablicy typu Person[] i posiadać metody:
//
//add(Person p) - dodaje nową osobę na pierwsze, wolne miejsce w tablicy. W przypadku, gdy wszystkie elementy tablicy są zapełnione, tablica powinna powiększyć swój rozmiar dwukrotnie
//remove(Person p) - usuwa z tablicy osobę, przekazaną jako parametr (dla której metoda equals() zwróci true). Puste miejsce powinno być "usunięte" poprzez przesunięcie wszystkich elementów tablicy o indeksach większych o jedno miejsce wstecz
//get(int index) - zwraca element tablicy o indeksie podanym jako parametr
//size() - zwraca ilość aktualnie przechowywanych elementów w tablicy (nie liczy wartości null)
//Początkowy rozmiar tablicy w klasie PersonDatabase powinien wynosić 1. W powyższych metodach wykorzystaj klasę Arrays z pakietu java.utils, którą poznałeś w tej lekcji.
//
//Przetestuj działanie klasy PersonDatabase dodając do niej kilka elementów, po czym wyświetlisz o nich informacje (łącznie z rozmiarem), a następnie wyświetlisz informacje ponownie, ale po usunięciu jednego z elementów. Dane mogą być zdefiniowane bezpośrednio w kodzie programu, nie muszą być odbierane od użytkownika.