import java.util.Set;
//W Javie 9 do interfejsu Set podobnie jak przy listach dodano metody of() pozwalające tworzyć zbiory na podstawie przekazanych argumentów. Również w tym przypadku w wyniku otrzymamy zbiór niemodyfikowalny, czyli nie możemy później do niego dodawać nowych, ani usuwać już istniejących elementów.

class SetOf  {
    public static void main(String[] args) {
        Set<String> names = Set.of("Marek", "Kasia", "Karol", "Basia");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
//Podsumowanie zbiorów
//Zbiorów, czyli klas implementujących interfejs Set używaj wtedy, kiedy chcesz zapewnić, że przechowujesz tylko unikalne obiekty.
//Zbiory najczęściej wykorzystuje się wtedy, kiedy nie obchodzi nas kolejność dodawania obiektów i odwoływanie się do nich po indeksach, ani iterowanie po całym zbiorze, ale liczy się dla nas szybkie dodawanie, usuwanie i wyszukiwanie wartości.
//Klasy TreeSet używaj wtedy, kiedy zależy ci na porządkowaniu dodawanych elementów w kolejności naturalnego porządku.
//Klasy HashSet używaj wtedy, kiedy liczy się dla ciebie praktycznie tylko szybkość dodawania, usuwania i wyszukiwania obiektów w zbiorze, ale nie liczy się dla Ciebie kolejność iterowania po nich.
//Klasy LinkedHashSet użyj w sytuacji podobnej do HashSet, jednak z dodatkową zaletą w postaci możliwości zachowania porządku elementów.
//Do iterowania po zbiorze konieczne jest zastosowanie iteratora lub pętli for-each.