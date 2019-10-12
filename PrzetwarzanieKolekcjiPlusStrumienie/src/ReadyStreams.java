import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReadyStreams {
    //Do generowania liczb wykorzystujemy metodę iterate(), jednak ponieważ w programowaniu często istnieje potrzeba operowania na strumieniach liczb, to w Javie 8 zdefiniowano gotowe klasy strumieni liczbowych takie jak:
    //
    //IntStream
    //LongStream
    //DoubleStream
    //Nazwy wskazują, na jakich wartościach możemy na nich operować. Dodatkowo klasa String implementując interfejs CharSequence pozwala przekształcić dowolny napis w strumień wartości Integer. Przypomnijmy, że znaki typu char mogą być również reprezentowane w postaci odpowiadających im kodów w tabeli Unicodu, czyli po prostu liczb całkowitych. W celu przekształcenia napisu na strumień skorzystaj z metody:
    //
    //"dowolnyString".chars()
    static final int  DIVIDER = 10;
    public static void main(String[] args) {
        List<Integer> squareNumbers = IntStream.range(0,100)
                            .map(ReadyStreams::square)
                            .boxed()
                            .collect(Collectors.toList());
        //metoda range(0, 100) generuje dla nas liczby od 0 do 99, które później podnosimy do kwadratu. Jeżeli chcemy przekształcić strumień IntStream w typ Stream<Integer> należy wywołać metodę boxed() a wtedy przerobić ją na listę.

        Set<Integer> biggerThan5 = squareNumbers
                            .stream()
                            .filter(ReadyStreams::moduloTen)
                            .map(ReadyStreams::dividedByTen)
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
