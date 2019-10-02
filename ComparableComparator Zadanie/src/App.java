import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Integer tab[] = new Integer[20];
        Sorting sortreverse = new Sorting();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100);
        }

        System.out.println("Tablica przed sortowaniem: ");
        printArray(tab);

        System.out.println("Tablica po sortowaniu rosnąco: ");
        Arrays.sort(tab);
        printArray(tab);

  //      Arrays.sort(tab, new Sorting());// wersja sortowania malejąco z osobną klasą

        Arrays.sort(tab, new App.InnerSortReverse()); // wersja z klasą wenętrzną

//        Arrays.sort(tab, new Comparator<Integer>() {                 --> wersja sortowania malejąco z klasą anonimową
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -(o1.compareTo(o2));
//            }
//        });
        System.out.println("Posortowana malejąco: ");
        System.out.println(Arrays.toString(tab));

//
    }

    public static class InnerSortReverse implements Comparator <Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1.compareTo(o2));
        }
    }

    public static int randomFill() {
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }

    public static void printArray(Integer[] array) {
        for (int tmp : array) {
            System.out.println(tmp);
        }
    }


}
//Napisz program, w którym utworzysz tablicę 20 dowolnych liczb całkowitych, a następnie posortujesz tablicę w porządku rosnącym i malejącym, za każdym razem wyświetlając wynik posortowania na ekranie. Wykorzystaj interfejs Comparator i anonimowe klasy wewnętrzne.
//W klasie NumberComparator stworzona została tablica 20 liczb całkowitych. Zauważ, że tablica jest typu Integer[], a nie po prosty int[]. Bez tego nie moglibyśmy skorzystać z metody Arrays.sort(), która potrzebuje tablicy typu obiektowego i zgodnego z nim komparatora. Comparator jest interfejsem generycznym, a typy generyczne operują wyłącznie na typach obiektowych, np. Integer, a nie int.
//
//Ponieważ, sortowanie rosnące to sortowanie zgodne z naturalnym porządkiem, tworzenie dodatkowego komparatora jest zbędne. Klasa Integer implementuje interfejs Comparable i jest w niej przez to domyślnie zdefiniowana metoda compareTo(), a tym samym możliwe jest skorzystanie z metody Arrays.sort() operującej na samej tablicy, bez drugiego argumentu w postaci komparatora.
//
//W przypadku sortowania malejącego wykorzystujemy komparator utworzony przez klasę anonimową. W celu zmiany porządku sortowania wystarczy zmienić znak wyniku zwracanego przez metodę compareTo() klasy Integer. Jeżeli jej wynik był ujemny - teraz będzie dodatni i odwrotnie, W przypadku wartości równych w wyniku nadal otrzymamy 0.
//
//Do wygodnego wyświetlania tablicy skorzystaliśmy ze statycznej metody Arrays.toString().