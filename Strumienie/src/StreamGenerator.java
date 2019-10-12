import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGenerator {
    //Trzecim sposobem na stworzenie strumienia jest napisanie generatora takiego strumienia. Najłatwiej jest go stworzyć wykorzystując metodę iterate() klasy Stream. Jako pierwszy argument przyjmuje ona wartość początkową strumienia, a jako drugi parametr funkcję zgodną z interfejsem UnaryOperator (funkcja przyjmuje wartość typu T i zwraca element tego samego typu). Łatwo sobie to wyobrazić jako potencjalnie nieskończoną metodę rekurencyjną.
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x+1);//Powyższy zapis oznacza "stwórz strumień zaczynając od 0, a każdy element powinien być zgodny z przekazaną funkcją, czyli kolejne wartości powinny być większe o 1 od poprzedniej".

       // Dzięki takiemu strumieniowi w prosty sposób możemy wygenerować sobie dowolną listę według konkretnego kryterium, np.:
        // lista 100 pierwszych liczb podzielnych przez 2
        List<Integer> numbers = numStream.filter( x-> x%2==0).limit(50).peek(System.out::println).collect(Collectors.toList());
        numbers.forEach(x-> System.out.print(x+";"));
        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = numStream.map(x -> x*x).limit(50).peek(System.out::println).collect(Collectors.toList());
        // lista 100 liczb ujemnych w kolejności malejącej
        List<Integer> negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());
    }
}
