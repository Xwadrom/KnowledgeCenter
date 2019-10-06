import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolimorphicLists {
    //Ponieważ zarówno klasy ArrayList jak i LinkedList implementują wspólny interfejs List, to wiele z ich metod jest współdzielonych. Dzięki temu w wielu sytuacjach lepiej jest pisać programy operujące na jak najbardziej abstrakcyjnych typach kolekcji. Przykładowo jeśli chcemy napisać metodę, która wyświetla wszystkie elementy listy, to lepiej jest zadeklarować, że przyjmuje ona jako parametr obiekt typu List, a nie LinkedList, czy ArrayList, bo dzięki temu będziemy mogli do niej przekazać zarówno te pierwsze jak i drugie:

    public static void main(String[] args) {
        LinkedList<Integer>ints1=new LinkedList<>();
        ArrayList<Integer>ints2= new ArrayList<>();

        for(int i = 0; i<100; i++){
            ints1.add(i);
            ints2.add(i);
        }
        printList(ints1);
        printList(ints2);


    }
    static void printList(List<Integer> list){
        for (Integer temp: list){
            System.out.println(temp);
        }
        //Metoda printList(), dzięki przyjmowaniu ogólniejszego typu kolekcji jest bardziej uniwersalna. Jeśli nie wykorzystujesz metod specyficznych dla danej implementacji, np. removeLast() z klasy LinkedList, to rozważ także posługiwanie się referencjami ogólniejszego typu dla zwykłych zmiennych, czyli, np:
        List<Integer> ints3 = new LinkedList<>();
        List<Integer> ints4 = new ArrayList<>();
        //Jeśli jednak potrzebujesz metodę z konkretnego typu, np. wspomniana removeLast() to definiuj od razu kolekcję konkretnego typu, aby uniknąć rzutowania.
        //Powyższe rady dotyczą wszystkich typów kolekcji, nie tylko list. Ogólna zasada brzmi: definiuj zmienne jako najogólniejszy możliwy typ, który nie powoduje utraty funkcjonalności i nie zmusza cię do rzutowania.



    }
}
