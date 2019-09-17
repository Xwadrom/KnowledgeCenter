import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {



        Scanner scanner1 = new Scanner(System.in);
        Hospital hospital1 = new Hospital();

        Patient[] array1 = new Patient[10];

        int i = -1;


        while (i < 10) {
            System.out.println(" Wybierz opcje: ");
            System.out.println(" 0. Wyjście z programu ");
            System.out.println(" 1. Dopisanie pacjenta do kolejki");
            System.out.println(" 2. Wyświetlenie listy zapisanych pacjentów");
            System.out.println();
            int opcja = scanner1.nextInt();

            if (opcja == 1) {
                array1[++i] = hospital1.createPatient();
                System.out.println("Pacjent: "+ array1[i].getFirstName()+" "+array1[i].getLastName()+" Dopisany do kolejki");

                    if(i>=10){
                        System.out.println("Maksymalna Liczba zapisanych pcajentów to 10.");
                    }

            } else if (opcja == 2) {
                for (int b =0; b<i+1; b++ ) {

                    System.out.println(array1[b].getFirstName()+" "+array1[b].getLastName()+" "+array1[b].getPesel());
                }



            } else if (opcja == 0) {
                System.out.println("Zamykam aplikację.");
                i=20;

            } else System.out.println("Wybrany błędny numer opcji.");


        }


    }
}
