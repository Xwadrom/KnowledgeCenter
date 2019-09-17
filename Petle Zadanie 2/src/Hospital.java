import java.util.Scanner;

public class Hospital {

    private Scanner scanner1=new Scanner(System.in);

public Patient createPatient(){
    System.out.println("Podaj imię pacjenta: ");
    String firstName=scanner1.nextLine();
    System.out.println("Podaj nazwisko pacjenta: ");
    String lastName=scanner1.nextLine();
    System.out.println("Podaj Pesel pacjenta: ");
    int pesel=scanner1.nextInt();
    scanner1.nextLine();
    return new Patient (firstName, lastName, pesel);
    }

}
