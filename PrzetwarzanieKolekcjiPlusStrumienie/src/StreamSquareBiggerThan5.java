import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Metody filter(), map() i collect()
//Trzy powyżej wymienione metody są najczęściej wykorzystywane przy przetwarzaniu strumieni, więc musisz je zapamiętać. W klasach Stream istnieje także wiele metod dodatkowych, jednak raczej nie próbowałbym zapamiętać ich wszystkich, a zamiast tego raczej przeglądał listę w dokumentacji podczas rozwiązywania konkretnego problemu.
//
//Pamiętaj, że operując na strumieniu stworzonym na bazie kolekcji i wykonując na nim operacje filter() lub map() nie modyfikujesz faktycznej kolekcji. Zawsze na końcu należy wykonać metodę collect(), która pozwoli zwrócić w wyniku nową kolekcję, którą przypiszemy do jakiejś referencji. Metodzie collect() należy przekazać parametr w postaci obiektu Collecttor. Najlepiej skorzystać z klasy pomocniczej Collectors, która zwróci dla nas odpowiedni obiekt tego typu za pomocą jednej z metod:
//
//toList()
//toSet()
//toMap()
//lub jeśli potrzebujemy konkretnego typu kolekcji, skorzystaj z metody:
//
//collect.(Colectors.toCollection(TypKolekcji::new));

class StreamSquareBiggerThan5 {
    public static void main(String[] args) {

        Stream <Integer> numStream = Stream.iterate(0, x-> x+1);

        List <Integer> squareNumbers = numStream.map(x-> x*x).limit(100).collect(Collectors.toList());
        //Lista squareNumbers wygenerowana została na podstawie strumienia liczb całkowitych numStream. Wywołanie map(x -> x*x) powoduje podniesienie każdej liczby do kwadratu, a limit(100) ogranicza ilość liczb przetworzonych przez strumień do 100. Dalsze wartości nie są obliczane, bo strumienie są leniwe, czyli wykonują tak mało pracy jak to możliwe. Na końcu zwracamy listę za pomocą metody collect(), przekazując jej odpowiedni Collector.

        Set<Integer> biggerThan5 = squareNumbers.stream().filter(StreamSquareBiggerThan5::test).map(x->x/10).collect(Collectors.toCollection(TreeSet::new));
        //Kolejny zbiór liczb tworzymy na podstawie strumienia uzyskanego z wcześniej utworzonej listy (strumień operuje więc na 100 liczbach). Strumień filtrujemy i zostawiamy tylko liczby podzielne przez 10. Liczby, które go spełniają dzielimy przez 10 w metodzie map(). Tym razem posłużyliśmy się w metodzie collect() Collectorem zbierającym dane do konkretnego typu kolekcji (TreeSet). Zauważ, że strumień nie operuje na oryginalnych wartościach kolekcji, więc elementy listy podzielne przez 10 nadal mają wartości takie jak 100, 400, ... a w zbiorze te wartości wynoszą 10, 40, ...

        System.out.println("List: ");
        squareNumbers.forEach(x-> System.out.print(x+";"));
        System.out.println("\nSet ");
        biggerThan5.forEach(x-> System.out.print(x+";"));
    }

    private static boolean test(Integer x) {
        return x % 10 == 0;
    }
}
