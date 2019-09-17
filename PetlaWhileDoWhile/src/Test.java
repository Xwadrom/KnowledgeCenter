import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);

        final int number=30;
        int userInput = 0;

        System.out.println("Zgadnij Liczbę: ");

        while(userInput!=number){
            userInput=scanner1.nextInt();
            if(userInput>number){
                System.out.println("Liczba za duża.");
            }else if(userInput<scanner1.nextInt()) System.out.println("Liczba jest za mała");
        }
        System.out.println("Brawo Zgadles.");
    }
}
