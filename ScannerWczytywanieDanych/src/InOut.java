import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);//Tworzymy obiekt klasy Scanner o nazwie scanner1, który pozwoli nam na odczyt danych od użytkownika.

        System.out.println("Wprowadz swoję imię: ");
        String firstName = scanner1.nextLine(); // dla String jest komenda nextLine
        System.out.println("Wprowadz swoję nazwisko: ");
        String lastName = scanner1.nextLine();
        System.out.println("Podaje swoj wiek: ");
        int age = scanner1.nextInt();//dla int jest komenda nextInt

        scanner1.close();//Jeżeli wiemy, że obiekt Scanner nie będzie nam już dłużej potrzebny do odczytu danych, powinniśmy wywołać metodę close(), która powoduje zamknięcie strumienia wejścia (System.in), z którego korzystaliśmy. Pamiętaj, że jeżeli w swoim programie utworzysz kilka obiektów Scanner i wszystkie one korzystają ze strumienia System.in, to wywołując metodę close() na którymkolwiek z nich nie będziesz mieć już możliwości odczytania czegokolwiek z konsoli. W takiej sytuacji nie wywołuj metody close(), zrób to dopiero przy zamykaniu aplikacji.

        System.out.println("Witaj "+ firstName +" "+ lastName+". W wieku "+ age);
        //Zwróć też uwagę na czerwony przycisk, który wyświetlany jest obok konsoli, Gdy jest on aktywny i ma kolor czerwony, oznacza to, że program jest w trakcie wykonania. Jeżeli chcesz zakończyć działanie aplikacji lub program się zawiesi to za pomocą tego przycisku możesz wymusić zakończenie jego działania - zapewniam, że w przyszłości będzie to bardzo użyteczna funkcjonalność.
    }
}