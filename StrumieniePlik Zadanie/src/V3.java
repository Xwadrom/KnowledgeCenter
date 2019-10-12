import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class LoremIpsum {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "loremipsum.txt";
        var reader = new BufferedReader(new FileReader(FILE_NAME));

        List<String> words = reader.lines()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());
// Metoda lines() zwraca listę wierszy tekstu. Mapujemy każdy wiersz na tablicę słów. Problem polega na tym, że teraz mamy strumień, w którym każdy element jest tablicą, a my chcemy strumień pojedynczych obiektów. Służy do tego metoda flatMap(). Wywołanie flatMap(Arrays::stream) przekształca więc Stream<String[]> na Stream<String>.

        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        System.out.println("Liczba wyrazów na 's': " + countSWords);
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);

        reader.close();
    }
}