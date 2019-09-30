import java.math.BigDecimal;
import java.math.BigInteger;

public class Bignumbers  {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println(a-b);//wynik 0.39999999997
        BigDecimal abig=BigDecimal.valueOf(a);
        BigDecimal bbig=BigDecimal.valueOf(b);
        System.out.println(abig.subtract(bbig));// wynik 0.4
        //Obie klasy są typami obiektowymi, nie możemy więc na nich wykonywać bezpośrednio obliczeń za pomocą prostych operatorów (+, -, *, /), nie działa w ich przypadku mechanizm autoboxingu i unboxingu - zawsze musimy posługiwać się metodami.
        //
        //Obiekty powyższych klas można stworzyć albo na podstawie liczby reprezentowanej jako String, albo na podstawie istniejących wartości liczbowych typów prostych.

        BigInteger big1=new BigInteger("2354253462346236563455778");
        BigDecimal big2=BigDecimal.valueOf(0.7);
        System.out.println(big1);


        //big1.add(big1);

        //W celu wykonania obliczeń na liczbach, należy posługiwać się metodami:
        //
        //add() - dodawanie
        //subtract() - odejmowanie
        //multiply() - mnożenie
        //divide() - dzielenie

    }
}
//    Kiedy stosować klasy BigDecimal/BigInteger
//        Używaj ich przede wszystkim wtedy, kiedy jest to niezbędne, czyli np. w przypadku obliczeń finansowych, gdzie precyzja jest niezbędna. Pamiętaj jednak, że pomimo tego, że są to klasy o dużych możliwościach to są to obiekty i każde działanie na nich sprawia, że tworzenie nowych obiektów, czy obliczenia są dużo bardziej kosztowne obliczeniowo, a tym samym mogą odbijać się na wydajności Twojej aplikacji.
//
//        W większości zastosowań zdecydowanie powinny CI wystarczyć liczby typów podstawowych.