public class NoMoreSpaceException extends Exception {
    public NoMoreSpaceException(String message){
        super(message);
    }
}
//Ponieważ nasze wyjątki rozszerzają bezpośrednio klasę Exception, to znaczy, że są kontrolowane, a tym samym muszą zostać obsłużone. Jeżeli nasze klasy wyjątków, czyli NoMoreSpaceException i NoElementFoundException dziedziczyłyby po klasie RuntimeException, to nie musialyby byc obsluzone przez try and catch.