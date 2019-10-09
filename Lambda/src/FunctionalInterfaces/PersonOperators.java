package FunctionalInterfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonOperators {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski", 42));
        persons.add(new Person("Kasia", "Kruczkowska", 22));
        persons.add(new Person("Piotr", "Adamiak", 15));
        persons.add(new Person("Krzysztof", "Wojtyniak", 16));
        persons.add(new Person("Agnieszka", "Zagumna", 18));
        persons.add(new Person("Basia", "Cyniczna", 28));

        consumeList(persons, person1 -> System.out.println(person1) );//Pierwszy z nich (persons) to nasza lista, natomiast drugi argument to funkcja, która jako argument przyjmuje obiekt typu Person i go wyświetla. Skąd wiemy, że zmienna p w zapisie p -> System.out.println(p) jest typu Person? Ponieważ kompilator jest w stanie wydedukować to z kontekstu metody consumeList(), która jest generyczna i przyjmuje argument typu T. Ponieważ nasza lista (pierwszy argument) przechowuje obiekty typu Person, to funkcja również musi operować na tych samych obiektach.

        applyToList(persons, person -> {
            person.setAge(person.getAge()+1);
            return person;
        });
        //Jako pierwszy jej argument ponownie przekazaliśmy listę, a jako drugi przekazaliśmy funkcję przyjmującą argument typu Person i zwracającą ten sam obiekt, ale z wiekiem zwiększonym o 1. Jeśli ponownie zadajesz sobie pytanie, skąd wiemy, że argument p funkcji jest typu Person to odpowiedź ponownie jest taka sama - kompilator jest w stanie wydedukować to z kontekstu metody applyToList().

        filterByPredicate(persons, person -> person.getAge()>18);//Możliwe, że domyślasz się już, że przekazujemy tu jako argumenty: listę osób, a jako drugi funkcję pozwalającą przefiltrować nasze dane. Przypomnijmy, że interfejs funkcyjny Predicate posiada metodę test(), która w wyniku zwraca true lub false. Jak widzisz również tutaj typ argumentu przyjmowanego przez funkcję w wyrażeniu p -> p.getAge() > 18 został wydedukowany przez kompilator.

    }



    private static <T> void consumeList(List<T> list, Consumer <T> consumer){//Wiemy już, że jest ona sparametryzowana jednym typem, który jest wspólny dla obu jej argumentów (listy i funkcji).
        for(T tmp: list){
            consumer.accept(tmp);//Wywołanie consumer.accept(tmp) należy rozumieć jako "wywołaj funkcję consumer przekazaną jako argument z obiektem tmp jako argumentem".
        }
    }

    private static <T> void applyToList(List<T>list, Function<T,T> pre){
        for (int i = 0; i<list.size();i++){
            list.set(i, pre.apply(list.get(i)));
        }//Ponieważ interfejs funkcyjny Function<T, R> posiada metodę apply() zwracającą obiekt, możemy to wykorzystać w celu podmienienia naszych obiektów na liście. Zwróć uwagę, że typ argumentu funkcji jak i typ przez nią zwracany zadeklarowaliśmy jako identyczny Function<T, T> pre, który jest z kolei identyczny z typem listy dzięki czemu nie ma żadnego problemu z określeniem typów. Wywołanie list.set(i, pre.apply(list.get(i))) należy rozumieć jako "podmień element listy na pozycji i obiektem zwróconym przez funkcję pre, której jako argument przekazujemy obiekt list.get(i)". Dalej ponownie wyświetlamy elementy listy i widzimy, że faktycznie wiek każdej osoby na liście zwiększył się o 1.

    }

    private static <T> void filterByPredicate(List <T> list, Predicate<T> pre){
        for(T tmp:list){
            if(pre.test(tmp)){
                System.out.println(tmp);
            }
        }
    }//W pętli for sprawdzamy, czy argument spełnia nasz predykat. Jeśli tak, to wyświetlamy go na ekranie, jeśli nie, to nic nie robimy. Zapis if (pre.test(t)) najlepiej rozumieć jako "wykonaj blok if jeśli funkcja pre przekazana jako argument wywołana z argumentem t zwraca true".

}
