
public class NumberAdderRecurent {
    public static void main(String[] args) {

        int number = sum(500);
        System.out.println(number);
    }

    static int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+" + "sum(" + (n - 1) + ")");
            return n + sum(n - 1);
        } else {
            return n;
        }
    }

}
///W metodzie sum() przekazujemy jako argument liczbę ograniczającą nasz zbiór do zsumowania "z góry". Jeżeli liczba ta jest większa od 0 to wywołujemy instrukcję n + sum(n-1), czyli dodajemy liczbę n oraz wynik działania metody sum() z argumentem pomniejszonym o 1.
//
//Jeśli metoda sum() dojdzie do momentu, gdzie argument jest równy 1, następne wywołanie rekurencyjne już nie następuje, ponieważ przechodzimy do bloku else, gdzie po prostu zwracamy sam parametr (liczbę 1).
//W typowych wywołaniach rekurencyjnych można wyróżnić dwie fazy. Pierwsza to faza "schodzenia", czyli odkładania na stosie kolejnych ramek z wywołaniami metody, a dalej następuje zwracanie kolejnych wyników i przekazywanie ich z powrotem sumując w ostateczny wynik.
//
//W związku z tym, że pamięć na stosie jest zazwyczaj mocno ograniczona, to w przypadku zdefiniowania błędnego warunku i/lub zbyt dużej ilości wywołań metody może dojść do przepełnienia stosu, czyli błędu StackOverflowError. W celu zobrazowania problemu możesz spróbować wywołać powyższą metodę z dużym argumentem typu 5000000.

//Domyślny rozmiar stosu maszyny wirtualnej można zmodyfikować korzystając z flagi -Xss. np.
//
//java -Xss100m NumberAdder