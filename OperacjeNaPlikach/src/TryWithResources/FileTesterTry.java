package TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Jeśli porównamy kod do odczytu plików z wykorzystaniem klas Scanner oraz BufferedReader to nie da się ukryć, że ten drugi jest dużo bardziej skomplikowany, choć robi w zasadzie to samo. Szczególnie negatywnie na czytelność wpływają tutaj zagnieżdżone bloki try-catch, rozdzielona deklaracja i inicjalizacja obiektów FileReader i BufferedReader. Projektanci Javy zauważyli ten problem i rozwiązali go wprowadzając w Javie 7 konstrukcję nazywaną try-with-resources. Jest ona przeznaczona do pracy z klasami służącymi do operacji na zasobach. Jeśli taka klasa implementuje interfejs AutoCloseable, to będziemy zwolnieni z konieczności jawnego wywoływania metody close(), zostanie to za nas zrobione automatycznie po wykonaniu się bloku try. Spójrzmy jak może wyglądać poprzedni przykład z wykorzystaniem tej konstrukcji.
public class FileTesterTry {
    public static void main(String[] args) {
        String fileName = "testFile.txt";

        try (var fileReader = new FileReader(fileName); var reader = new BufferedReader(fileReader)) {
            //Deklarację i inicjalizację obiektów FileReader i BufferedReader przenieśliśmy między nawiasy okrągłe występujące bezpośrednio po słowie try. Wszystkie obiekty, które zostaną utworzone w tym miejscu, a implementują interfejs AutoCloseable (w naszym przypadku oba z nich) zostaną automatycznie zamknięte.
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilosc wierszy w pliku:" + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
