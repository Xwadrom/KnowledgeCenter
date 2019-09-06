public class ComputerUpgrade {

    void addMemory(Computer computer, int additionalMemory){
        computer.memory= computer.memory + additionalMemory;
    }
}
//Metoda addMemory() nie zwraca żadnego wyniku (void), ale przyjmuje dwa parametry. Pierwszy to komputer, któremu chcemy
// zwiększyć ilość pamięci, a drugi to liczba określająca ile tej pamięci ma zostać dodane. Logika metody jest stosunkowo
// prosta i sprowadza się do tego, że ustawiamy nową ilość pamięci komputera jako sumę poprzedniej wartości oraz przekazaną
// przez użytkownika additionalMemory. Cechą wspólną z poprzednimi przykładami pozostaje to, że na razie jeszcze nie wiemy
// w jakim konkretnie komputerze będziemy zmieniali ilość pamięci - to się okaże dopiero w momencie, gdy tę metodę wywołamy i
// przekażemy jej jakieś argumenty.