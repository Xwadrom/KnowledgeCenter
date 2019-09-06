public class ComputerStore {
    public static void main(String[] args) {

        Computer comp1=new Computer("Intel i5", 8192);
        //gdy zapisujemy new Computer to wywolujemy konstruktor z klasy Computer
        //w tym przypadku kontruktor ten przyjmuje dwa parametry typu String oraz int
        // od teraz nie mozemy juz tworzyc pustych obiektow bez parametrów takich jak ten: Computer comp2=new Computer();

        //comp1.printinfo();

      //  Computer comp1=new Computer("Intel i5");
        // comp1.memory = 8192
        //wersja gdzie pole memory chemy ustawic np. poźniej


        Computer comp2=new Computer("AMD Ryzen", 16366);
        Computer comp3=new Computer2("AMD Ryzen", 16366);



    }
}
//    Konstruktory służą do tworzenia nowych obiektów, muszą mieć taką samą nazwę jak nazwa klasy i nie mają określonego typu zwracanego.
//        Jeśli nie zdefiniujemy żadnego konstruktora, to kompilator wygeneruje dla klasy konstruktor domyślny, ale jeśli stworzymy choć jeden konstruktor, to konstruktor domyślny nie zostanie wygenerowany automatycznie.
//        Konstruktory mogą przyjmować dowolne parametry typów znanych kompilatorowi (proste i obiektowe), a ich zasięg wyznaczają nawiasy klamrowe (ciało konstruktora).