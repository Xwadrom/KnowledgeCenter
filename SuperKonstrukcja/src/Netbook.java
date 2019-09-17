public class Netbook extends Computer{

    private int batteryCapacity;


    public Netbook(double cpuTempereture, int ramMemory, int batteryCapacity) {
        super(cpuTempereture, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    //Jeżeli w klasie Computer dodamy metodę coolDown(), obniżającą temperaturę procesora.
    //to możemy ją nadpisać w klasie Notebook. Nadpisana metoda coolDown() powinna obniżyć temperaturę procesora tak samo jak metoda w klasie Computer, ale ponieważ laptopy mają zamontowany dodatkowo specjalny układ chłodzenia, to obniżymy temperaturę procesora o dodatkowe dwa stopnie wywołując dodatkowo metodę turboCool().

private void turboCool(){
        setCpuTempereture(getCpuTempereture()-2);
}

    @Override
    public void coolDown() {
        super.coolDown();//tego nie musi byc, daje - 1
        turboCool();// daje dodatkowe -2
    }


    //Wywołanie metody coolDown() bez poprzedzenia jej słowem super oznaczałoby wywołanie metody z klasy, w której się znajdujemy (Notebook), co spowodowałoby zapętlenie się wywołania przez samą siebie i ostatecznie przepełnienie stosu (błąd StackOverflowError).
    //najpierw wywoływana jest metoda coolDown() z klasy Computer, która obniża temperaturę o 1 stopień, a następnie wywoływana jest metoda turboCool() z klasy Notebook, która obniża temperaturę o dodatkowe 2 stopnie. Zwróć uwagę, że w metodzie turboCool() musimy odwoływać się do temperatury poprzez settery i gettery, ponieważ jest to pole prywatne i nie mamy do niego bezpośredniego dostępu.

    //Zapamiętaj
    //Nawet jeśli tego nie zapiszesz, to pierwszą instrukcją w konstruktorze zawsze jest super().
    //Korzystając z instrukcji super() możemy z konstruktora naszej klasy wywołać konstruktor z klasy nadrzędnej. Jeżeli w klasie nadrzędnej będzie kilka konstruktorów, to wywołany będzie ten, który odpowiada przekazanym do super() argumentom.
    //Używając notacji super.nazwaMetody() możesz wywołać dowolną metodę z klasy nadrzędnej, co jest przydatne szczególnie wtedy, kiedy nadpisałeś metodę z klasy nadrzędnej w swojej klasie, a nadal potrzebujesz do niej dostępu.
}
