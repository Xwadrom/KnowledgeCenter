public class ComputerFactory {

    Computer create (String processor, int memory){
        Computer computer = new Computer();
        computer.processor = processor;
        computer.memory = memory;
        return computer;
    }
}

//Deklarujemy, że metoda create() będzie zwracała obiekt typu Computer i przyjmuje dwa parametry. Jeden typu String z
// nazwą procesora, drugi typu int z ilością pamięci ram. Wewnątrz metody tworzymy nowy obiekt typu Computer i ustawiamy
// jego pola procesor i memory na takie jakie przekaże nam ktoś wywołujący tę metodę. Ponieważ zadeklarowaliśmy, że metoda
// zwraca obiekt typu Computer to na końcu musi pojawić się słowo return, po którym zwracamy obiekt.