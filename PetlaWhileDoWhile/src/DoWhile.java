public class DoWhile {
    public static void main(String[] args) {
        //Jak już sama nazwa sugeruje pętla do while jest bardzo podobna do tradycyjnej while. Jedyną, ale bardzo ważną różnicą jest to, że pętla do while zawsze wykona przynajmniej jeden raz, ponieważ najpierw wykonywany jest kod zawarty w pętli, a dopiero później sprawdzany jest warunek.

        int i = 5;
        do {
            System.out.println("Liczba " + i++);
        }while (i<10);

        int b = 5;
        do {
            System.out.println("Kolejna Liczba = "+b);
        } while(b < 3);// Pomimo tego, że warunek pętli jest błędny (zmienna b została zainicjowana wartością 5, więc nie jest mniejsza od 3) to na ekranie i tak pojawia się napis "Kolejna Liczba 5".
    }
    }
//Praktycznie każdy przykład wykorzystujący pętlę do while można przekształcić na wersję z pętlą while. To, której pętli użyjemy powinno być uzależnione od tego co będzie w konkretnym przypadku bardziej czytelne.
//Jako podsumowanie tematyki pętli możemy zastosować następujący podział:
//
//Pętlę for stosuj w przypadku, gdy znana jest liczba iteracji.
//Pętlę for each używaj do przeglądania wszystkich elementów kolekcji, np. tablicy. Nie używaj pętli for each do uzupełniania tablic.
//Pętlę while w sytuacji, gdy nie znasz ilości iteracji pętli.
//Pętlę do while stosuj w sytuacji, gdy nie znasz ilości iteracji pętli, ale musisz mieć gwarancję, że ciało pętli wykona się przynajmniej raz.
//We wszystkich typach pętli możesz wykorzystywać instrukcje break (przerywa działanie pętli) oraz continue (powoduje przejście do kolejnej iteracji), jednak stosowanie break w pętli for może być uznane za złą praktykę.