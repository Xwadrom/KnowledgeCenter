import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayasList {
    public static void main(String[] args) {
//Jeżeli chcemy utworzyć niewielką listę i znamy elementy, które będą do niej wstawione, to przed Javą 9 najwygodniejszym sposobem było wykorzystanie metody Arrays.asList(), np.:

        Integer[] ints = {5, 10, 15};
        List<Integer> lista = Arrays.asList(ints);
        System.out.println(lista);
        //rozwiązanie takie jest ok, jednak jak na tak prostą czynność jak utworzenie listy o kilku elementach wymaga to pisania sporej ilości niepotrzebnego kodu i musimy tworzyć tablicę, która nie jest nam tutaj potrzebna. Java 9 wprowadza tzw. collections factory methods, czyli specjalne metody, przeznaczone przede wszystkim do tworzenia niewielkich list, gdy znamy elementy, które mają się w niej znaleźć. Od teraz w celu utworzenia listy można zapisać:
        List<Integer> numbers=List.of(5,4,44,3,4,56,3,63,4,6,5,3,5);
        System.out.println(numbers);

        //Co ciekawe istnieje wiele przeciążonych wersji metody List.of() dla 1, 2, 3, ..., 10 elementów. Istnieje też specjalna wersja tej metody przyjmująca dowolną liczbę argumentów, ale nie powinna ona być nam zbyt często potrzebna. Rozwiązanie takie jest podyktowane kwestią wydajności i przy niewielkich tablicach pozwala uniknąć tworzenia dodatkowej tablicy.
        //
        //Bardzo ważną kwestią przy tworzeniu list z użyciem powyższej metody jest to, że lista taka jest niemodyfikowalna, czyli nie możemy do niej ani dodawać, ani usuwać z niej elementów. Jeśli spróbujemy to zrobić to otrzymamy wyjątek UnsupportedOperationException.
       // numbers.remove(0);
    }
}