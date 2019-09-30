public class OperatortrojargumentowyParzystosc {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(11);
    }

    static void checkNumber(int n) {
        String check = n % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(n + " " + check);
    }

}
///W metodzie checkNumber() sprawdzamy, czy liczba n jest podzielna przez 2 (n%2) - jeśli tak, to przypisujemy do zmiennej check napis "Parzysta", jeśli wartość z dzielenia wynosi 1 to przypisujemy "Nieparzysta", a następnie wyświetlamy na ekranie.