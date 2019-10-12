import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeFormatterClas {
    public static void main(String[] args) {
        //Tworzenie obiektów LocalDate, czy LocalDateTime poprzez podawanie osobno roku, miesiąca i dnia byłoby mało praktyczne. Dużo wygodniej byłoby podać całą datę np. w postaci "1997-11-23". Twórcy przewidzieli także taką możliwość. Możemy utworzyć obiekt DateTimeFormatter, w którym definiujemy wzorzec daty, który ma wprowadzić użytkownik. Należy się w nim posługiwać skrótami:
        //
        //dd - dzień,
        //MM - miesiąc,
        //yyyy - rok,
        //HH - godzina,
        //mm - minuta,
        //ss - sekunda.
        //Przykład:
        Scanner sc=new Scanner(System.in);
        System.out.println("Tworzę nowe wydarzenie.");
        System.out.println("Podaj datę w formacie dd-MM-yyyy");
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateInput = sc.nextLine();
        LocalDate createdDate = LocalDate.parse(dateInput,datePattern);
        System.out.println("Wydarzenie utworzone na dzień " + createdDate);

    }
}
//Gdyby nie powyższe rozwiązanie, to tworzenie obiektów LocalDate i innych wyglądałoby np. tak:
//
//class DatePatternTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tworzę nowe wydarzenie.");
//        System.out.println("Podaj dzień");
//        int day = sc.nextInt();
//        System.out.println("Podaj miesiąc");
//        int month = sc.nextInt();
//        System.out.println("Podaj rok");
//        int year = sc.nextInt();
//
//        LocalDate createdDate = LocalDate.of(year, month, day);
//        System.out.println("Wydarzenie utworzone na dzień " + createdDate);
//    }

//Oczywiście w niektórych sytuacjach takie podejście również może mieć swoje plusy.