package Interface;

import java.util.Set;

class Rectangle implements Shape { //W przypadku interfejsów mówimy o ich implementacji przez klasy, a nie o dziedziczeniu. Fakt ten wskazujemy korzystając ze słowa kluczowego implements.

    //Klasa Rectangle (prostokąt) implementuje interfejs Shape. Zdefiniowaliśmy w niej pola a i b, które reprezentują długości boków. Jeżeli zdefiniowalibyśmy klasę Rectangle i nie zaimplementowali metod calculateArea() oraz calculatePerimeter(), to środowisko będzie podkreślało dokładnie taki sam błąd jak przy klasach abstrakcyjnych, informując nas o tym, że albo musimy oznaczyć klasę jako abstract, albo powinniśmy dodać wszystkie metody abstrakcyjne z interfejsu.

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {      //oblicz pole
        return
                a*b;
    }

    @Override
    public double calculatePerimeter() {  //oblicz obwód
        return 2*a+2*b;
    }
}
