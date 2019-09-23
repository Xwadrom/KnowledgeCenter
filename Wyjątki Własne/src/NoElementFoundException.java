public class NoElementFoundException extends Exception {

    public NoElementFoundException (String message){
        super(message);
    }
}
//Obie klasy wyjątków rozszerzają klasę Exception, ponieważ chcemy, aby wymusić ich obsługę. Definiujemy jeden konstruktor przyjmujący dowolny komunikat, który będzie mógł być później wyświetlony. Komunikat będzie zapisany w polu prywatnym z klasy Exception. Możemy go zapisać korzystając z instrukcji super(), która pozwala wywołać konstruktor klasy, po której dziedziczymy.