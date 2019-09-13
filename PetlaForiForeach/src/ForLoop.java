public class ForLoop {

    //Pętlę for wykorzystywać będziemy w sytuacji, gdy z góry wiemy ile razy mają wykonać się pewne instrukcje. Na przykład jeśli wcześniej znamy rozmiar tablicy i chcemy ją uzupełnić kolejnymi liczbami 1, 2, 3, 4, ... N, to pętla for idealnie się do tego nadaje. Podobnie jeśli będziemy chcieli wyświetlić elementy dowolnej tablicy, albo wczytać od użytkownika znaną liczbę wartości.
    public static void main(String[] args) {


        int[] tab1 = new int[10];//Tworze tablice z 10 rzedami, czyli 10 tablic. Jest ona wypelniona teraz domyslnymi wartosciami.

        //W pętli for najczęściej znajdują się 3 elementy oddzielone średnikami (choć każdy z nich jest opcjonalny).
        // Pierwszym z nich jest wyrażenie początkowe - najczęściej deklaracja zmiennej będącej licznikiem pętli. Zauważ, że zmienna ta będzie dostępna tylko w ciele pętli, po kończącym nawiasie klamrowym dostęp do zmiennej i nie będzie już możliwy, dlatego w kolejnej pętli deklarację zmiennej i musimy powtórzyć.
        //Drugim elementem po średniku jest wyrażenie reprezentujące warunek stopu, które musi zwracać true lub false. W tym przypadku sprawdzamy, czy licznik pętli jest mniejszy od rozmiaru tablicy (numbers.length), który wynosi 10. Ponieważ jak pamiętasz tablice indeksowane są od 0, to również nasza zmienna została wcześniej zainicjalizowana liczbą 0, a pętla przerwie swoje działanie, gdy warunek i<numbers.length zwróci false.
        //Trzecim i ostatnim elementem w nawiasie pętli for jest wyrażenie, które modyfikuje licznik. W naszym przypadku po każdorazowym przypisaniu kolejnej liczby do tablicy, licznik zostaje zwiększony o 1 aż do momentu, kiedy i=10 i kiedy warunek zwróci false.
        //W każdym przebiegu pętli wykonane będą wszystkie instrukcje, które zamieścimy w ciele pętli, czyli pomiędzy nawiasami klamrowymi. Oczywiście możemy tam umieścić nie tylko instrukcję przypisania, czy wyświetlenia informacji, ale także warunki if, albo kolejną pętlę (np. do uzupełnienia tablicy dwuwymiarowej). W naszej pętli for do kolejnych elementów tablicy przypisujemy wartość licznika powiększoną o 1 (ponieważ przyjmuje on wartości od 0 do 9, a my chcieliśmy w tablicy wartości od 1 do 10).
        for (int i = 0; i < tab1.length; i++) {
            tab1[i]= i+1;
        }

        for(int i = 0; i < tab1.length; i++)
            System.out.println("Liczba: "+ tab1[i]);

    }
}