import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner scanner1=new Scanner(System.in);
        int sum=0;
        int []array1=new int[100];
        int i=0;

        while(sum<100) {

            System.out.println("Podaj liczbę: ");
            array1[i] = scanner1.nextInt();
            sum = sum + array1[i];


            if (sum%2==0&&i>0){
                System.out.println("Suma jest parzysta");
            }else if(sum%2!=0&&i>0) System.out.println("Suma jest nieparzysta");

            i++;

        }
        System.out.println(sum);

    }
}
