public class MathOperators {
    public static void main(String[] args) {
        int x=10;
        int y=4;
        int sum= x+y;
        int sub = x - y; // odejmowanie
        int multi = x * y; // mnożenie
        double div = x / y; // dzielenie całkowitoliczbowe będzie niedokładne mimo tego ze jest double, bo zmienne są int
        int mod = x % y;

        System.out.println(sum*sum);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);// % modulo reszta z dzielenia
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

//            y = y * 5;
        y *= 5;
        System.out.println("Nowy Y: " + y);

        double a = 10;
        int b = 4;
        double div2 = a / b; // Żeby otrzymać w wyniku 2.5, co najmniej jeden z operandów dzielenia musi być zmiennoprzecinkowy. Nastąpi wtedy tzw. promocja typu, czyli uogólnienie typu int do typu double i w wyniku otrzymamy wynik zmiennoprzecinkowy
        System.out.println(div2);

    }
}
