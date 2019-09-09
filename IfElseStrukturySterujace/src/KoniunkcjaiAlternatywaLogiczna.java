public class KoniunkcjaiAlternatywaLogiczna {
    public static void main(String[] args) {

        User user1 = new User("Jan", "Kowalski");

        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikacja danych");

        int option = 2;

        if (option == 0) {
            System.out.println("Zamykam program");
        }
        else if (option == 1) {
            System.out.println("Użytkownik: "+ user1.getFirstName()+" "+user1.getLastName());
        }
        else if (option == 2) {
            user1.setFirstName("Damian");
            user1.setLastName("Nowak");
            System.out.println("Zmodyfikowane dane Uzytkownika: "+ user1.getFirstName()+" "+user1.getLastName());
        }
        else {
            System.out.println("Błędna opcja");
        }
        }
    }
