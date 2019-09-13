import java.util.Scanner;

public class ForEachProblem {
    public static void main(String[] args) {

        int[]numbers = new int [3];
        Scanner scanner1=new Scanner(System.in);

        for(int tmp: numbers){
            System.out.println("Podaj Liczbę:");
            tmp=scanner1.nextInt();
        }

        for (int tmp:numbers){
            System.out.println(tmp);
        }
                scanner1.close();
    }
}
//Po uruchomieniu powyższego programu na pierwszy rzut oka możemy się spodziewać, że na ekranie zostaną wypisane wartości wprowadzone z klawiatury. Wyświetlane są jednak trzy zera. Spowodowane jest to tym, że kolejne liczby przypisywaliśmy tylko do zmiennej tmp, a nie do tablicy.