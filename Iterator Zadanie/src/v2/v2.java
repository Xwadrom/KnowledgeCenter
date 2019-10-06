package v2;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class v2 {
    public static void main(String[] args) {
        Map<String, String> names = new TreeMap<>();

        names.put("Kowalski", "Jan Kowalski - 35");
        names.put("Adamiak", "Ania Adamiak - 21");
        names.put("Zaręba", "Adam Zaręba - 17");
        names.put("Piotrowski", "Karol Piotrowski - 42");
        names.put("Bobrowska", "Michalina Bobrowska - 15");

        Iterator<String> valuesIterator = names.values().iterator();
        while (valuesIterator.hasNext()) {
            System.out.println(valuesIterator.next());
        }
    }
}
//Ponieważ w zadaniu mamy wykorzystać mapę i zależy nam na sortowaniu alfabetycznym według nazwisk (a więc kluczy), to jedynym prawidłowym wyborem jest wykorzystanie klasy TreeMap. Do kolekcji names przypisujemy 5 informacji o ludziach, gdzie kluczami wartości są ich nazwiska. Ponieważ klasa TreeMap dba o sortowanie dodawanych wartości zgodnie z naturalnym porządkiem kluczy, to nie musimy się niczym więcej przejmować.
//
//W celu wyświetlenia wartości korzystamy z metody values(), która zwraca obiekt typu Collection, a jak wiemy interfejs ten posiada metodę iterator(), która zwróci nam obiekt Iterator sparametryzowany typem String, czyli typem wartości przechowywanych w mapie.
//
//Do iterowania wykorzystujemy zgodnie z treścią zadania pętlę while, jako warunek przydaje się metoda hasNext() iteratora, a do wyświetlenia pobieramy po prostu kolejne elementy metodą next().