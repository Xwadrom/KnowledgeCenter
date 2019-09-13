public class BreakContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 00) {
                continue;
            }
            System.out.println("Pierwsza pętla: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Druga pętla " + i);


        }
    }
}
//break - powoduje przerwanie działanie aktualnej iteracji i wyjście z pętli,
//continue - powoduje przerwanie aktualnej iteracji i przejście do następnej iteracji.
//Pierwsza pętla przeskakuje do kolejnej iteracji, gdy wynik dzielenia modulo przez 2 wynosi 0, czyli gdy liczby są parzyste. W drugiej pętli dzięki instrukcji break powodujemy przerwanie działania i wyjście z pętli, gdy licznik osiąga wartość 5.
// IntelliJ oferuje funkcjonalność o nazwie Live Templates, czyli szablony fragmentów kodu, które mogą być wygenerowane podczas pisania programu. W celu wygenerowania tradycyjnej pętli for wpisz w edytorze po fori (tak jak for-iterate). Następnie możesz zdefiniować nazwę zmiennej, wciskając tab przeskoczyć do ograniczenia ilości powtórzeń i zatwierdzić szablon enterem.
//W przypadku, gdy w kodzie masz już zapisaną jakąś tablicę i chcesz zapisać pętlę for lub for each, która "przejdzie" przez elementy tablicy możesz użyć podobnego triku. W edytorze wpisz:
//
//nazwaTablicy.for (dla pętli for each)
//
//lub
//
//nazwaTablicy.fori (dla tradycyjnej pętli for)
//
//IntelliJ wygeneruje odpowiednią pętlę za ciebie.
