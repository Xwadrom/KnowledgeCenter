import java.util.Scanner;

public class PetlaBezTablic {
    public static void main(String[] args) {
        Scanner scanner1= new Scanner(System.in);


        System.out.println("Ile liczb chcesz wprowadzić do systemu: ");
        int b = scanner1.nextInt();
        int wynik =0;


        while(b-- > 0){
            System.out.println("Podaj Liczbę: ");
            wynik = wynik + scanner1.nextInt();
        }




        System.out.println("Suma elementów tablicy to: "+ wynik);
    }
}
//Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb użytkownik chce wprowadzić. Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie. W programie wykorzystaj co najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne liczników pętli) i nie używaj tablic.