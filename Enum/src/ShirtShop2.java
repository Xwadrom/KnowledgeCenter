import java.util.Scanner;

public class ShirtShop2 {
    public static void main(String[] args) {

        //Dzięki metodzie values() kod można uczynić dużo bardziej uniwersalnym. Możemy np. zastąpić wyświetlanie dostępnych rozmiarów na pętlę:

        System.out.println("Dostępne rozmiary tshirtów: ");
        for(Size tmp: Size.values()){
            System.out.println(tmp);//SMALL, MEDIUM, LARGE
        }

        System.out.println("Dostępne rozmiary tshirtów nazewnictwo polskie: ");
        for(Size tmp: Size.values()){
            System.out.println(tmp.getPolish());//Maly, Sredni, Duzy
        }
        //Takie podejście sprawia, że jeżeli w typie Size dodamy teraz nowe wartości, np. XSMALL i XLARGE, to reszty kodu nie musimy dotykać. W przypadku korzystania ze zwykłych stałych nie jest to możliwe.

        Scanner scanner1= new Scanner(System.in);
        System.out.println("Wybierz rozmiar: ");
        String sizeDesc= scanner1.nextLine();// np. "MAŁY"
        Size size = Size.fromDescription(sizeDesc);
        Tshirt2 tshirt = new Tshirt2();
        tshirt.setSize(size);
        System.out.println("Wybrałes tshirt w rozmiarze: " + tshirt.getSize().getPolish());

    }
}
//Kiedy stosować typ enum?
//Wtedy, kiedy logiczne jest zdefiniowanie typu, który przyjmuje tylko ograniczony zbiór wartości (stałych). W niektórych sytuacjach, należy się jednak zastanowić, czy zamiast 2 zmiennych finalnych, zdefiniowanie typu enum przyniesie nam jakiekolwiek korzyści.
//
//Największymi zaletami jest to, że jak nazwa wskazuje jest to typ wyliczeniowy - daje możliwość zwrócenia wszystkich możliwych wartości za pomocą metody values(), a co więcej wartości typów enum możemy stosować w konstrukcji switch podobnie jak liczby całkowite i napisy. Po wartościach typu wyliczeniowego możemy iterować np. przy pomocy pętli, natomiast w przypadku zwykłych stałych nie istnieje na to prosty sposób. Dzięki temu enum pozwala pisać kod bardziej uniwersalny, w którym liczba zmian w przypadku pojawienia się nowych wartości będzie niewielka.