import java.util.Map;

public class MapOf {
    public static void main(String[] args) {
        //Od Javy 9 tak samo jak w listach i zbiorach, tak również w mapach istnieją metody of(), które pozwalają tworzyć mapy na podstawie dostarczonych wartości. Ze względu na to, że obiekty w mapach przechowywane są na zasadzie par klucz-wartość, to ich tworzenie wygląda jednak nieco inaczej niż przy listach, czy zbiorach. Możemy albo przekazywać na zmianę klucze i wartości, czyli np.:
        Map<String, Integer> people =  Map.of("Jan", 12345, "Karol", 23456, "Zofia", 34567);

        //Istnieje także drugi sposób z wykorzystaniem metody ofEntries(), która może wydawać się nieco czytelniejsza ze względu na to, że nie wymieniamy na zmianę kluczy i wartości, a zamiast tego tworzymy mapę na bazie obiektów typu Entry. Powyższy przykład zapisany z użyciem tego podejścia wyglądałby tak:
        Map<String, Integer> people2 = Map.ofEntries(Map.entry("Jan", 12345),
                Map.entry("Karol", 23456),
                Map.entry("Zofia", 34567));
        //Mapy utworzone z wykorzystaniem powyższych technik są niemodyfikowalne, nie możemy do nich dodawać nowych elementów, ani usuwać tych już istniejących.
    }
}
//Podsumowanie informacji o mapach
//Wszystkie mapy służą do przechowywania informacji w postaci <Klucz, Wartość>,
//Jeżeli zależy ci wyłącznie na szybkości działania i wygodzie indeksowania obiektów za pomocą kluczy dowolnego obiektowego typu - stosuj HashMap,
//Jeżeli potrzebny jest ci dodatkowo porządek w postaci kolejności dodawanych elementów - skorzystaj z LinkedHashMap,
//Natomiast, gdy chcesz, aby elementy w mapie były posortowane zgodnie z naturalnym porządkiem lub zdefiniowanym komparatorem - wykorzystaj klasę TreeMap.