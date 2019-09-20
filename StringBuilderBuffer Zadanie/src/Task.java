import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ile wyrazów chcesz wprowadzić?");
        int count = scanner1.nextInt();
        scanner1.nextLine();

        String[] words = new String[count];

        for (int  i = 0; i < count; i++) {
            System.out.println("Podaj wyraz: ");
            words[i]=scanner1.nextLine();
        }
        System.out.println("Słowo stworzone z ostatnich liter podanych przez Ciebie wyrazów");
        for(String tmp: words){

            System.out.print(tmp.charAt(tmp.length()-1));

        }
        scanner1.close();
    }
}
//Zadanie
//        Pobierz od użytkownika liczbę, która określać będzie ile wyrazów użytkownik chce wprowadzić. Następnie wczytaj od niego listę ciągów znaków na podstawie, których wygenerujesz wynik.
//
//        Wynikiem jest wyraz składający się z ostatnich liter każdego z wprowadzonych słów.