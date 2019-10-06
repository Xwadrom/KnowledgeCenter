////Najczęściej wykorzystywaną spośród map jest HashMap. Jest ona parametryzowana dwoma parametrami <K, V>, gdzie K oznacza klucz (od ang. Key), natomiast V oznacza wartość (od ang. Value). Jeżeli zdecydujesz się na ten typ mapy, to wiedz, że elementy w niej przechowywane są w przypadkowej i nieposortowanej kolejności. Nie możesz się do elementów odwoływać po indeksach, ale tylko po kluczach.
////
////Podobnie jak zbiór typu HashSet, także HashMap wymaga zaimplementowania metody hashCode() i spełnienia kontraktu z metodą equals(). Do mapy możemy dodać jeden obiekt o kluczu pustym (null) oraz wiele wartości pustych (null), ale z unikalnymi kluczami.
////
////Najważniejsze metody w interfejsie Map to:
////
////put(K key, V value) - wstawia obiekt value typu V do zbioru i pozwala go odnaleźć pod kluczem key typu K,
////get(K key) - zwraca obiekt o kluczu key typu K,
////keySet() - zwraca zbiór wszystkich kluczy w mapie,
////values() - zwraca kolekcję wszystkich wartości (obiektów) przechowywanych w mapie,
////remove(Object key) - usuwa element mapy, dla którego klucza podanego jako parametr,
////entrySet() - zwraca zbiór obiektów w postaci klucz-wartość, reprezentowanych przez klasę Map.Entry<K,V>,
////clear() - czyści mapę ze wszystkiem przechowywanych danych.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NotebookStore {
    public static void main(String[] args) {
        //Przy tworzeniu mapy podajemy dwa parametry generyczne. W naszym przypadku mamy Map<String, Notebook>, czyli kluczami będą obiekty String, a do tych napisów będą przypisane wartości w postaci obiektów Notebook.
        Map<String, Notebook> notebooks = new HashMap<>();
        //Do mapy wartości wstawiamy korzystając z metody put(). Przyjmuje ona klucz i wartość, którą chcemy powiązać z tym kluczem, wymienione po przecinku.
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));

        //wyświetlamy zbiór kluczy:
        System.out.println("Modele Laptopów: ");
        Set<String> keys = notebooks.keySet();//Metoda keySet() zwraca zbiór kluczy. Zbiór, ponieważ klucze w mapie nie mogą się powtarzać.
        System.out.println(notebooks.keySet());//Wyświetlanie domyślne
        for (String key : keys) { //Wyświetlanie z pętlą for
            System.out.println(key);
        }
        //Metoda get() wyszukuje wartość przypisaną do danego klucza.
        // krótka wersja wyświetlania po kluczu:
        System.out.println("Znaleziono laptop o kodzie B590: "+ notebooks.get("B590"));

        // wyświetlamy informację o laptopach na podstawie kluczy, wersja z deklaracją zmiennych:
        String key = "XPS0091V";
        System.out.print("Znaleziono laptop o kodzie XPS0091V: ");
        Notebook foundNotebook = notebooks.get(key);
        System.out.println(foundNotebook);

        // usuwamy obiekt na podstawie klucza
        notebooks.remove("XPS0091V");

        System.out.println("Ilość produktów w sklepie: " + notebooks.size());
        System.out.println(notebooks.toString().replace("\n",""));


    }
}
