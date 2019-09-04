public class Conversions {
    public static void main(String[] args) {

        int a = 10;
        double b = 5.8;
        double c= a;// konwersa rozszerzajaca w której nie trzeba wpisywać =(double) a, bo double przyjmie kazda liczbe int
        int d = (int) b;//konwersja zawęzajaca w której trzeba wpisac =(int) b, bo int nie przyjmie cyfr po przecinku i je poucina, a potem po wpisaniu znowu double te dane beda juz uciete i nie do odzyskania
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        double number1= 10.987;
        int number2= 5;

        int narrowing= (int) number1;// konwersja zawężająca (eng. narrowing)
        System.out.println("Narrowing:"+narrowing);

        double widening= number2;// konwersja rozszerzająca (eng. widening)
        System.out.println("Widening:"+widening);

        char letter1='k';
        char letter2='o';
        char letter3='t';

        System.out.println("Błędne \"sumowanie\" znaków");// jeśli chcemy zeby program wypisał cudzysłow dajemy przed nim slash\
        System.out.println(letter1+letter2+letter3);
        System.out.println("Tekst jawny");
        System.out.println(" " +letter1+letter2+letter3);
        letter1++;
        letter2++;
        letter3++;
        System.out.println("Tekst zaszyfrowany");
        System.out.println("" +letter1+letter2+letter3);

    }
}
