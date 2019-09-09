package pl.javastart.data;

public class Car {
    //specyfikator dostępu "domyślny" bez slowa public, czyli samo class Car { oznacza ze mozemy sie odwolywac do składowych
    //klas które znajdują się w tym samym pakiecie "package", a public oznacza, że cały projekt ma dostęp do tej klasy.

    // specyfikator "protected" również ogranicza zasieg do tej samej klasy i innych klas w tym samym pakiecie(folder), nie mozemy go uzywac dla nazwy klasy, ale
    //moze zostac uzyty np. dla pol klasy czyli protected String brand; z jednym wyjatkiem przy dziedziczeniu

    //specyfikator dostępu "private" ogranicza zasieg tylko do tej samej klasy, nie wychodzi już poza dany pakiet"package" (folder)

    private int year;  //dzięki ustawieniom private program staje się odporny na błędy
    private String brand; //jezeli definijemy jakas klase zawsze oznaczajmy pola jako private
    private String model; //Słowo private służy do ukrywania tego co się dzieje w klasie.
    private String color;

    // konstruktor1
    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    // konstruktor2
    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    //w javie powstała konwencja java beans, która mówi o tym, że jesli musimy sie odwolywac do jakiegos pola,
    //to powinnismy dla takiego pola stworzyc getter (pobiera wartosc) oraz setter(ustawia wartosc)
    // gettery oraz settery są wymagane również w bibliotece Hibernate (komunikacja z bazą danych)


    public void setColor(String color) { //setter, który w tym przypadku pozwala nam się odwołac z klasy CarShop do koloru
        this.color = color;  //pomimo, że kolor jest private w tej klasie
        //setter powinien być typu void ponieważ tylko ustawiamy pole
    }

    public void setYear(int year) {  //gettery i settery ustawiamy po to, aby w nich dodac nowe funkcjonalnosci takie jak
        if (year >=0)                            //brak mozliwosci ustawienia roku mniejszego niz 0
        this.year = year;// Słowo this podobnie jak w konstruktorze pozwala odróżnić, w którym przypadku chodzi o pole klasy, a w którym o parametr metody.
        else System.out.println("ustaw rok większy niż 0");
    }

    public String getBrand() {//metody pobierajace wartosci tzw. gettery, będą zwracały wartości które są przypisane do powyższych pól
                         //jezeli metoda cos zwraca to nie moze być void. Musi byc zgodna z typem pola w tym przypadku String.
        return brand;   //w tym przypadku metoda getBrand zwraca nam markę, czyli brand.
    }

    public int getYear() { // za pomocą alt+insert tworzyc mozemy konstruktor, getter, setter itp.
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


}

