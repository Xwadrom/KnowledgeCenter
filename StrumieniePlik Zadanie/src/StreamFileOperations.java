import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileOperations {

    static String lorem="";
    static int count = 0;

    public static void main(String[] args){
        String fileName = "loremipsum-129.txt";
        List<Integer> wordsWith5Letters = new ArrayList<>();

        try (var fileReader = new FileReader(fileName); var reader = new BufferedReader(fileReader)) {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                lorem=lorem+nextLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> words = Arrays.asList(lorem.split(" "));
        Stream<String> wordsToFilter=words.stream();

        List<String> filteredDotCommaAndS = wordsToFilter
                .map(x->x.replaceAll(",|\\.","")) // użyłem wyrażenie regularne
//                .map(x->x.replace(".","")) więc nie potrzeba drugiej podmiany, bo można zawrzeć jaw jednej lini.
                .filter(x-> x.startsWith("s"))
                .collect(Collectors.toList());
        System.out.println("Lista słów zaczynających się a S: ");
        filteredDotCommaAndS.forEach(x-> System.out.print(x+" "));
        System.out.println();
        LetterWordsCounter(wordsWith5Letters, filteredDotCommaAndS);

    }

    static void LetterWordsCounter(List<Integer> wordsWith5Letters, List<String> filteredDotComma) {
        for (String tmp:filteredDotComma){
                    if(tmp.length()==5){
                        wordsWith5Letters.add(1);
                    }
                }
        System.out.println("Liczba słów posiadających 5 znaków to: " + wordsWith5Letters.size());
    }

}
//Zadanie
//W załączniku znajduje się plik z tekstem lorem ipsum. Wczytaj wszystkie słowa osobno do listy słów, a następnie wykorzystując strumienie:
//
//usuń wszystkie przecinki i kropki doklejone do słów,
//wyświetl liczbę słów rozpoczynających się literą "s" oraz ile słów składa się z 5 znaków.