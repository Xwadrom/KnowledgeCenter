public class SwitchProgram {
    public static void main(String[] args) {

        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikacja danych");

        int option = 2;

        switch (option) {
            case 0:
                System.out.println("Koniec Programu");
                break;
            case 1:
                System.out.println("Dodawanie nowej osoby");
                break;
            case 2:
                System.out.println("Zmodyfikuj dane użytkownika");
                break;
            default:
                System.out.println("Opcja nieznana");
        }

    }
}
