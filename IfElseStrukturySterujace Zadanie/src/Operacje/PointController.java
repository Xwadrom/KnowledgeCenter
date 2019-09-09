package Operacje;

import Zmienne.Point;

public class PointController {

    public void addX(Point p) {//argument który jest w nawiasie tworzy obiekt p z klasy Zmienne.Point
        p.setX(p.getX() + 1); //wywołanie metody setX na obiekcie p z klasy Zmienne.Point, w nawiasach argumenty x czyli p.getX() i dodajemy 1.
    }
//Zadaniem metod jest manipulacja wewnętrznym stanem obiektu, więc nie musimy nic zwracać i stosujemy słowo void.
    public void minusX(Point p) {
        p.setX(p.getX() - 1);
    }

    public void addY(Point p) {
        p.setY(p.getY() + 1);
    }

    public void minusY(Point p) {
        p.setY(p.getY() - 1);
    }


}

//W klasie PointController potrzebujemy 4 metod, które jako argument otrzymują obiekt typu Point. Zauważ, że metody
// te będą wykorzystywane później przez klasę z innego pakietu, dlatego muszą być oznaczone jako publiczne. Zadaniem metod
// jest manipulacja wewnętrznym stanem obiektu, więc nie musimy nic zwracać i stosujemy słowo void. Ponieważ będziemy wykorzystywali
// typ Point, który jest zdefiniowany w innym pakiecie, to musimy go zaimportować.