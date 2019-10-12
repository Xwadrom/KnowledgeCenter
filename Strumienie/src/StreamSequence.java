import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSequence {
    public static void main(String[] args) {
        //Strumień można stworzyć na podstawie danych, które wcześniej już istniały, ale nie były zgrupowane za pomocą kolekcji. Służy do tego metoda Stream.of(). Metoda przyjmuje argumenty w postaci varargs, więc może to być dowolna liczba obiektów wspólnego typu.
        //
        Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
//Jeżeli chcemy zmienić napisy, aby były zapisane kapitalikami, wykorzystajmy metodę klasy String toUpperCase() oraz metodą map() strumienia:
        strings.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList()); // = strings.map(x-> x.toUpperCase());
        //Metoda map() powoduje tranformację każdego elementu strumienia z wykorzystaniem przekazanej jako argument funkcji. W naszym przypadku na kazdym elemencie zostanie wywołana metoda toUpperCase() i wynikowy obiekt String zastąpi w strumieniu ten już istniejący.
        //Dobrze byłoby teraz wyświetlić, czy faktycznie coś się stało, użyjmy w tym celu metody peek(), która nie modyfikuje strumienia, tylko przechodzi przez każdy jego element i w wyniku zwraca ten sam strumień
        //Ponieważ strumień jest leniwy, to na razie nic się nie stanie, ponieważ ani metoda map() ani peek() nie są metodami terminalnymi.
        //przypiszmy do listy stan strumienia wykorzystując znaną nam już metodę collect()
        //Tym razem na ekranie pojawiają się nasze napisy zapisane kapitalikami, ponieważ metoda collect() jest metodą terminalną.


    }
}
