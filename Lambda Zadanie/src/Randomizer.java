import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Randomizer {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Random r = new Random();
        generate(ints, 10, () -> r.nextInt(1000));
        System.out.println("Lista 10 losowych elementów:");
        consumeList(ints, int1 -> System.out.println(int1) );
        System.out.println("Elementy podzielne przez 2: ");
        filterByPredicate(ints, int1 -> int1 %2 ==0 );
        consumeList(ints, int1 -> System.out.println(int1) );

    }

    private static <T> void generate(List<T> list, int num, Supplier<T> sup) {
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
    }
    private static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for(T tmp: list){
            consumer.accept(tmp);
        }
    }
    private static <T> void filterByPredicate(List <T> list, Predicate<T> pre){
        Iterator<T> list2=list.iterator();
        while (list2.hasNext()) {
            T tmp = list2.next();
            if (pre.test(tmp)) {
                list2.remove();
            }
        }
    }
}
//Zadanie
//Napisz aplikację, w której z wykorzystaniem klasy Random i wyrażenia lambda wygenerujesz 10 losowych liczb (interfejs Supplier). Wyświetl listę na ekranie również wykorzystując wyrażenia lambda (interfejs Consumer).
//
//Następnie napisz metodę, która usunie z listy wszystkie liczby podzielne przez 2 (użyj iteratora i własnej metody wykorzystującej interfejs Predicate).
//
//Ponownie wyświetl wynik na ekranie.
