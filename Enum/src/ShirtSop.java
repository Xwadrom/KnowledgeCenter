import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ShirtSop {
    public static void main(String[] args) {

        System.out.println("Dostępne rozmiary: ");
        System.out.println(Size.SMALL.getPolish());
        System.out.println(Size.MEDIUM.getPolish());
        System.out.println(Size.LARGE.getPolish());


        Tshirt2 tshirt = new Tshirt2();
        tshirt.setSize(Size.MEDIUM);
        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar Tshirta: "+ tshirt.getSize().getPolish());
        //Do wartości typu wyliczeniowego odwołujemy się jak do statycznych pól klasy. Każdy zdefiniowany przez nas typ enum rozszerza niejawnie klasę Enum, co wiąże się z tym, że w przypadku typów wyliczeniowych nie możemy korzystać z dziedziczenia (w Javie nie istnieje wielodziedziczenie klas). W klasie Enum jest kilka przydatnych metod, które dzięki dziedziczeniu znajdują się także w naszym typie Size.

        //valueOf(String name) - przyjmuje nazwę typu i zwraca wartość typu Enum. Nazwa musi być zgodna z nazwą wartości z uwzględnieniem wielkości liter np.:
        Size smallSize = Size.valueOf("SMALL");
        System.out.println(smallSize);

        //name() - zwraca nazwę wartości, np.
        String smallName = Size.SMALL.name(); // "SMALL"
        String mediumName = Size.MEDIUM.name(); // "MEDIUM"
        System.out.println(smallName);
        System.out.println(mediumName);

        //ordinal() - zwraca numer wartości poczynając od 0. Np.:
        int smallNumber = Size.SMALL.ordinal(); //0
        int mediumNumber = Size.MEDIUM.ordinal(); //1
        int largeNumber = Size.LARGE.ordinal(); //2
        System.out.println(smallNumber+" "+mediumNumber+" "+largeNumber);

        //values() - zwraca tablicę wszystkich wartości zdefiniowanych w danym enumie, np.:
        Size[] values = Size.values();//SMALL, MEDIUM, LARGE
        for (Size tmp: values){
            System.out.println(tmp);
        }
    }
}
