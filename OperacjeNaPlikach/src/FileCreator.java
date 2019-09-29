import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
        String fileName="testfile.txt";
        File file = new File(fileName);

        boolean fileExists=file.exists();
        if (!fileExists){
            try{
                fileExists=file.createNewFile();
            }catch (IOException e){
                System.out.println("Nie udało się utworzyć pliku");
            }
        }
        if(fileExists)
            System.out.println("Plik "+fileName+" istnieje lub został utworzony");
    }
}
//Dobrą praktyką jest nie wykorzystywanie nazw plików jako napisów bezpośrednio w konstruktorze, ale wykorzystywanie do tego zmiennych, czy stałych - dzięki temu unikamy ryzyka popełnienia literówek, jeśli odwołujemy się do jednej nazwy pliku w wielu miejscach kodu. Utworzyliśmy więc zmienną fileName typu String i zainicjowaliśmy ją nazwą pliku, który chcemy utworzyć. Możemy w tym miejscu podać samą nazwę pliku, wtedy zostanie on utworzony w katalogu naszego projektu, albo ścieżkę absolutną typu C:/a/b/c.txt.
//
//Obiekt klasy File o nazwie file jest reprezentacją pliku lub folderu w naszym programie. Możemy na nim wykonać pewne operacje, np. możemy sprawdzić, czy taki plik rzeczywiście istnieje na komputerze. Wykorzystujemy do tego metodę exists(), która zwraca true lub false w zależności od tego, czy plik lub folder istnieje, czy nie. Jeśli plik nie istnieje, to tworzymy go za pomocą metody createNewFile(), która może generować wyjątek kontrolowany IOException. Jeśli faktycznie taka sytuacja by wystąpiła, wyświetlamy komunikat o niepowodzeniu w bloku catch, jeśli wszystko przebiegnie bez zakłóceń wyświetlamy potwierdzenie. Wyjątek może wystąpić np. w sytuacji, gdy nie mamy praw zapisu.
//
//W IntelliJ plik pojawi się od razu w strukturze projektu.

//W podobny sposób jak powyżej można utworzyć nowy folder, jednak służy do tego metoda mkdir(). Jeżeli utworzony ma zostać ciąg folderów, np "/a/b/c" skorzystaj z metody mkdirs().
//
//Jako uzupełnienie warto pamiętać, że tworząc foldery możemy wskazywać ścieżki relatywne lub absolutne:
//
//D:/a - utworzony zostanie folder na dysku D o nazwie "a"
///a - utworzony zostanie katalog dysku systemowym
//./a - utworzony zostanie folder w katalogu projektu
//../a - utworzony zostanie folder w folderze powyżej folderu projektu (w przypadku uruchamiania programu eclipse, bedzie to "workspace")