public class ShortOperators {


    public static void main(String[] args) {
        int x = 10;
        x += 5;
        System.out.println(x); // x ma wartość 15
        x *= 3;
        System.out.println(x); // x ma wartość 45
        x /= 5;
        System.out.println(x); // x ma wartość 9
        x -= 2;
        System.out.println(x); // x ma wartość 7
        x %= 4;
        System.out.println(x);// x ma wartość 3

        x=5;
        System.out.println(x+=4.8);// to jest tożsame z x = (int)(x + 4.8);
//x jest zmienną typu int, a wynik działania x + 4.8 jest wartością typu double. Teoretycznie powyższy zapis nie powinien więc być możliwy. Operatory skrócone dokonują jednak niejawnej konwersji wyniku
    }
}
