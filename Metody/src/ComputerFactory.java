public class ComputerFactory { //metoda tworzy komputer i go zwraca

Computer create(String processor, int memory){  //szablon do tworzenia komputerów

    Computer computer = new Computer();
    computer.processor = processor;
    computer.memory = memory;
    return computer;
    }

}
