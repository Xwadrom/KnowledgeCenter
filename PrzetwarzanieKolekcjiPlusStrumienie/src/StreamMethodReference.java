import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodReference {
// W wielu sytuacjach będzie się zdarzało, że warunki filtrowania, czy mapowania strumienia będą powtarzalne. Zapisywanie więc wszędzie tego samego, np. filter(x -> x%5==0) byłoby stratą czasu i jakakolwiek zmiana wymagałaby poprawek w wielu miejscach kodu. Jeszcze gorzej sytuacja będzie wyglądała, gdy będziemy operowali na obiektach i będziemy odwoływali się do ich metod, bo wtedy warunki przestaną być czytelne.
    private static final int DIVIDER = 10;

    public static void main(String[] args) {

        Stream<Integer> numStream = Stream.iterate(0, x-> x+1 );

        List<Integer> squareNumbers = numStream.map(StreamMethodReference::square)
                                      .limit(100)
                                      .collect(Collectors.toList());

                Set<Integer> biggerThan5 = squareNumbers.stream()
                                   .filter(StreamMethodReference::moduloTen)
                                   .map(StreamMethodReference::dividedByTen)
                                   .collect(Collectors.toCollection(TreeSet<Integer>::new));
        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + " ; "));
    }

    private static Integer square(Integer x) {
        return x * x;
    }

    private static boolean moduloTen(Integer x) {
        return x % DIVIDER == 0;
    }

    private static Integer dividedByTen(Integer x) {
        return x / DIVIDER;
    }
}
//Korzystanie z referencji do metod pozwoli ci pisać kod, który możesz wykorzystywać wielokrotnie.