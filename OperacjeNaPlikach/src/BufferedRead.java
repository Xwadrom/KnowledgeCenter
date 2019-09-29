import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader wymaga jednak do działania innego obiektu klasy dziedziczącej po klasie Reader. Do odczytu plików taką klasą jest FileReader. Różnica pomiędzy FileReader, a BufferedReader jest taka, że ta pierwsza pozwala nam czytać plik znak po znaku, natomiast ta druga wiersz po wierszu.

class BufferedRead {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
///Utworzenie nowego obiektu BufferedReader jest dosyć długie - klasa FileReader pozwala pracować na obiekcie File, a BufferedReader dodaje do obiektu FileReader dodatkowe metody - jest to wzorzec projektowy zwany dekoratorem.
//
//Kolejne wiersze możemy odczytać za pomocą metody readLine() i przypisać je tak jak w naszym przykładzie do tymczasowej zmiennej nextLine typu String. Jeśli readLine() zwróci wartość null, oznacza to, że doszliśmy do końca pliku i należy wyjść z pętli.
//
//W przypadku odczytu pliku wyjątki mogą wystąpić przy tworzeniu obiektu FileReader (FileNotFoundException) oraz przy nieoczekiwanym problemie odczytu pliku (IOException). Ponieważ wyjątek FileNotFoundException dziedziczy po IOException, możemy je obsłużyć w jednym ogólnym bloku catch.
//
//Podobnie jak w przypadku Scannera zamykamy strumień, z którego korzystaliśmy. Najczęściej wykorzystywany będzie do tego blok finally w formie jaką przedstawioną, jednak w Javie 7 da się to zrobić ładniej o czym dowiesz się poniżej.