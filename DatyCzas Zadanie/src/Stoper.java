import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Naciśnij enter aby rozpocząć odlicanie czasu: ");
        sc.nextLine();
        Instant i1=Instant.now();
        System.out.println("Aby zatrzymać stoper naciśnij ponownie enter: ");
        sc.nextLine();
        Instant i2=Instant.now();

        Duration duration = Duration.between(i1,i2);
        System.out.println("Zmierzony czas  w sekundach to: " + duration.getSeconds());
    }
}
//Zadanie
//Napisz prosty stoper.
//
//Wyświetl na ekranie komunikat o tym, że w celu rozpoczęcia pomiaru należy wcisnąć Enter. Następnie na ekranie pojawia się podobny komunikat, że w celu zatrzymania pomiaru należy ponownie wcisnąć Enter.
//
//Na końcu wyświetl czas jaki udało Ci się zmierzyć w sekundach.