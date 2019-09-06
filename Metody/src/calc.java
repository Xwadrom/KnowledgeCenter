public class calc {

    //typ_zwracany nazwaMetody(opcjonalne parametry np. liczby na ktorych chcemy wykonac operacje) {
    // jeśli w typie zwracanym nie ma void to tutaj będzie musiało pojawić się return
    // }

    int addTwoNumbers(int a, int b) {
        int sum = a + b; //zmienna sum jest lokalna widoczna tylko w tej klasie, jesli w klasie test dodamy zmienną sum, będzie ona widoczna tylko tam.
        return sum; // zwraca wynik, ale nie wyswietla

//        int addTwoNumbers (int a, int b){            //skrócona wersja
//            return a + b;
//
    }

    void addAndPrint(int x, int y)//metody void uzywa sie zawyczaj po to aby cos w niej wyswietlic
    {
        int sum = x + y;
        System.out.println(sum);

//        void addAndPrint(int x, int y)
//        {
//            int wynik =addTwoNumbers(x, y);
//            System.out.println(wynik);
//
//    }

    }
}

