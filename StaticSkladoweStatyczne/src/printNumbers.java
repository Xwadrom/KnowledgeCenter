import java.util.Scanner;

class PrintNumbers {

    private static final int EXIT = 0;

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start, end;
        do {
            System.out.println("Pierwsza liczba: ");
            start = input.nextInt();
            System.out.println("Druga liczba: ");
            end = input.nextInt();
            printNumbers(start, end);

            System.out.println("Koniec programu, wprowadź 0");
            System.out.println("Kontynuuj, wprowadź 1");
        } while (input.nextInt() != EXIT);

        input.close();
    }
}//Oprócz metody main, która musi być statyczna stworzyliśmy również metodę printNumbers() odpowiedzialną za wydrukowanie liczb z przedziału podanego przez użytkownika. Ponieważ odwołujemy się do niej z wnętrza metody main, ją również musieliśmy oznaczyć jako static.

//Zapamiętaj
//Klasa może zawierać pola i metody statyczne.
//Pola statyczne najczęściej będą połączone ze słowem final i będziemy je wtedy nazywali stałymi. Stałe nazywamy WIELKIMI_LITERAMI.
//Pola statyczne istnieją tylko w jednym egzemplarzu w ramach całej aplikacji i powiązane są z klasą, niezależnie od tego ile obiektów danej klasy utworzysz.
//Metody statyczne mogą się odwoływać tylko do innych składowych statycznych.