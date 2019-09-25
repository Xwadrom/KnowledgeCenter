package StaticMethods;

public class StringUtil {
    //To co ważne, to fakt, że dodając metodę domyślną do interfejsu, nie "psujemy" reszty kodu, który z tego interfejsu korzysta.
    //
    //Możliwość taką wprowadzono ponieważ w innym przypadku nie dało się dodać do istniejących już w Javie interfejsów nowych metod bez niszczenia kompatybilności wstecznej. Przykładowo jeśli w naszym wcześniejszym przykładzie z kształtami dopisalibyśmy sobie dodatkową metodę w interfejsie Shape i metoda ta nie byłaby domyślna, to automatycznie nasz projekt przestanie się kompilować dopóki nie zaimplementujemy tych metod w klasach Rectangle i Circle.
    static String revert (String original){
        return new StringBuilder(original).reverse().toString();//Powyższa metoda odwraca tekst przekazany jako argument.
    }

    public static void main(String[] args) {
        System.out.println(revert("Sklepik"));
    }
}
