import Operacje.PointController;
import Zmienne.Point;

public class PointApplication {
    public static void main(String[] args) {

        Point point1 = new Point(4,7);// Tworzę referencję point1 na obiekt z klasy Zmienne.Point, z argumentami 4 i 7
        PointController operation = new PointController();// Tworzę referencje operation na obiekt z klasy Operacje.PointController

        System.out.println("Punkt: ("+point1.getX()+" , "+point1.getY()+" )"); // Printuje wartosci x i y punktu point1 poprzez wywolanie metody getX oraz getY

        operation.addX(point1);// wywoluje metodę addX z referencją operation, która znajduje się w klasie Operacje.PointController, metoda addX przyjmuje argument point1, czyli referencje na obiekt z klasy Zmienne.Point o aktualnych zmiennych x=4 oraz y=7
        System.out.println("Punkt addX: ("+point1.getX()+" , "+point1.getY()+" )");// Printuje zmienione wartosci x i y punktu point1 poprzez wywolanie metody getX oraz getY

        operation.addY(point1);
        System.out.println("Punkt addY: ("+point1.getX()+" , "+point1.getY()+" )");

        operation.minusX(point1);
        System.out.println("Punkt minusX: ("+point1.getX()+" , "+point1.getY()+" )");

        operation.minusY(point1);
        System.out.println("Punkt minusY: ("+point1.getX()+" , "+point1.getY()+" )");


    }
}
