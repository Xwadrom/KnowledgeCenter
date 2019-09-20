public class StringTimeTest {
    //Żeby zobaczyć jaką korzyść to niesie napiszmy jednak prosty program, który pozwoli porównać czas stworzenia takiego samego napisu jak powyżej za pomocą obiektu StringBuilder i dodając kolejne elementy do napisu.
    //
    //Do pomiaru czasu wykorzystamy metodę System.nanoTime(), która zwraca aktualny czas wyrażony w nanosekundach.

    public static void main(String[] args) {
        long time1, time2;

        long startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
            builder.append(" ");
        }
        String numbers = builder.toString();
        time1 = System.nanoTime() - startTime;//czas aktualny minus czas startu zadania
        System.out.println("Time1: " + time1);
        System.out.println(numbers);

        startTime = System.nanoTime();
        String numbers2= "";//trzeba dac jakas wartosc zeby zmienna zostala zainicjalizowana w petli
        for (int i = 0; i < 1000; i++) {
            numbers2 = numbers2 + i + " ";
        }
        time2 = System.nanoTime() - startTime;
        System.out.println("Time2: " + time2);
        System.out.println(numbers2);

        System.out.println("Time2 / Time1: " + time2 / time1);

//        Zmienne time1 i time2 pozwolą nam na zapisanie informacji o czasie stworzenia obiektów dwoma metodami, żeby je na końcu porównać. Dalej inicjujemy zmienną startTime aktualnym czasem odczytanym poprzez System.nanoTime(). Tak jak w poprzednim kodzie tworzymy obiekt StringBuilder i budujemy nasz napis, na końcu przypisując go do zmiennej numbers. Wyświetlamy czas stworzenia obiektów (wyrażony w nanosekundach).
//
//Resetujemy zmienną startTime przypisując do niej ponownie aktualny czas i tym razem napis numbers2 tworzymy przez konkatenację, czyli tak naprawdę przez utworzenie po drodze 1000 obiektów typu String. Po wyjściu z pętli ponownie wyświetlamy czas stworzenia ostatecznego napisu.
//
//Na końcu wyświetlamy wynik dzielenia czasu wykonania drugiej pętli przez pierwszą, dzięki czemu uzyskujemy informację ile razy wolniejsza się okazała.

        //Przy każdym uruchomieniu czas ten będzie się różnił. W moim przypadku najlepszy wynik był "jedynie" 12 razy gorszy, natomiast zdarzało się, że wersja z konkatenacją była nawet blisko 50 razy wolniejsza od użycia obiektu StringBuilder (procesor Intel i7, 8GB ram). Im większy napis będziemy tworzyli, tym różnica w wydajności będzie większa.
        //
        //Jeżeli więc musisz zbudować długie napisy zawsze korzystaj z obiektu StringBuilder. Zapis jest nieco dłuższy, ale się opłaca. Jeśli potrzebujesz natomiast tylko złączyć 2 lub kilka napisów w 1 i nie wykonujesz tych operacji w pętli, to wykorzystaj zwykłą konkatenację.
    }
}
