public class Calculator {

    int a;
    int b;
    int c;

    int add(int a, int b) {
        int sum = a + b;
        System.out.println("A + B = "+ sum);
        return sum;

    }

    int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("A + B + C= "+sum);
        return sum;
    }

    int sub(int a, int b) {
        int sub = a - b;
        System.out.println("A - B = "+sub);
        return sub;
    }

    int sub(int a, int b, int c) {
        int sub = a - b - c;
        System.out.println("A - B - C= "+sub);
        return sub;

    }
}

//    Napisz program - kalkulator, który będzie składał się z dwóch klas:
//
//        Calculator,
//        CalcTest.
//        W klasie Calculator zdefiniuj metody add (dodaj) i subtract (odejmij) w kilku przeciążonych wersjach, aby mogły dodawać lub odejmować 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.
//
//        W klasie CalcTest przetestuj działanie klasy Calculator.
