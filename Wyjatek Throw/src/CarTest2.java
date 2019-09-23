public class CarTest2 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        try {
            car.refuel(60);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
        try {
            car.drive();
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
    }
}

//Wywołania metod refuel() oraz drive() opakowaliśmy w bloki try catch. Ponieważ metoda refuel() wywołana z argumentem 60 jest niepoprawna, to obiekt wyjątku IllegalArgumentException, który stworzyliśmy i rzuciliśmy z jej wnętrza, zostanie przypisany do parametru ex klauzuli catch. Metoda getMessage() pozwala wyciągnąć z obiektu wyjątku wiadomość, którą ustawiliśmy przy wywoływaniu konstruktorów IllegalArgumentException lub IllegalStateException w klasie Car.
//Doszliśmy do efektu takiego samego jak wcześniej z instrukcją if-else, jednak teraz nasze rozwiązanie jest bardziej uniwersalne. Rozwiązanie nie jest przywiązane tylko do konsoli. Przykładowo jeśli klasy Car zamiast w klasie CarTest użylibyśmy w projekcie z graficznym interfejsem użytkownika, to komunikaty o błędach moglibyśmy ustawiać w wygodny sposób jako etykiety lub inne elementy w okienku aplikacji zapisując schematycznie: