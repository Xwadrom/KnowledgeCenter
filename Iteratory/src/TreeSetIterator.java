import java.util.*;

public class TreeSetIterator {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(45);
        numbers.add(3);
        numbers.add(55);
        numbers.add(342);
        numbers.add(425);


        Iterator<Integer> numIterator = numbers.iterator();
        while(numIterator.hasNext()){
            int numbers2 = numIterator.next();
            System.out.println(numbers2);
            if (numbers2==55){
                numIterator.remove();
            }
        }

        System.out.println(numbers);
        //Obiekt typu Iterator zwracany jest przez metodę iterator() dowolnej kolekcji, która implementuje pośrednio lub bezpośrednio interfejs Iterable. Ponieważ listy, zbiory i kolejki implementują interfejs Collection, a ten interfejs dziedziczy po interfejsie Iterable, to metoda iterator() jest dostępna we wszystkich tych kolekcjach. Metoda hasNext() sprawdza, czy istnieje kolejny element kolekcji, ale do niego nie przechodzi, natomiast metoda next() przechodzi do kolejnego elementu i go zwraca, dzięki czemu możemy go przypisać np. do zmiennej.

    }
}
