public class CarShop {
    public static void main(String[] args) {
//przy kompilacji carshop od razu kompiluja sie tez wszystkie klasy w nim zawarte

//       String brand1 = "Audi";
//       String brand2 = "BMW"
//       String model1 = "A4";
//       String model4 = "e96";
//       String color = "Czarny";
//       String wheelsColor = "Srebrny";
//       String tiresColor = "Czarny";
//       int doors = 5;

//        Car audi = new Car(); W tym przypadku powiemy, że audi jest referencją na obiekt typu Car. Należy to rozumieć
//        w ten sposób, że w pamięci komputera osobno przechowywane są dane oraz wskaźniki na te dane. W skrócie referencja
//        określa miejsce w pamięci gdzie jest zapisany obiekt, a obiekt przechowuje już konkretne informacje.

//       Nasz kod moglibyśmy nieco rozbudować tworząc kilka obiektów typu Car:
//        class CarShop {
//            public static void main(String[] args) {
//                Car audi = new Car();
//                Car bmw = new Car();
//                Car opel = new Car();
//                Car fiat = new Car();
//                //... ustawianie poszczególnych pól obiektów
//            }
//        }

       Car car1 = new Car (); //pobiera klase z szablonu Car, car1 to referencja
       car1.brand="Audi";
       car1.model="A4";
       car1.carColor="Czarny";
       car1.wheelsColor="Srebrny";
       car1.tiresColor="Czarny";
       car1.doors=5;
       String car1Info = car1.brand + "' " + car1.model + "' "+ car1.carColor+ "' "+
               car1.wheelsColor+ "' "+car1.tiresColor+ "' "+ car1.doors;
        System.out.println(car1Info);

       car1 = new Car ();
       Car car2 = car1;//car1 i car2 sa referencja na ten sam obiekt, wiec wynik car1Info bedzie jak wyzej
       car1.brand="Audi";
       car2.model="A4";
       car2.carColor="Czarny";
       car1.wheelsColor="Srebrny";
       car2.tiresColor="Czarny";
       car1.doors=5;
        System.out.println(car1Info);


       car2 = new Car ();
       car2.brand="VW";
       car2.model="Passat";
       car2.carColor="Srebrn";
       car2.wheelsColor="Biały";
       car2.tiresColor="Czarny";
       car2.doors=5;





        System.out.print("\n");

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.doors);

        System.out.print("\n");

        car2.brand="Lamborghini"; // zmiana car2 na inne auto
        car2.model="Aventador";
        System.out.println(car2.brand);
        System.out.println(car2.model);




    }
}
