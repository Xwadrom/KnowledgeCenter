package TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//W Javie 9 wprowadzono kolejne usprawnienie bloku try-with-resoures, które polega na tym, że deklaracja i inicjalizacja obiektów, które mają być zamknięte nie musi odbywać się bezpośrednio w okrągłych nawiasach przy try. Teraz deklaracja może znajdować się przed blokiem try, a obiekty, które mają być zamknięte należy wymienić w okrągłych nawiasach. Jedyne ograniczenie jest takie, że zmienne muszą być finalne lub efektywnie finalne, czyli nie możemy później przypisywać do nich nowego obiektu.

public class FileTesterJava9 {
    public static void main(String[] args) throws IOException {
        String fileName="testFile.txt";
        var fileReader=new FileReader(fileName);
        var reader = new BufferedReader(fileReader);

//Przy okazji widać, że dzięki konstrukcji try-with-resources możemy zapisać blok try, z którym nie jest powiązany żaden catch, ani sekcja finally (podobnie działa to także w Javie 7 i 8, jednak deklaracja obiektów musiała znajdować się w okrągłych nawiasach).

        try(fileReader; reader){
            String nextLine = null;
            int lines = 0;
            while ((nextLine=reader.readLine())!=null){
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: "+lines);
        }
    }
}
