import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMultiCatch {
    //Jeżeli w bloku try{} umieścimy bardziej skomplikowany kod, to może się zdarzyć, że będzie on mógł wygenerować więcej niż 1 rodzaj wyjątku. W takiej sytuacji warto posłużyć się blokiem multi-catch, który pozwoli przechwycić każdy z wyjątków osobno i obsłużyć je w różny sposób.
    //
    //Poprzedni przykład rozszerzmy o możliwość wprowadzenia dwóch liczb, które będą zapisywane do tablicy z rozmiarze 2, a następnie poprosimy użytkownika o wybór wartości do wyświetlenia.
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj 1 liczbę: ");
                numbers[0] = scanner1.nextInt();
                scanner1.nextLine();
                System.out.println("Podaj 2 liczbę: ");
                numbers[1] = scanner1.nextInt();
                scanner1.nextLine();

                System.out.println("Którą wartość wyświetlić 1 lub 2 ?");
                System.out.println("Liczba: " + numbers[scanner1.nextInt() - 1]);
            } catch (InputMismatchException ex) { //Od Javy 7 istnieje również inny zapis, który pozwala wszystkie rodzaje wyjątków przechwycić w jednym bloku catch(). Robimy to rozdzielając typy wyjątków pionową kreską:
                // catch(InputMismatchException | ArrayIndexOutOfBoundsException ex
                System.out.println("Nie podałes liczby całkowitej, spróbuj jeszcze raz:");
                scanner1.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Miało być 1 lub 2, zacznijmy od nowa: ");
                scanner1.next();
            }
        } while (error);
        scanner1.close();

    }
}
//Wartości od użytkownika będą teraz przechowywane w tablicy numbers. W bloku try wczytujemy od użytkownika dwie liczby i umieszczamy je w tablicy. Następnie prosimy użytkownika podanie indeksu liczby, którą chce zobaczyć i wyświetlamy odpowiednią wartość z tablicy. Odwołujemy się do indeksu pomniejszonego o 1 względem liczby podanej przez użytkownika numbers[sc.nextInt() - 1] dzięki temu ktoś może podać liczbę w ludzkiej formie, a nie liczonej od 0.
//
//W powyższym kodzie mogą wystąpić dwa wyjątki:
//
//jeśli użytkownik wprowadzi zamiast liczby np. tekst, rzucony będzie wyjątek InputMismatchException,
//jeśli użytkownik poda jako indeks liczbę inną niż 1 lub 2, to przy odwoływaniu się do tablicy otrzymamy wyjątek ArrayIndexOutOfBoundsException.
//Cały problematyczny kod możemy objąć jednym blokiem try, ale dopisać do niego kilka bloków catch. W zależności od tego, który rodzaj wyjątku zostanie rzucony, to zostaniemy przeniesieni do odpowiedniego bloku catch.


//Jeżeli chcemy obsłużyć kilka wyjątków w jednym bloku catch, to możemy także przechwycić typ, który jest nadrzędny dla typów, które chcemy obsłużyć. Przykładowo jeśli chcemy obsłużyć ArrayIndexOutOfBoundsException i NullPointerException, to możemy obsłużyć nadrzędny dla nich RuntimeException lub jeszcze wyżej Exception:
//
//try{
////kod z błędami
//} catch(Exception ex) {
//	//dowolne instrukcje, np.:
//	ex.printStackTrace();}

//W praktyce lepiej definiować osobne bloki catch() dla różnych typów wyjątków, bo dzięki temu jesteśmy w stanie dostarczyć użytkownikowi naszej aplikacji bardziej precyzyjną informację niż "wystąpił błąd".