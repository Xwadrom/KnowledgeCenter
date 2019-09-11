public class MultiDimensional2 {
    public static void main(String[] args) {

        int[] longTab=new int[1000];
              longTab[99]=100;
        int[] midTab= new int[100];
        int[] smallTab = new int[10];

        int[][]hugeTab= new int [3][];
        hugeTab[0]=longTab;
        hugeTab[1]=midTab;
        hugeTab[2]=smallTab;

        //Stworzyliśmy 3 tablice typu całkowitoliczbowego, które mogą przechowywać odpowiednio 1000, 100 i 10 elementów. Do setnego elementu w pierwszej tablicy przypisaliśmy wartość 100. Dalej deklarujemy i inicjalizujemy tablicę dwuwymiarową - wiemy, że chcemy do niej przypisać 3 tablice, ale każda z nich ma różną długość, więc drugi rozmiar pozostawiamy pusty, przez co mamy tablicę mogącą przechowywać 3 tablice typu całkowitoliczbowego, jednak na ten moment są to puste wartości null. W 3 kolejnych linijkach przypisujemy odpowiednie tablice tworząc dwuwymiarową tablicę o nieregularnym rozmiarze.

        //W tablicach wielowymiarowych możemy wyświetlić rozmiar każdego wiersza odwołując się do własności length. Zapisując hugeTab.length otrzymamy wartość 3, czyli ilość wierszy/tablic, a zapisując np. hugeTab[0].length otrzymamy wartość 1000, czyli ilość kolumn/elementów w pierwszej tablicy/wierszu.

        System.out.println("Długość kolumn tablic: ");
        System.out.println(hugeTab[0].length+";"+hugeTab[1].length+";"+hugeTab[2].length);
        System.out.println("Długość wierszy tablic: ");
        System.out.println(hugeTab.length);
        System.out.println("Setny element pierwszej tablicy: "+hugeTab[0][99]);

        //Tablice wielowymiarowe mogą mieć więcej niż tylko 2 wymiary (3 wymiarowa tablica mogłaby być np. do reprezentacji punktu w przestrzeni 3D, albo do odwzorowania kostki rubika). Deklarację tablic wyższych rzędów tworzymy analogicznie. Do reprezentacji kostki rubika o rozmiarze 3x3x3 wykorzystalibyśmy więc:
        int [][][] threeDimensions=new int [3][3][3];
    }

}
