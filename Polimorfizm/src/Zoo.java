public class Zoo {
    public static void main(String[] args) {

        Animal[]animals=new Animal[3];
        animals[0]=new Dog("Burek");
        animals[1]=new Cat("Filemon");
        animals[2]=new Animal("kotopies");

        changeAnimalName(animals[0],"Hackelbery");

        animals[0].bark();// Środowisko niestety wyświetla w takiej sytuacji błędy. Zasada jest tutaj prosta. Metody instancji zawsze wywoływane są na typie obiektu, ale żeby je wywołać, to metoda o wskazanej sygnaturze musi być dostępna w typie referencji. A bardziej ludzkimi słowami powiemy - żeby móc wywołać metodę bark(), to metoda ta musi być zdefiniowana w klasie Animal, albo referencja, na której wywołujesz tę metodę musi być typu Dog, czyli np.:
        // Dog dog = new Dog("Burek");      dog.bark();

        //Nie oznacza to jednak, że musimy od razu rezygnować z polimorfizmu. Typ referencji możemy zmienić poprzez rzutowanie, podobnie jak było przy typach prostych. Robimy to zapisując nowy typ referencji w okrągłych nawiasach, przed referencją, której typ chcemy zmienić. Zrzutowaną referencję możemy przypisać do zmiennej, lub wywołać na niej metodę "w locie".
        Animal dog1=new Dog("Szarik");//utworzenie obiektu dog1 w klasie Dog, który dziedziczy po klasie Animal
        Dog specificDog1=(Dog) dog1;//rzutowanie elementu dog1, na obiekt specifiddog1 z klasy Dog.
        specificDog1.giveSound();//wywolanie metody give sound z klasy Animal na obiekcie specificDog1
        specificDog1.bark();// wywolanie metody bark na obiekcie specificDog1 z klasy Dog

        Dog specificDog2=(Dog) animals[0];// rzutowanie elementu tablicy animals[0], na obiekt specificDog2 typu Dog.
        specificDog2.giveSound();
        specificDog2.bark();

        ((Cat)animals[1]).meow();//rzutowanie w locie czyli bez przypisywania nowej zmiennej.
        ((Dog)animals[0]).bark();


        animals[0].giveSound();
        animals[1].giveSound();
        animals[2].giveSound();

//W pętli for each występuje tylko jedna zmienna, którą w tym przypadku nazwaliśmy tmp, która musi być zgodna z typem elementów przechowywanych w tablicy, po której iterujemy - u nas są to obiekty z klasy Animal. Do zmiennej tmp w kolejnych przebiegach pętli przypisywane będą kolejne elementy/obiekty z tablicy animals, czyli odpowiednio zawartość tablicy animals[0], animals[1] i animals[2].
//
//Zapamiętaj ją jako "dla każdego elementu/obiektu tablicy animals wykonaj polecenia w ciele pętli".
        for (Animal tmp : animals) {
            System.out.println(tmp.getName());
            tmp.giveSound();
        }
        //Teraz, żeby jeszcze lepiej wyobrazić sobie zalety tego rozwiązania, spójrz na to z takiej perspektywy, że klas dziedziczących po Animal jest 10, a obiektów w tablicy nie 3, ale 100. Iteracja po nich i wywołanie metody giveSound() na każdym obiekcie nadal zajmuje tylko 3 linijki kodu.


//        Animal dog1=new Dog("Burek");
//        dog1.giveSound();
//
//        Animal cat1=new Cat("Filemon");
//        cat1.giveSound();
//
//        Animal doge=new Animal("Kotopies");
//        doge.giveSound();
    }
    private static void changeAnimalName(Animal animal, String newName){
        animal.setName(newName);
    }
    //Dzięki temu, że metoda changeAnimalName() ma zdefiniowany parametr typu Animal, a nie typ szczegółowy Dog, czy Cat, to możemy do niej przekazać każdego zwierzaka. Nawet jeśli utworzymy nowe klasy dziedziczące po Animal, to ta metoda nadal będzie działała i będziemy mogli do niej przekazywać obiekty nowych typów, a jednocześnie nie będziemy musieli tworzyć przeciążonych wersji metody dla każdego z nich. Genialne!



    //Pomimo iż zmienne dog i cat są zadeklarowane jako typ Animal, to w rzeczywistości przypisane są do nich obiekty typów bardziej sprecyzowanych Dog i Cat i to metody giveSound() zdefiniowane w tych klasach są wywoływane. Zapamiętaj więc, że metody instancji zawsze wywoływane są na typie obiektu, a nie referencji. Profesjonalnie mówimy tutaj o czymś takim jak wirtualne wywołanie metod. W Javie większość metod jest wirtualna
}

//Polimorfizm będzie szczególnie przydatny, gdy chcesz w kolekcji (np. tablicy) przechowywać obiekty różnych typów, które mają jedną wspólną klasę bazową. Pozwoli to uprościć kwestię wywołania metod na wszystkich obiektach np. korzystając z pętli. Co więcej w taki sam sposób możesz definiować ogólniejsze metody, które będą mogły przyjmować argumenty różnych typów.
