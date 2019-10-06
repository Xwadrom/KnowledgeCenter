package Hashset;

import java.util.Objects;

//HashSet jest zbiorem nieuporządkowanym i nieposortowanym, nie posiada też nawet specjalnych metod takich jak first(), czy last(), bo nie mamy żadnej gwarancji co do kolejności w jakiej przechowywane są obiekty. Jedyną, ale dużą jego zaletą jest to, że operacje dodawania, usuwania i wyszukiwania są w niej bardzo szybkie. Zbiór typu HashSet pozwala także w odróżnieniu od TreeSet na umieszczenie wartości null.
//HashSet jak sama nazwa wskazuje korzysta pod spodem z tablic mieszających (haszowanych), a one wymagają do poprawnego, wydajnego działania metody hashCode(). To między innymi tutaj wymagane jest spełnienie kontraktu pomiędzy metodami equals() i hashCode(), który dla przypomnienia mówi o tym, że jeśli metoda equals() dla dwóch obiektów zwraca true, to metoda hashCode() wywołana na tych obiektach powinna zwrócić identyczną wartość. Jeżeli kontrakt ten nie będzie spełniony, to HashSet może nie działać poprawnie i np. dopuszczać do przechowywania duplikatów.
//Stwórzmy klasę Person z metodami equals() i hashCode(), a następnie przetestujmy dodawanie kilku obiektów do zbioru typu HashSet.
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
