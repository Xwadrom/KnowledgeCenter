public class CarShop {
    public static void main(String[] args) {

        Car car1= new Car(1990, "BMW", "E96", "Black" );
        Car car2= new Car(1990, "BMW", "E96" );//Java sama wybiera odpowiedni konstruktor po przypisaniu typów zmiennych
        // w parametrach ( String, int ) itd. z racji tego że pola color tu nie bedzie, Java wyswietli nam null
        Car car3= new Car();

        car2.color="black"; // tutaj dodajemy parametr coloru więc zamiast null wyswietli się już black


        System.out.println(car1.model+" "+car1.color);
        System.out.println(car2.model+" "+car2.color);

        System.out.println();
    }

}
