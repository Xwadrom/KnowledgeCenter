public class test {

    //Załóżmy, że chcemy napisać grę kółko i krzyżyk. Ponieważ potrzebna jest nam plansza o standardowym rozmiarze 3x3 możemy albo stworzyć 9 zmiennych i odpowiednio je ponumerować, albo stworzyć trzy tablice, z których każda będzie mogła pamiętać po 3 elementy (wtedy tablica odpowiadałaby 3 wierszom na planszy 3x3).

    // Wersja 1:
    int     x1, x2, x3,
            x4, x5, x6,
            x7, x8, x9;

    // Wersja 2:
    int[] tab1 = new int[3];
    int[] tab2 = new int[3];
    int[] tab3 = new int[3];

    //Przyznasz chyba, że powyższe zapisy nie wydają się zbyt przyjazne. Jeśli pomyślimy o tym w ten sposób, że pisząc grę w warcaby, albo szachy plansza ta miałaby rozmiar 8x8 to rozwiązanie takie nie wchodzi w grę. czyli 8 kolumn i 8 rzędów.

    //Jest to idealne miejsce do wykorzystania tablic wielowymiarowych. Jeśli słyszałeś kiedyś o macierzach to powinno być ci zdecydowanie łatwiej zrozumieć ideę, jeśli jednak jest to dla ciebie nowość, to możesz sobie na początek wyobrazić tablicę wielowymiarową jako właśnie dowolną prostokątną planszę do gry. Jest ona podzielona na wiersze oraz kolumny. Wiersze będą kolejnymi tablicami, a kolumny konkretnymi elementami tablic.
    public static void main(String[] args) {


    int [][]tab3x3=new int[3][3];//jest to zapis gdzie tworzymy tablicę o 3 wierszach i 3 kolumnach. czyli w pierwszej kolejnosci podajemy wiersze, a w drugiej kolumny.
    //inaczej mówiąc tworzymy 3 tablice, z których każda ma po 3 elementy.

    //Jeśli chcemy uzupełnić "przekątną" takiej tablicy, to możemy zapisać:

   tab3x3[0][0]=5;
   tab3x3[1][1]=5;
   tab3x3[2][2]=5;
        System.out.println(tab3x3[0][0]);

      //Tablice wielowymiarowe nie muszą być prostokątne, czyli np. 3x3, 5x4 itp. Każdy wiersz (czyli każda tablica) może mieć swój własny rozmiar.

        int[][] array = new int [3][];//chcemy utworzyć 3 tablice(wiersze) - uwaga taki zapis jeszcze nie utworzy tablicy
        array[0]=new int[3];// pierwsza tablica ( wiersz ) będzie miała 3 elementy (kolumny)
        array[1]=new int[2];// druga tablica (wiersz) będzie miał 2 elementy (kolumny)
        array[2]=new int[1];//trzecia tablica(wiersz) będzie miał 1 element.
        //jeśli odwolujemy się do tablicy to zawsze liczenie zaczynamy od zera, jesli tworzymy tablice to zaczynamy od 1.

}
}