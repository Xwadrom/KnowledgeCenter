import java.util.ArrayList;
import java.util.Arrays;

public class Lists   {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(2);
        ints.add(3);
        System.out.println(ints.isEmpty());
        System.out.println(ints.get(0));
        System.out.println(ints.get(1));
        System.out.println(ints.size());

        for(int i = 0; i<100; i++){
            ints.add(i);
        }
        System.out.println(ints.size());

        System.out.println("Czyszczę tablice: ");
        ints.clear();
        System.out.println(ints.size());

    }
}
//Dużą różnicą w porównaniu do tablicy jest też fakt, że lista tablicowa nie jest traktowana w żaden specjalny sposób, jest po prostu zwykłym obiektem klasy ArrayList. Jeżeli więc chcemy dodać jakiś element lub się do niego odwołać, musimy korzystać z metod, a nie korzystać z jakiejś nowej notacji z użyciem kwadratowych nawiasów. Najważniejsze z metod w tej klasie to:
//
//add(E e) - dodaje element zgodny z zadeklarowanym typem generycznym do kolekcji. Pozwala na dodawanie wartości null oraz powtarzających się elementów,
//addAll(Collection c) - dodaje wszystkie elementy z innej kolekcji do listy (kopie referencji),
//clear() - usuwa wszystkie elementy z listy,
//get(int index) - zwraca element pod podanym indeksem. Podobnie jak przy tablicach indeksowanie jest od 0. Metoda może generować wyjątek ArrayIndexOutOfBoundsException,
//remove(int index) - usuwa element z indeksu podanego jako parametr,
//remove(Object o) - usuwa pierwsze wystąpienie obiektu, dla którego metoda equals() zwróci true,
//sort(Comparator c) - sortuje listę zgodnie z przekazanym komparatorem,
//size() - zwraca rozmiar listy. Działanie analogiczne do właściwości length tablicy,
//(pełną listę metod znajdziesz w dokumentacji)