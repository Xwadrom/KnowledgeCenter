public class Tablice {

    int[]    numbers = new int [10];//W pierwszym przypadku deklarujemy tablicę typu int[] i nadajemy jej nazwę numbers, po czym przypisujemy do niej obiekt reprezentujący tablicę liczb całkowitych, w której można zapisać 10 liczb.
    String[] names = new String[10];// W drugim przypadku deklarujemy tablicę typu String[], nazywamy ją names i tworzymy tablicę, w której można umieścić 10 napisów.


    int[]    numbers2 = {1,2,3,4,5};// tablica numbers w komórkach ma zapisane konkretne wartości typu int.
    String[] names2 = {"Kasia","Basia","Piotr"};//Tablica names przechowuje jedynie referencje na obiekty typu String,


    public static void main(String[] args) {

        int[]numbers = new int[5]; //utworzenie tablicy, domyślnie wypełniona zerami(domyślna wartość int)

        //uzupełnienie wartości w poszczególnych komórkach tablicy
        numbers[0]=1;
        numbers[1]=5;
        numbers[2]=10;
        numbers[3]=15;
        numbers[4]=20;

        //podobnie wyświetlamy wprowadzone wartości
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);



    }


}
