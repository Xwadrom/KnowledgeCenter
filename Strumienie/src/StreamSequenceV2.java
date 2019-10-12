import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSequenceV2 {
    public static void main(String[] args) {
        //Metodę peek() możemy wplatać pomiędzy wywołania dowolnych metod wywoływanych na strumieniu i podglądać jak zmieniają się obiekty, np.:
        Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
        List<String> stringList = strings.peek(x -> System.out.println(x+"-")) //przed zmianą
                .map(String::toUpperCase)
                .peek(System.out::println) //po zmianie
                .collect(Collectors.toList());

        //Zauważ, że elementy strumienia przetwarzane są sekwencyjnie, tak jakbyśmy wykonywali jakieś czynności na każdym kolejnym obiekcie po kolei w pętli.

        Stream.of("one", "two", "three", "four")
                         .filter(StreamSequenceV2::test)//liczba liter wieksza od 3
                         .peek(e -> System.out.println("Filtered value: " + e))
                         .map(String::toUpperCase)
                         .peek(e -> System.out.println("Mapped value: " + e))
                         .collect(Collectors.toList());
    }

    private static boolean test(String e) {
        return e.length() > 3;
    }
}
