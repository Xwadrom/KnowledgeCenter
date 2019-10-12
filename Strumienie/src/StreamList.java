import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //numbers = numbers.stream().filter(x->x%2==0 && x>5).collect(Collectors.toList());// Metoda collect() zbiera elementy strumienia i tworzy na ich podstawie kolekcję, dzieje się tak przy użyciu interfejsu Collector: CCollector.java. W klasie Collectors zdefiniowane są metody, które dostarczają implementację tego interfejsu, pozwalając przekształcić strumień na listę, czy zbiór. My przekształcamy strumień na listę, stąd uzycie metody Collectors.toList(). Jeżeli chcemy zwrócić kolekcję konkretnego typu możemy posłużyć się ogólniejszą metodą toCollection() i przekazać jej jako argument referencję na kontruktor kolekcji:
        numbers = numbers.stream().filter(x-> x%2==0 && x>5).collect(Collectors.toCollection(ArrayList::new)); // referencja na konstruktor kolekcji, może być też zapisana ()->new ArrayList<>()
//co jest równoznaczne z:
//        ArrayList<Integer> integers = new ArrayList<>();
//        for (Integer x : numbers) {
//            if (x % 2 == 0 && x > 5) {
//                integers.add(x);
//            }
//        }
//        numbers = integers;

        //Metoda collect() jest metodą terminalną, więc tak naprawdę to dopiero ona powoduje, że wcześniejsza metoda filter() zostanie uruchomiona.
        numbers.forEach(System.out::println);
    }
    static void accept(Integer tmp) {
        tmp.compareTo(tmp);
        System.out.println(tmp);
    }
}
//Na ekranie pojawia się wydruk z liczbami 6, 8, 10, więc widać, jak łatwo przefiltrowaliśmy listę. Moglibyśmy zrobić to samo bez przekształcania strumienia na kolekcję, wywołując metodę forEach() po prostu na strumieniu:
//
//public static void main(String[] args) {
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//    numbers.stream()
//                    .filter(x -> x%2 == 0 && x>5)
//                    .forEach(System.out::println);

//Wynik będzie identyczny.