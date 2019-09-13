import java.util.Scanner;

public class ParityChecker {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);


        for(int i = 0; i<3;i++){// ten warunek oznacza wykonaj pętle 3 razy, por sprawdzeniu warunku i<3 i zwrócenie wartośći true wykonywane są działania w pętli, następnie jest zwiększony licznik i++
            //W pętli for inicjujemy licznik liczbą 0, ponieważ chcemy wczytać trzy liczby to warunek stopu ustawiliśmy na i<3 (dla wartości i=0, 1, 2 otrzymamy true) i w każdym przebiegu pętli zwiększamy licznik przy pomocy inkrementacji(i++).
            //Kolejność wykonywania pętli for to:
            //Zainicjowanie licznika.
            //Sprawdzenie warunku.
            //Jeśli warunek jest spełniony, to wykonywane są instrukcje w ciele pętli, wykonywane jest wyrażenie modyfikujące licznik, po czym wracamy do punktu 2.
            //Jeśli warunek nie jest spełniony, to wychodzimy z pętli.
            System.out.println("Podaj liczbę: ");
            int digit= scanner1.nextInt();

            if(digit % 2 == 0){
                System.out.println("Liczba: "+ digit+" jest parzysta");
            }else System.out.println("Liczba: "+ digit+" jest nieparzysta");

        }
        scanner1.close();//Na końcu zamykamy strumień w Scannerze. Warto tutaj zwrócić szczególną uwagę na to, żeby Scannera nie zamknąć np. wewnątrz pętli, a dopiero wtedy kiedy już nie będziemy z niego korzystali. Jeśli wywołamy metodę close() to nie będzie już możliwe wczytanie niczego więcej.
    }
}
