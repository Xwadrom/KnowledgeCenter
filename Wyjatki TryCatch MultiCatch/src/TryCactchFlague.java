import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCactchFlague {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number=0;
        boolean error=true;

        do{
            try{
                number = scanner1.nextInt();
                error = false;
                System.out.println("Wczytana liczba to: "+number);
            }catch(InputMismatchException ex){
                System.out.println("Nie podałes liczby całkowitej spróbuj jeszcze raz:");
                scanner1.nextLine();
            }
        }while (error);

        System.out.println(number);

        scanner1.close();
    }
}

//Oprócz zmiennej number zainicjowaliśmy zmienną error. Ponieważ korzystamy z pętli do while to pętla wykona się przynajmniej raz. Jeżeli ktoś poda prawidłową wartość, to ustawiamy zmienną error na false i pętla nie wykona się ponownie. Jeśli ktoś poda np. napis zamiast liczby, to wiersz error = false; się nie wykona, bo sterowanie zostanie przeniesione do bloku catch. Tym samym w przypadku podania błędnej wartości zmienna error cały czas będzie miała wartość true i pętla będzie się powtarzać.
//
//W bloku catch oprócz wyświetlenia komunikatu o błędzie wywołujemy metodę nextLine(). Jest to konieczne, ponieważ chcemy pozbyć się z bufora konsoli błędnej wartości, którą wprowadził użytkownik.
//
//W ten sposób program nie zwróci błędu, a nasz program stał się "idiotoodporny".
