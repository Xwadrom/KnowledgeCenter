import java.util.Scanner;

public class ForEachProblemSolved {
    public static void main(String[] args) {
        int[]numbers=new int[3];
        Scanner scanner1 = new Scanner(System.in);

        for(int i=0; numbers.length>i; i++){
            System.out.println("Podaj Liczbę: ");

            numbers[i]=scanner1.nextInt();
        }

        for(int tmp: numbers){
            System.out.println(tmp);
        }
    }
}
//Poprawna wersja tego programu do uzupełnienia tablicy powinna używać tradycyjnej pętli for.