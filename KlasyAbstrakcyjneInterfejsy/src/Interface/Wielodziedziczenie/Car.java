package Interface.Wielodziedziczenie;

public interface Car {
    default public void printName() {
        System.out.print("Car");
    }
}
