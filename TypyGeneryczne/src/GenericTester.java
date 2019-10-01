public class GenericTester {
    public static void main(String[] args) {

        Container<Integer> integers = new Container<Integer>();//// definiujemy kontener przechowujący liczby całkowite
        integers.setArray(new Integer[5]);// przypisujemy nową tablicę typu Integer
        integers.getArray()[0]=5;// do pierwszego elementu przypisujemy liczbę 5

        Container <String>strings = new Container<String>();// tworzymy kontener przechowujący obiekty String
        strings.setArray(new String[10]);// przypisujemy tablicę typu String
        strings.getArray()[0]="Robert"; // przypisujemy 1 i 2 element tablicy
        strings.getArray()[1]="Piotr";

        integers.printObjects();
        strings.printObjects();

        System.out.println(integers.get(0));// odczytanie danych bez konieczności rzutowania!
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
    }
}
///Na początku zdefiniowaliśmy obiekt Container, parametryzując go typem Integer. Do typów generycznych można używać tylko typów obiektowych. Jest to jedno z miejsc, gdzie wymagane jest korzystanie z klas opakowujących dla typów prostych.
//Zauważ, że ponieważ w nawiasach ostrych podaliśmy typ Integer, to od tego momentu w klasie Container posiadamy pustą referencję typu Integer[], do której za pomocą metody setArray() przypisujemy nową 5 elementową tablicę liczb całkowitych, a dalej do jej 1 elementu liczbę 5 (możliwe dzięki autoboxingowi). W skrócie wszędzie tam, gdzie w klasie Container pojawiał się parametr T, od teraz wyobrażamy sobie w tych miejscach Integer.
///W dalszej części kodu robimy analogiczne czynności, tym razem parametryzując typ Container za pomocą typu <String>.
//Metoda get() pokazuje całe piękno typu generycznego - nie jest wymagane żadne rzutowanie z typu Object na Integer, czy String, bo my dokładnie wiemy, że obiekt integers przechowuje wartości Integer, a strings napisy typu String.