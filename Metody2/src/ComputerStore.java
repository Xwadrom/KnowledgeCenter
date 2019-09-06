class ComputerStore {
    public static void main(String[] args) {

        ComputerFactory factory= new ComputerFactory();
        Computer comp1=factory.create("Intel i5", 8192);
        Computer comp2=factory.create("AMD Ryzen", 16194);
        //Na początek potrzebujemy obiekt typu ComputerFactory, bo dzięki temu będziemy mogli wywołać metodę create().
        // Tworzenie obiektu typu Computer sprowadza się teraz do jednej linijki kodu, ponieważ tworzenie obiektu i
        // inicjalizacja jego pól jest ukryta w metodzie create().

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1, 4096);
        //Tworzymy obiekt typu Computer przypisując go do referencji comp1. Następnie zakładamy, że klient poprosił o
        // zwiększenie ilości pamięci ram. W tym celu chcemy wywołać metodę addMemory() z klasy ComputerUpgrade, ale ponieważ
        // metody wywołujemy na obiektach, to najpierw utworzyliśmy obiekt tego typu.
        //
        //Po uruchomieniu programu w konsoli wyświetli się zaktualizowana wartość, czyli 12288.

        comp1.printinfo();
        comp2.printinfo();

        System.out.println(comp1.getInfo());
        System.out.println(comp2.getInfo());

    }
}
