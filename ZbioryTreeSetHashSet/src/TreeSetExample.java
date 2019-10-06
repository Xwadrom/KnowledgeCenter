import java.util.LinkedList;
import java.util.TreeSet;
//Nie znajdziesz tutaj metody typu get() znanej z list, więc iterowanie za pomocą tradycyjnej pętli for, czy while, nie będzie możliwe tak jak poprzednio. Wynika to z tego, że sposób przechowywania elementów w zbiorze nie jest taki w jakim te elementy umieszczaliśmy. Jeśli chcesz iterować po wszystkich elementach zbioru (abstrahując od kolejności) to musisz skorzystać z Iteratora, któremu poświęcimy osobną lekcję, lub z pętli for each.
//Jeżeli ważne jest dla Ciebie, aby elementy dodawane do zbioru były automatycznie ustawiane w naturalnym porządku (lub zdefiniowanym przez komparator) to TreeSet będzie dobrym wyborem.

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet <Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.size());
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println("czy posiada liczbe 2? -> " + set.contains(2));
        //Pomimo iż próbowaliśmy dwa razy dodać wartość 1, to zbiór nadal ma rozmiar 3, czyli dodane zostały tylko unikalne obiekty.
        //
        //Jeżeli chcesz zmienić kolejność w jakiej sortowane są dodawane do TreeSetu obiekty, to podczas jego tworzenia możesz przekazać do konstruktora odpowiedni obiekt komparatora.
    }
}
