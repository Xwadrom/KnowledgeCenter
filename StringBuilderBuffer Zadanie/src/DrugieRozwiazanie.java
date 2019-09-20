import java.util.Scanner;

public class DrugieRozwiazanie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę wyrazów: ");
        int wordsNumber = input.nextInt();
        input.nextLine();

        String[] words = new String[wordsNumber];

        for (int i = 0; i < wordsNumber; i++) {
            System.out.println("Podaj kolejne słowo: ");
            words[i] = input.nextLine();
        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < wordsNumber; i++) {
            build.append(words[i].charAt(words[i].length() - 1));
        }

        System.out.println("Nowe słowo: " + build.toString());

        input.close();
    }
}
//Po utworzeniu obiektu Scanner wczytujemy od użytkownika ilość słów, które chciałby wprowadzić i zapamiętujemy ją w zmiennej wordsNumber. Następnie tworzymy tablicę words o zadanej wielkości i wczytujemy do niej kolejne słowa.
//
//Do utworzenia napisu wynikowego użyjemy obiektu typu StringBuilder. Z praktycznego punktu widzenia w tym miejscu równie dobrze mogliśmy skorzystać z operatora konkatenacji, ponieważ kwestia wydajności jest pomijalna, jednak dla treningu wykorzystajmy metodę append().
//
//Do odczytania ostatniego znaku w kolejnych słowach wykorzystujemy metodę charAt(). Przyjmuje ona indeks litery, którą chcemy odczytać ze słowa. Długość słowa znamy dzięki metodzie length() jednak musimy ją pomniejszyć o 1, ponieważ podobnie jak w przypadku tablic mamy tutaj do czynienia z indeksowaniem od 0.
//
//Na końcu wyświetlamy nasz gotowy wyraz wywołując metodę toString() na obiekcie builder.