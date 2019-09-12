import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Podaj Liczbę A, z separatorem przecinka: ");
        double a = scanner1.nextDouble();
        System.out.println("Podaj Liczbę B, z separatorem przecinka: ");
        double b = scanner1.nextDouble();
        scanner1.close();

        System.out.println("Liczba A: "+a);
        System.out.println("Liczba B: "+b);
    }
}
//Jak już doskonale wiesz w liczbach zmiennoprzecinkowych w Javie jako separator wykorzystywany jest znak kropki. Problem w tym, że obiekt klasy Scanner wykorzystuje ustawienia maszyny wirtualnej, więc jeśli nasz program uruchomimy na komputerze z polskim systemem operacyjnym to domyślnym separatorem będzie przecinek, a np. na systemie z ustawioną lokalizacją jako Stany Zjednoczone, separatorem będzie kropka.