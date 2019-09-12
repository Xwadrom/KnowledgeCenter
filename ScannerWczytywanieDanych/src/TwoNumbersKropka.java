//Jeżeli chcemy używać jednego formatu liczb, czyli używać kropki zarówno w kodzie jak i we wprowadzanych danych, możemy wymusić lokalizację, ustawiając ją np. na Stany Zjednoczone. Robimy to przez wywołanie metody useLocale() z parametrem klasy Locale.


import java.util.Locale;
import java.util.Scanner;

public class TwoNumbersKropka {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        scanner1.useLocale(Locale.US);//Od teraz liczby możesz wprowadzać w formie z kropką (chyba, że wolisz pozostać przy przecinku - wtedy ustaw lokalizację na któryś z krajów europejskich). Po wpisaniu Locale. i wciśnięciu kombinacji Ctrl+Spacja środowisko podpowie ci inne stałe takie jak GERMANY, czy ITALY.

        System.out.println("Podaj A: ");
        double a=scanner1.nextDouble();
        System.out.println("Podaj B: ");
        double b=scanner1.nextDouble();
        System.out.println("A+B="+(a+b));

        scanner1.close();
    }
}
