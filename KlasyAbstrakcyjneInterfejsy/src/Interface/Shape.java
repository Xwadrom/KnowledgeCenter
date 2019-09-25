package Interface;

import java.math.BigDecimal;

//interfejsy są domyślnie abstrakcyjne
interface Shape {

    public static final double PI=3.14;

    double calculateArea();
    double calculatePerimeter();//Obie metody w interfejsie są abstrakcyjne, pomimo że jawnie nie zapisaliśmy słowa abstract.

}
//W odróżnieniu od klas interfejsy mogą dziedziczyć po wielu innych interfejsach:
//
//interface D extends A, B, C {}1
//(gdzie A, B, C to również interfejsy),
//
//a dodatkowo klasy mogą implementować wiele interfejsów:
//
//class MotorBike implements Bike, Motorcycle, Vehicle {}1
//W przypadku wielodziedziczenia klas pisałem o jednej ważnej kwestii - problemie diamentu. W przypadku interfejsów w starszej wersji Javy nie było z tym problemu, ponieważ interfejsy posiadały tylko i wyłącznie metody abstrakcyjne, a więc trzeba je było przesłonić, żeby robiły cokolwiek użytecznego.
//
//Problem pojawia się od Javy 8, która za pomocą interfejsów i metod domyślnych daje teoretyczną możliwość wielodziedziczenia. Załóżmy, że mamy interfejsy Car i Boat (łódź) z metodą domyślną o takiej samej sygnaturze. Jezeli jedna klasa impementuje dwa powyzsze interfejsy ktore maja takie same metody to dochodzi do problemu duplikacji metod i trzeba ja nadpisac w klasie ktora implementuje dwa interfejsy.
