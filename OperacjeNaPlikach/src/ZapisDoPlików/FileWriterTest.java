package ZapisDoPlików;
//Zapis do plików jest równie prosty i podobny co ich odczyt. Najlepiej jest do tego wykorzystać kombinację obiektów BufferedWriter i FileWriter. Widać tutaj silną analogię do przed chwilą wykorzystywanych klas BufferedReader i FileReader.
//FileWriter pozwala zapisywać do pliku dane znak po znaku, a BufferedWriter wiersz po wierszu.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class  FileWriterTest {
    public static void main(String[] args) {
        String fileName="testFile.txt";
        try(var fileWriter = new FileWriter(fileName);var writer=new BufferedWriter(fileWriter)) {
            //Proces tworzenia BufferedWritera przebiega analogicznie jak w przypadku BufferedReadera i również dałoby się go skrócić do jednego wiersza.
            writer.write("Bolek");//Do zapisu danych w pliku wykorzystujemy metodę write(), która jako argument przyjmuje dowolny String. Istotne jest to, żeby do zapisywania znaku nowej linii używać dedykowanej metody newLine(), dzięki czemu mamy gwarancję, że zostanie wykorzystany znak nowego wiersza odpowiedni dla danego systemu operacyjnego.
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
            writer.newLine();
        }catch (IOException e){
            System.err.println("Nie udało się zapisać pliku "+ fileName);
        }
        }
    }
//Ponieważ korzystamy z konstrukcji try-with-resources to nie musimy pamiętać o wywołaniu metody close(), jednak jeżeli korzystalibyśmy ze standardowego try-catch i zapomnimy wywołać close() to część danych, która jest w buforze, nie zostanie zapisana. Należy na to zwrócić szczególną uwagę i przynajmniej wywołać metodę flush(), która opróżnia bufor.
//Problem w tym, że straciliśmy dane, które były w nim zapisane wcześniej. Na szczęście łatwo możemy naprawić ten problem i jeśli chcemy dopisywać dane do pliku, a nie zapisywać plik od zera, to wystarczy dodać flagę true w konstruktorze FileWritera.
//
//var fileWriter = new FileWriter(fileName, true);
//Przy każdym uruchomieniu tej klasy w pliku będą pojawiały się kolejne wiersze tekstu pozostawiając te już istniejące.