public class Pack {
    public static void main(String[] args) {

        byte xxx;
        Byte xxx1;

        int yyy;
        Integer yyy1=9;//Do typów obiektowych takich jak Integer, czy Double możemy przypisywać bezpośrednio wartości typów prostych bez potrzeby wywoływania konstruktora lub metody valueOf() jak pokazaliśmy wcześniej. W Javie funkcjonuje mechanizm autoboxingu, czyli automatycznego opakowania i unboxingu, czyli automatycznego rozpakowania wartości z typu obiektowego.

        double zzz;
        Double zzz1;

        char sss;
        Character sss1='j';

        boolean eee;
        Boolean eee1;

        //Jak widzisz najczęściej jest to kwestia zmiany litery z małej na wielką na początku nazwy. Wszystkie z powyższych klas, oprócz Character i Boolean, rozszerzają klasę Number, dzięki czemu możemy także korzystać z polimorfizmu, np. możemy stworzyć tablicę typu Number, która będzie przechowywała obiekty Integer i Double. W celu stworzenia obiektów odpowiednich typów stosujemy konstruktor lub statyczna metodę valueOf().

        int num = 5;
        Integer number1 = new Integer(num); //tworzenie przez konstruktor od javy 9 juz jest przestarzale
        Integer number2 = Integer.valueOf(num); // obecnie obiekt tworzy się przez metode statyczną valueof

        //Klasy opakowujące pozwalają na wygodne konwertowanie liczb na napisy za pomocą statycznej metody toString() np.:
        int secondNum = 10;
        String number = Integer.toString(secondNum);
        System.out.println(number);
        //Analogicznie możemy postępować z każdym innym typem.

        //Każda z klas opakowujących posiada dodatkowo metody to zamiany napisów na wartości odpowiednich typów, co może być przydatne np. przy wczytywaniu danych z użyciem klasy BufferedReader, która nie posiada metod do wczytywania danych odpowiednich typów, a potrafi czytać dane jedynie wiersz po wierszu jako tekst. Wspomniane metody to:
        //
        //valueOf(String),
        //parseXXX(String), gdzie XXX to odpowiedni typ, np. Int lub Double.
        //Przykład:

        String numberString = "5.5";
        double num1 =  Double.parseDouble(numberString);
        double num2 = Double.valueOf("6.5");
        System.out.println(num1);
        System.out.println(num2);
    }
}
//Typy opakowujące mają jedną poważną wadę w porównaniu do swoich odpowiedników w postaci typów prostych. Rozmiar w pamięci. W przypadku typów prostych wartości przechowywane są po prostu jako liczby, wartość true/false albo liczbo liczba odpowiadająca znakowi w tabeli Unicodu. Dla typów opakowujących powstają obiekty, więc oprócz samej przechowywanej wartości przechowywany jest nagłówek obiektu. Dla przykładu wartość typu int zajmuje w pamięci 4 bajty, a ta sama wartość opakowana w obiekt Integer będzie zajmowała już 16 bajtów.
//
//Z tego względu wprowadzone zostały podstawowe optymalizacje dla typów całkowitoliczbowych polegające na cacheowaniu wartości z przedziału od -127 do 128. Polega to na tym, że jeżeli tworzymy obiekt Integer (lub innego typu całkowitoliczbowego) na podstawie wartości z podanego przedziału używając metody valueOf(), to nie jest tworzony nowy obiekt, a jedynie zwracana jest referencja na już istniejący obiekt. W przypadku wartości spoza tego zakresu, lub tworzeniu obiektów przy użyciu konstruktora a nie metody valueOf(), zawsze tworzony będzie nowy obiekt. M.in. z tego powodu konstruktory zostały oznaczone adnotacją @Deprecated i ich używanie od Javy 9 jest odradzane.
//Górną granicę dla cache można zmienić ze 127 na dowolną liczbę. Należy w tym celu dodać przy uruchamianiu programu flagę -XX:AutoBoxCacheMax. Warto zapamiętać ten szczegół, jest to jedno z popularnych podchwytliwych pytań na rozmowach kwalifikacyjnych.