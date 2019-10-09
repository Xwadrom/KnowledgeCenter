import java.util.*;

public class CollectionOperation {
    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";
        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println("Lista oryginalna: ");
        printCollection(words);

        //wymieszanie słów
        Collections.shuffle(words);
        System.out.println("Lista shuffle: ");
        printCollection(words);


        //sortowanie
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista sort: ");
        printCollection(words);//Z najciekawszych rzeczy w powyższym kodzie warto zwrócić uwagę na to, że przy sortowaniu Stringów uwzględniany jest porządek nie alfabetyczny, ale zgodny z kodami liter w Unicode. Dlatego niezbędne jest wykorzystanie komparatora, który jest przypisany do stałej String.CASE_INSENSITIVE_ORDER, który porównuje kolejność znaków ignorując wielkość liter.

        //wyszukiwanie binarne
        int position=Collections.binarySearch(words, "drukarki");
        System.out.println("Słowo\"drukarki\" jest w liście na " +position+" miejscu.");

        //ilość wystąpień
        int freq = Collections.frequency(words,"Strona");
        System.out.println("Słowo \"Strona\" występuje na liście " +freq+" razy.");

        //najmniejszy element w liście
        System.out.println("Najmniejszy element w liście to: " + Collections.min(words));
    }

    private static void printCollection(Collection<String> collection) {
        for (String s : collection) {
            System.out.println(s + ";");
        }
    }
}
