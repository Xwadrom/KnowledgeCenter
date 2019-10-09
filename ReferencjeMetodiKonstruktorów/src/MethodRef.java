import java.util.Arrays;
import java.util.function.Consumer;
//Referencje metod bywają przydatne do zastąpienia oczywistych partii kodu. Przykładowo poniższe zapisy są sobie równoznaczne:
//
//consumeList(persons, p -> System.out.println(p));
//consumeList(persons, System.out::println);
//Z kontekstu oczywiste jest wywnioskowanie, że metoda println() posiada przeciążoną wersję, która przyjmuje typ Object (obiekt typu Person dziedziczy po Object, więc spełnia kryterium). Nie jest potrzebne jawne pokazywanie argumentu(ów) funkcji.
//Analogicznie tworzenie obiektu możemy zastąpić używając referencji do konstruktorów:
//
//generate(persons, 10, () -> new Person());
//generate(persons, 10, Person::new);

//Dobrym przykładem jest na możliwość przekazywania referencji do metod jest interfejs Comparator, który poznaliśmy nieco wcześniej. Definiował on tylko jedną metodę abstrakcyjną compare(), która porównuje dwa parametry, a więc Comparator jest interfejsem funkcyjnym i w miejsce argumentu tego typu można przekazać wyrażenie lambda.
//
//Mając listę nazwisk przechowywaną w tablicy, możemy wykorzystać np. metodę Arrays.sort() do posortowania list według różnych kryteriów:

class MethodRef {
    public static void main(String[] args) {
        String[] names = { "Kowalski", "Abacki", "Wojnarek", "Bednarek", "Krzywousty" };
        Arrays.sort(names, MethodRef::sortAscending);//wyrażenie (t1, t2) -> sortAscending(t1, t2) zastąpione  MethodRef::sortAscending
        consumeArray(names, System.out::println);// było x -> System.out.println(x)

        System.out.println(">>>");
        Arrays.sort(names, MethodRef::sortDescending);
        consumeArray(names, System.out::println);
    }

    private static <T> void consumeArray(T[] arr, Consumer<T> consumer) {
        for (T t : arr) {
            consumer.accept(t);
        }
    }

    private static int sortAscending(String t1, String t2) {
        return t1.compareTo(t2);
    }

    private static int sortDescending(String t1, String t2) {
        return t2.compareTo(t1);
    }
}

//Do tej pory, gdy chcieliśmy posortować, czy to tablicę, czy listę, konieczne było definiowanie klasy komparatora albo poprzez klasę wewnętrzną, albo anonimową, a później tworzenie jego obiektu i przekazanie go jako argumentu. Wykorzystując możliwości programowania funkcyjnego i przekazywania referencji do metod, nie jest to już konieczne. Metody sortAscending() i sortDescending() spełniają sygnaturę metody compare() z interfejsu Comparator, cyli przyjmują dwa parametry dowolnego typu T i zwracają wartość typu int (dodatnią, zero lub ujemną), Wszędzie tam, gdzie metody oczekują więc argumentu typu Comparator możemy przekazać referencję do jednej z tych dwóch metod.