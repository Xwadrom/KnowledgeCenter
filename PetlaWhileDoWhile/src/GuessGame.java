import java.util.Scanner;

public class GuessGame{
    public static void main(String[] args) {

        Scanner scanner1=new Scanner(System.in);

        final int number = 500;
        int userinput;//trzeba zdeklarowac wczesniej zmienna bo w pętli nie bedziemy mogli tego zrobić.
        System.out.println("Zgadnij liczbę: ");

        while ( (userinput= scanner1.nextInt() ) !=number ){//userInput = reader.nextInt() - wczytanie liczby od użytkownika. (userInput = reader.nextInt()) != number - tutaj następuje porównanie zmiennej userInput z number. Jeśli liczby są różne, to wynikiem porównania będzie true, a jeśli liczby będą równe wynikiem będzie false i tym samym wyjdziemy z pętli
            if (userinput>number){
                System.out.println("Podana liczba jest za duża, zgaduj dalej.");
            }else System.out.println("Podana liczba jest za mała, zgaduj dalej.");
        }
        System.out.println("Brawo zgadłeś liczbę!");
    scanner1.close();
    }

}
//Teraz następuje istota samej pętli while. Dopóki wprowadzane liczby będą różne od podanego przez nas 500, dopóty warunek pętli będzie prawdziwy (true) i pętla będzie powtarzała swoje działanie. Jeśli użytkownik zgadnie więc liczbę w pierwszym podejściu, instrukcje wewnątrz pętli while nie wykonają się ani razu i od razu zostanie wyświetlony komunikat z gratulacjami. W pętli while często stosuje się taką odwrotną logikę, czyli "powtarzaj pętlę dopóki liczba jest błędna" zamiast "powtarzaj pętlę dopóki liczba jest prawidłowa".