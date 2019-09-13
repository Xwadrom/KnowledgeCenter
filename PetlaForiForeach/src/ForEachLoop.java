public class ForEachLoop{
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //W Javie w wersji 5 wprowadzono uproszczoną pętlę for, która pozwala pominąć deklarowanie zmiennej licznika, czy ustawianie warunku zakończenia iteracji. Pętla for each, czyli tłumacząc bezpośrednio na język polski "dla każdego" ma za zadanie iterację przez wszystkie elementy kolekcji, np. tablicy.
        //Najbardziej trywialny przykład, którego zadaniem będzie wyświetlenie wszystkich elementów tablicy przedstawiono poniżej:
        for(int tmp: numbers){
            System.out.println(tmp);
        }
    //W pętli for each występuje tylko jedna zmienna, którą w tym przypadku nazwaliśmy tmp, która musi być zgodna z typem elementów przechowywanych w tablicy, po której iterujemy - u nas int. Do zmiennej tmp w kolejnych przebiegach pętli przypisywane będą kolejne elementy z tablicy, czyli odpowiednio numbers[0], numbers[1], aż do numbers[4].
        //Bardzo ważne jest to, że zmienna (w tym przypadku tmp) nie jest tym samym co odwołanie się bezpośrednio do elementu tablicy (np. numbers[2]). Jest to zmienna, do której przypisywana jest kopia wartości odpowiedniej komórki tablicy i wewnątrz pętli operujemy na tej kopii, a nie na jej oryginale.
        //Będzie to jeszcze ważniejsze, gdy tablica przechowuje typy obiektowe, a nie tylko proste. W ogólności unikaj używania pętli for-each w przypadku, gdy chcesz modyfikować elementy tablicy, używaj jej natomiast możliwie wszędzie tam, gdzie dane chcesz jedynie odczytać.

    }


}
