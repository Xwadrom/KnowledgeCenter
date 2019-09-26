package klasyWewnetrzne;

public class Car {
    private Engine engine;
    private int fuel;

    public Car() {
        engine=new Engine("Ferrari");
        System.out.println("utworzono samochód z silnikiem:" + engine.engineType);
    }

    public void go() throws InterruptedException{
        while (fuel>0){
            engine.consumeFuel();
            System.out.println("Pozostało "+ fuel +" litrów paliwa.");
            Thread.sleep(1000);//Dzięki metodzie statycznej Thread.sleep(1000) - wstrzymujemy wątek (czyli w naszej sytuacji cały program) na 1 sekundę. Jako argument tej metody podajemy czas, na jaki chcemy wstrzymać działania aplikacji w milisekundach, stąd liczba 1000. Jeżeli pętla skończy działanie, to wyświetlamy komunikat o braku paliwa. Ponieważ metoda sleep() może wygenerować wyjątek kontrolowany InterruptedException, a my nie możemy z tym faktem raczej nic sensownego w tym miejscu zrobić, deklarujemy w sygnaturze metody ten fakt dopisując throws InterruptedException.
        }
        System.out.println("Brak paliwa");
    }

    public void refuel (int liters){
        fuel = fuel+liters;
    }


    public class Engine{
        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;
        int fuel;

        public Engine(String type){
            engineType=type;
        }

        public void consumeFuel(){
            fuel=fuel-FUEL_CONSUMPTION;
        }
        void consumeFuel2() {
            // pole klasy wewnętrznej - Engine
            this.fuel = 5;

            // pole klasy otaczającej - KlasyWewnetrzne.Car
            Car.this.fuel = 5;
            //W przypadku klas wewnętrznych zmienia się także nieco działanie słowa this, które jak może pamiętasz służyło nam do odwoływania się do przesłoniętych przez argumenty metod, czy konstruktorów pól klasy. Jeżeli w klasie wewnętrznej użyjemy słowa this to oznacza ono odwołanie się do pól klasy wewnętrznej. Żeby odwołać się do pola klasy otaczającej należy zastosować zapis KlasaZewnetrzna.this.
        }
    }
}
