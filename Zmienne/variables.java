public class variables {
    public static void main(String[] args) {
        String firstName = "Jan";// Konwencją nazewnictwa zmiennych jest tzw. lowerCamelCase
        var lastName = "Kowalski";// var automatycznie określa typ zmiennej, ale nie można już go potem zmienić
        final String pesel = "1234567890";// zmiennej final nie da się już później zmienić na inną - w dalszej części kodu, tak jak zrobilem to poniżej z firstName
        int age = 25;// wiek będzie wyrażany w liczbie całkowitej
        double height = 180.5;// dla double mozna wpisac liczbe po przecinku, do 16 miejsc

        System.out.println(firstName + " " + lastName +" ma "+ age +" lat");
        System.out.println("Pan " + lastName + " ma pesel " + pesel);
        System.out.println( firstName + " ma wzrost " + height +"cm");
        System.out.println("Jeżeli "+ firstName+ " urośnie o 5cm, to będzie miał " + (height + 5) +" cm");// działania w nawiasie

        firstName = "Krzysztof";// od tej pory zmienna firstName będzie miała nowe imię
        System.out.println(firstName);
    }
}
// Przypisanie wartosci do zmiennej to inicjalizacja lub inicjacja
//String firstName;  jest to deklaracja
//firstName = "Jan"; jest to inicjalizacja
// String firstName = "Jan"; połączenie deklaracji z inicjalizacją