public class Car2 {
    private static final double FUEL_CONSUMPTION = 8; // 8l/100km
    private static final double MAX_FUEL = 50;
    private double fuel;

    void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maxymalnie " + (MAX_FUEL - fuel));
        else
            fuel += additionalFuel;
    }

    void drive(){
        if(fuel - FUEL_CONSUMPTION<0)
            throw new IllegalStateException("Masz za mało paliwa na podróż, zatankuj.");
            else
                fuel-= FUEL_CONSUMPTION;
    }
    @Override
    public String toString(){
        return "Stan paliwa: "+fuel;
    }
}
//Zamiast wyświetlać komunikaty o błędach w metodzie refuel() tworzymy obiekt wyjątku IllegalArgumentException i rzucamy go przy pomocy instrukcji throw. W metodzie drive() robimy podobnie, ale rzucamy wyjątek typu IllegalStateException.
//
//W Javie istnieje wiele klas wyjątków, my wykorzystaliśmy tylko dwie z nich. W praktyce nie ma znaczenia, czy rzucamy wyjątek IllegalArgumentException, czy IllegalStateException. Oba wpływają w taki sam sposób na działanie naszego programu, a to którego użyjemy ma służyć przede wszystkim czytelności kodu.