import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Metoda Collections.sort() przyjmuje jako argument listę do posortowania oraz obiekt komparatora. Ponieważ interfejs Comparator jest interfejsem funkcyjnym, to w jego miejsce można przekazać wyrażenie lambda lub referencję do metody albo konstruktora. My przekazujemy referencję do statycznej metody compareToIgnoreCase().

class SimpleStringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");

        Collections.sort(names, String::compareToIgnoreCase);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
//W Javie 8 wprowadzono do interfejsu List dodatkową metodę sort(), dzięki czemu możemy też pominąć klasę Collections. Dodatkowo pętlę forEach możemy zastąpić metodą forEach(), dzięki czemu nasz kod uprości się do takiego:
//import java.util.Arrays;
//import java.util.List;
//
//class SimpleStringComparator {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");
//        names.sort(String::compareToIgnoreCase);
//        names.forEach(System.out::println);
//    }
//}