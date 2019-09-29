//Zapis danych do plików w formie tekstowej jest przyjemny i czytelny nawet po wyłączeniu programu, a dane tak zapisane możemy później zaimportować np. do excela. Taki zapis wymaga jednak często budowania rozbudowanych metod, które pozwolą odbudować poprzedni stan aplikacji (utworzenie wszystkich obiektów na podstawie danych tekstowych z pliku).
//
//W Javie 1.5 wprowadzono mechanizm serializacji, czyli zapisu do plików bezpośredniego stanu obiektów, który może być później łatwo odtworzony. Serializacja wykorzystywana jest nie tylko w kontekście plików, ale też np. przy przesyłaniu obiektów pomiędzy aplikacjami w sieci, jednak na przykładzie plików mechanizm ten jest najłatwiej zrozumieć.
//Jeżeli chcemy, aby nasz obiekt miał możliwość zapisu serializowanego, jego klasa powinna implementować interfejs Serializable. Dzięki temu dajemy możliwość zapisu obiektu przy pomocy obiektu klasy ObjectOutputStream. Brak implementacji interfejsu Serializable spowoduje przy próbie zapisu obiektu wygenerowanie wyjątku NotSerializableException.

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 3812017177088226528L;

    private String firstName;//private transient String firstName;
    private String lastName;
    //Jeżeli z jakiegoś powodu zależy ci na tym, żeby jakieś składowe klasy nie były serializowane, możesz je zablokować stosując słowo kluczowe transient. Dzięki temu zostanie ono pominięte w procesie serializacji i informacje zostaną "zgubione". Pamiętaj też, że serializacji nie podlegają żadne składowe statyczne, ponieważ nie są one związane z konkretną instancją klasy, ale z samą klasą.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Person(){}

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

}
//Klasa implementuje interfejs Serializable. Dzięki temu wszystkie pola typów prostych i napisy typu String zostaną zapisane do pliku. Jeżeli klasa jest bardziej złożona i zawiera również pola innych typów referencyjnych, to klasy, które je definiują także muszą implementować interfejs Serializable. Stała serialVersionUID jest elementem opcjonalnym, który pozwala na wersjonowanie klas. Jest ona generowana domyślnie przez kompilator na podstawie kilku elementów jak nazwa klasy i pola w niej zawarte. Dlatego jeśli zapiszesz jakiś obiekt, następnie w klasie Person dodasz nowe pole, nawet prywatne, to próba odczytu obiektu z wcześniej utworzonego pliku będzie niemożliwa. Wygenerowanie samodzielnie stałej serialVersionUID pozwoli zachować kompatybilność wsteczną. Korzystając z eclipse możesz to zrobić automatycznie, a w przypadku IntelliJ musisz np. po prostu wymyślić dowolną wartość.

//Jeżeli korzystamy z dobrodziejstw jakie daje nam dziedziczenie to należy wiedzieć, że jeśli jakaś klasa implementuje interfejs Serializable, to możliwość serializacji będą miały także wszystkie klasy pochodne w hierarchii dziedziczenia.
//
//Warto też pamiętać, że jeśli rozszerzamy klasę, która nie implementuje interfejsu Serializable, a jej klasa pochodna tak, to serializacji podlegają tylko pola z klasy pochodnej, informacje z klasy bazowej zostaną pominięte.