public class Computer {

    String processor;
    int memory;

    Computer(String proc, int mem){ //konstruktor, gdzie w miejsce wczesniej pustych nawiasow czyli
        System.out.println("Tworzę nowy Komputer:");
        processor=proc; // parametrów, wpsiujemy teraz wartosci String oraz int, które następnie przypisywane
        memory=mem; // są do pól processor oraz memory
        printinfo();
    }



//    Konstruktor służy do utworzenia nowego obiektu. Ma nazwę identyczną z nazwą klasy, w której się znajduje. Nie ma określonego
//    żadnego typu zwracanego - nawet void, a do jego wywołania używamy operatora new.
//    Computer(String proc){
//        processor=proc;
//
//    }
// wersja dla przypadku gdzie chcemy definiowac na poczatku tylko jedno pole np. processor
// wartosc memory bedzie domyslna czyli 0

    //Częstą praktyką jest też inicjowanie pól zawsze wewnątrz konstruktorów:
    // Computer(String proc) {
    //        processor = proc;
    //        memory = 8192;
    //        System.out.println("Tworzę nowy komputer");
    //    }


    void printinfo(){
        System.out.println(processor+ " " +memory);
    }
}
