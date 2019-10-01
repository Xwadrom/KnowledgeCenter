public class ArraysCopySystem {
    //Istnieje jeszcze jedna metoda kopiująca elementy z jednej tablicy do drugiej, jednak znajduje się ona w klasie System.
    //
    //Statyczna metoda System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) przyjmuje 5 parametrów:
    //
    //tablicę źródłową (src),
    //indeks od którego chcemy skopiować elementy z tablicy źródłowej (srcPos),
    //tablicę, do której kopiujemy (dest),
    //indeks od którego mają być wstawiane skopiowane elementy w tablicy wynikowej (destPos),
    //ilość elementów do skopiowania (length).
    //W rzeczywistości metoda Arrays.copyOf() wykorzystuje metodę System.arraycopy() pod spodem.
    public static void main(String[] args) {
        int[]numbers1 = {1,2,3,4,5,6,7,8,9};
        int[]numbers2 = new int [numbers1.length];
    System.arraycopy(numbers1,2,numbers2,2,numbers1.length-2);

    for(int temp:numbers2){
        System.out.println(temp);
    }

    }

}
