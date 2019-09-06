public class NumberPrinter {

    void printNumber(int a){  //jesli przekazemy 5 to bedzie wywolana ta metoda
        System.out.println(a);
    }

    void printNumber(int a, int b) {
        printNumber(a); //najpierw wywołujemy metodę, która jest na górze i przekazujemy do niej pierwszy parametr a
        System.out.println(b);

    }
    void printNumber(int a, int b, int c) {
        printNumber(a,b);
        System.out.println(c);
    }

    void printNumber(String a){ //jesli przekazemy np. abcd to bedzie wywolana ta metoda
        System.out.println(a);
    }
}
//Jeżeli w ramach jednej klasy definiujemy metody o takiej samej nazwie, to muszą one mieć inną liczbę parametrów lub typy tych parametrów muszą być różne.
//Jeżeli w klasie istnieje kilka konstruktorów, to mówimy, że są one przeciążone. Konstruktory takie muszą się różnić liczbą parametrów lub w przypadku takiej samej liczby parametrów ich typy muszą być różne.