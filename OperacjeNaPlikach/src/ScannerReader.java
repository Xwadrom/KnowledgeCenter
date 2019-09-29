import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
    //W programie chcemy odczytać i wyświetlić kolejne imiona oraz zliczyć ilość wierszy w pliku.
    public static void main(String[] args) throws FileNotFoundException {
        String fileName="testFile.txt";
        File file = new File(fileName);
        Scanner scan=new Scanner(file);

        int lines = 0;
        while (scan.hasNextLine()){
            String name = scan.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println(lines);
        scan.close();
    }

}
//Najprostszym sposobem odczytu plików tekstowych jest skorzystanie ze znanej nam już klasy Scanner. Jej zachowanie jest identyczne jak w przypadku odczytu z konsoli, zmienia się jedynie źródło z którego tego odczytu dokonujemy.
//
//W przypadku odczytu z plików najczęściej będziemy korzystali z połączenia dwóch metod:
//
//boolean hasNextLine() - sprawdza, czy w pliku jest jeszcze kolejny wiersz do odczytania,
//String nextLine() - wczytuje i zwraca kolejny wiersz z pliku.
//Jeżeli w pliku mamy zapisany np. ciąg liczb to analogicznie moglibyśmy używać metod typu hasNextInt() i nextInt(), przy czym metoda hasNextInt() traktuje jako separator pomiędzy liczbami dowolny biały znak, np. spację, albo tabulator, a nie tylko enter.
//
//Dlaczego akurat taka kombinacja metod? Odczytując dane z pliku nie wiemy ile znaków, czy ile wierszy tekstu się w nim znajduje, dopóki tego pliku nie odczytamy "z góry na dół". Metoda hasNextLine() pozwoli nam więc sprawdzić warunek "czy w pliku jest jeszcze coś do wczytania" a metoda nextLine() wczyta te dane jeśli istnieją. Kombinacja ta świetnie sprawdza się w połączeniu z pętlą while.