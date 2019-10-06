import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IteratorTask {

    public static void main(String[] args) {
        Map<String, Person> persons=new TreeMap<>();

        persons.put("osuch", new Person("Robert", "Osuch", 36));
        persons.put("mazur", new Person("Piotr", "Mazur", 25));
        persons.put("nowak", new Person("Adam", "Nowak", 45));
        persons.put("kowalski", new Person("Daniel", "Kowalski", 39));


        Iterator<String> personIterator = persons.keySet().iterator();
        while(personIterator.hasNext()){
            String currentKey = personIterator.next();
            System.out.println(persons.get(currentKey));
        }
        System.out.println(persons.values().iterator());
    }
}
//Zadanie
//Napisz program, w którym w mapie zapamiętasz informacje o imieniu, nazwisku i wieku kilku osób. Kluczami powinny być nazwiska tych osób.
//
//Za pomocą iteratora i pętli while wyświetl wszystkie dostępne w mapie wartości. Powinny być one posortowane alfabetycznie według nazwisk. Dane nie muszą być wczytywane od użytkownika, możesz je wprowadzić bezpośrednio w kodzie, jednak nie mogą być one dodawane w kolejności alfabetycznej.
//
//
//Podpowiedź
//Do przechowywania informacji o osobach możesz wykorzystać po prostu String lub zdefiniować dodatkową klasę Person. Wykorzystaj implementację mapy, która gwarantuje sortowanie na podstawie kluczy.