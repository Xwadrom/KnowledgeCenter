import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorRemoverException2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            if (name.equals("Kasia")) {
                namesIterator.remove();
            }
        }//Tym razem usuwamy element przy pomocy metody remove() iteratora, a nie kolekcji - problem zatem nie występuje.

    }
}
//Kiedy korzystać z iteratorów
//Z iteratorów korzystaj zawsze wtedy, kiedy chcesz przeglądać dowolną kolekcję. Nawet jeśli jest to lista udostępniająca metodę get(), to w przypadku listy wiązanej wykorzystanie iteratora może podnieść szybkość jej przeglądania. Dodatkowo preferuj pętlę for each zamiast tradycyjnej pętli for, wtedy wykorzystywany będzie iterator, pomimo że jawnie go nigdzie nie zapiszemy.
//
//Dodatkowo istnieje możliwość zdefiniowania swojego iteratora, co może być przydatne np. w klasach, w których przechowujemy kolekcje obiektów. Klasa taka powinna implementować wtedy interfejs Iterable, a klasę iteratora najwygodniej będzie zdefiniować jako klasę wewnętrzną.
//
//W Javie 8 wprowadzono istotne usprawnienia, takie jak strumienie i wyrażenia lambda, które sprawiają, że iteratory nie są już tak często potrzebne. Dowiesz się o nich więcej w kolejnych lekcjach.