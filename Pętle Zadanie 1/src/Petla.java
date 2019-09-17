import java.util.Scanner;

public class Petla {
    public static void main(String[] args) {

        Scanner scanner1= new Scanner(System.in);


        System.out.println("Ile liczb chcesz wprowadzić do systemu: ");
        int b = scanner1.nextInt();

        int [] tab1= new int[b];



        for(int i=0; tab1.length>i; i++){
            System.out.println("Podaj Liczbę: ");

            tab1[i]=scanner1.nextInt();
        }

        int wynik =0;
        for (int i=0; i<b; i++) {
            wynik += tab1[i];
        }

        System.out.println("Suma elementów tablicy to: "+ wynik);

    }
}
