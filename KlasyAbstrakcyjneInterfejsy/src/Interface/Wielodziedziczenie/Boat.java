package Interface.Wielodziedziczenie;

public interface Boat {
    default public void printName() {
        System.out.print("Boat");
    }
}
