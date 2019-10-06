import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class SortedReverse {
    public static void main(String[] args) {
        String fileName = "namespl.txt";
        TreeSet<Person> persons = new TreeSet<>();

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader)
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                persons.add(new Person(nextLine));
                lines++;
            }
//            for(Person temp:persons){
//                System.out.print(" " + temp);
//            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Pierwsza osoba w posortowanym zbiorze: " + persons.first());
        System.out.println("Ostatnia osoba w posortowanym zbiorze: " + persons.last());
        System.out.println("Wielkość zbioru imion po usunięciu duplikatów: " + persons.size());
    }
}
//Zadanie
//W załączonym pliku namespl.txt znajduje się lista imiona, każde w nowej linii. Problem w tym, że imiona się powtarzają, a my w programie będziemy potrzebowali jedynie unikalnej listy dostępnych imion. Dodatkowo chcielibyśmy, aby imiona były automatycznie posortowane w kolejności odwrotnej niż alfabetyczna.
//
//Po wybraniu odpowiedniego zbioru danych wyświetl na ekranie ilość imion w zbiorze, a także pierwszy i ostatni element.