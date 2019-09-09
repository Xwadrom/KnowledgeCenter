public class HelloName {
    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Maciek";

        String name = "Maciek"; //tą wartość użytkownik będzie mógł wpisywac recznie w programie

        switch(name){            //przyjmuje wartosc typu int lub String
            case name1:         //oznacza, że jeżeli name to jest to samo co name1 to zapisujemy dalej instrukcje ktora chcemy wywolac
                System.out.println("Siema Krzychu witaj w aplikacji");
                break;   // gdyby break nie został dodany program wykonywal by wszystkie case pomimo tego, że już jakis warunek zostałby spełniony, a tak po spelnieniu warunku name = name1 działanie switch jest zatrzymywane.
            case name2:  //mozna wpisać też case "Maciek": jesli nie chcemy zeby zmienne u góry byly finalne
                System.out.println("Witam Panie Prezesie, jak mija dzień?");
                break;
            default:   // default oznacza, że jezeli name, to nie bedzie ani name1 ani name2 to wykona się dalsza instrukcja, podobne do else if
                //default nie jest obowizakowy
                System.out.println("Witaj nieznany użytkowniku");
        }
    }
}
//    Instrukcji Switch używamy wtedy, kiedy mamy kilka na sztywno zdefiniowanych wartosci (final), które nigdy w naszym programie się nie zmieniają i chcemy porównywać wartość zmiennej do kilku innych zdefiniowanych wartości.
//
//        Instrukcji if else używamy wtedy kiedy mamy warunek, który ostatecznie daje nam wartosc true albo false