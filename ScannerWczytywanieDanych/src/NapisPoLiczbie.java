import java.util.Scanner;
//Z klasą Scanner wiąże się jedno dziwne zachowanie. Metody pozwalające na odczyt liczb takie jak nextInt(), czy nextDouble() pozwalają odczytać jedynie liczby, jednak nie "konsumują" znaku nowej linii "\n" który doklejany jest po wciśnięciu Entera. Jeśli więc bezpośrednio po wczytaniu liczby spróbujesz wczytać napis, to zobaczysz przeskoczenie do kolejnej instrukcji.
public class NapisPoLiczbie {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int number = scanner1.nextInt();

        scanner1.nextLine();//Jeżeli chcesz uniknąć sytuacji jaka występuje w powyższym przykładzie, to w programach mieszających wczytywanie liczb i napisów zawsze po instrukcjach takich jak nextInt(), czy nextDouble() wywołaj metodę nextLine() w celu "skonsumowania" znaku nowej linii.

        System.out.println("Podaj slowo");
        String word = scanner1.nextLine();

        System.out.println(number);
        System.out.println(word);

    }
}
