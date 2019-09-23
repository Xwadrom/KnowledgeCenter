import java.util.InputMismatchException;
import java.util.Scanner;

public class Test    {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = 0;

        try{//w bloku try{ } umieszczony został kod, który może spowodować problemy, czyli odebranie nieprawidłowej wartości od użytkownika.
            number = scanner1.nextInt();
            System.out.println("Wczytano poprawną liczbę.");

        }catch (InputMismatchException ex){//Jeżeli użytkownik wprowadzi nieprawidłową wartość i wystąpi wyjątek InputMismatchException, to sterowanie programu trafia do bloku catch. Możesz go sobie wyobrazić jako metodę, która przyjmuje argument z obiektem wyjątku. W naszym przypadku jest to argument o nazwie ex typu InputMismatchException.
            System.err.println("Podana wartość nie jest liczbą całkowitą");
            ex.printStackTrace();//wyświetlamy ślad stosu wywołując metodę printStackTrace() dziedziczoną z klasy Throwable. Stacktrace pojawia się standardowo przy wystąpieniu wyjątku, jednak, gdy wyjątku nie obsłużymy, to jednocześnie program kończy swoje działanie.
        }
        System.out.println("Podałes: "+ number);
        scanner1.close();
    }
}
//Na ekranie wyświetlamy informację o tym, że podana wartość jest nieprawidłowa, a następnie wyświetlamy ślad stosu wywołując metodę printStackTrace() dziedziczoną z klasy Throwable. Stacktrace pojawia się standardowo przy wystąpieniu wyjątku, jednak, gdy wyjątku nie obsłużymy, to jednocześnie program kończy swoje działanie. Jako strumień wyjścia zastosowaliśmy System.err - działa on analogicznie do System.out, jednak kod w konsoli będzie wyróżniony kolorem czerwonym. Ślad stosu pozwala dojść krok po kroku do miejsca, w którym wystąpił problem. W konsoli zobaczymy stos wywołań metod i informację w którym wierszu, której klasy wyjątek ma swoje źródło i jak był później propagowany.
//
//Najważniejsze jest jednak to, że dzięki obsłużeniu wyjątku program kontynuuje swoją pracę i pomimo, że wyświetla błędną wartość, bo 0, to jednak dochodzi do końca kodu.
