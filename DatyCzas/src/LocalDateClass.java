import java.time.LocalDate;

public class LocalDateClass {
    //LocalDate jest klasą podobną pod względem funkcjonalności do LocalTime, jednak istotą jej istnienia jest reprezentacja daty (rok, miesiąc, dzień), a nie reprezentacji czasu (godzina, minuta, sekunda).
    public static void main(String[] args) {
LocalDate now = LocalDate.now();
LocalDate firstJan2014 = LocalDate.of(2014,1,1);

boolean check = now.isAfter(firstJan2014); //Prosty program, który porówna dwie daty:
        System.out.println("Czy "+ now + "jest po "+ firstJan2014 + "?");
        System.out.println(check);

//Ponownie istnieją dwa główne sposoby tworzenia obiektów tego typu. Zestaw metod także jest bardzo podobny:
//getYear() - reprezentuje rok zapisany w danym obiekcie LocalDate,
//getMonth() - reprezentuje miesiąc zapisany w danym obiekcie LocalDate,
//getDay() - reprezentuje dzień  zapisany w danym obiekcie LocalDate,
//Oprócz tego możemy dowiedzieć się, który jest dzień roku, czy miesiąca za pomocą metod takich jak:
//getDayOfYear() - zwraca informację, który to dzień roku,
//getDayOfMonth() - zwraca informację, który to dzień miesiąca,
//getDayOfWeek() - zwraca informację, który to dzień tygodnia.

    }
}
