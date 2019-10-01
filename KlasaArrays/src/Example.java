import java.util.Arrays;



public class Example {
    //w Javie niemal na początku jej istnienia powstał pakiet java.utils, a w nim wygodna klasa Arrays do wykonywania podstawowych operacji na tablicach, które wymieniono powyżej. Przykładowe metody, które tam znajdziemy to:
//sort() - sortuje elementy zgodnie z ich naturalnym porządkiem,
//binarySearch() - wyszukuje w tablicy podaną wartość, za pomocą wyszukiwania binarnego. Wymaga, aby tablica była posortowana (np. metodą sort()),
//copyOf() - pozwoli skopiować całość lub fragment tablicy, do innej tablicy. W przypadku typów obiektowych kopiowane są referencje (nie są tworzone kopie obiektów), więc modyfikując obiekty w jednej tablicy, zmodyfikujemy także obiekty w utworzonej kopii,
//equals() - porównuje równość tablic, jednak nie jest sprawdzana równość strukturalna poszczególnych obiektów, a jedynie równość ich referencji. Jeśli chcesz sprawdzić równość strukturalną dwóch tablic, wykorzystaj metodę deepEquals(),
//fill() - pozwala wypełnić całą tablicę jedną, podaną wartością.
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};//użylismy typu opakowujacego poniewaz dla metody generycznej printArray, mozemy przekazywac tylko obiekty, w tym przypadku liczby opakowane w obiekty klasy Integer.

        System.out.println("names: ");
        printArray(names);
        System.out.println("numbers: ");
        printArray(numbers);

        //sortowanie
        Arrays.sort(numbers);
        Arrays.sort(names);
        printArray(names);
        printArray(numbers);

        //copyOf
        Integer[]numbers2=Arrays.copyOf(numbers,numbers.length);
        printArray(numbers2);

        //equals
        boolean issame = Arrays.equals(numbers,numbers2);
        System.out.println(issame);

        //fill
        String[]strings=new String[5];
        Arrays.fill(strings, "Robert");
        printArray(strings);

    }
    public static <T>void printArray(T[] array){
        for(T temp:array){
            System.out.print(temp+" ");
        }
    }

}
//Powyższy przykład pokazuje zastosowanie dwóch typów tablic - Integer[] i String[]. Używamy typu Integer[], a nie int[], dzięki czemu mogliśmy przekazać ją jako argument generycznej metody printArray() wyświetlającej kolejne elementy tablicy.
//
//Metody klasy Arrays nie zwracają wyniku (są typu void), modyfikowana jest oryginalna tablica. Ponieważ jest to operacja nieodwracalna, to lepiej zastanowić się przed wykorzystaniem którejkolwiek z zaprezentowanych funkcjonalności.
