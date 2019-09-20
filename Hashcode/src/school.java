public class school {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        Student student2 = new Student("Jan Kowalski", 22);
        Student student3 = new Student("Marta Zawadzka", 33);

        boolean studentEquals= student1.equals(student2);
        System.out.println("student1.equals(student2)"+ studentEquals);

        int hashCode1= student1.hashCode();
        int hashCode2= student2.hashCode();
        int hashCode3= student3.hashCode();

        System.out.println(hashCode1);
        System.out.println(hashCode2);
        System.out.println(hashCode3);

        //Dla wszystkich obiektów otrzymaliśmy różne wartości. Nawet pomimo tego, że dwa pierwsze obiekty przechowują te same wartości, to kontrakt o którym wspomniałem wcześniej jest spełniony, ponieważ metoda equals() zwróciła false. Jeżeli wygenerowalibyśmy tylko metodę equals() w klasie Student, to zwróciłaby ona true przy porównaniu dwóch pierwszych obiektów, ale metoda hashCode() nadal zwracałaby dla nich różne wartości, a tym samym kontrakt o którym pisałem wcześniej zostałby złamany. W niektórych miejscach spotkasz się z opisem, że metoda hashCode() jest wyliczana na podstawie adresu obiektu w pamięci, jednak w rzeczywistości ani w specyfikacji języka Java, ani w dokumentacji metody hashCode() nic takiego nie znajdziesz. W rzeczywistości wynik tej metody może być obliczany w różny sposób w zależności od tego z jakiej maszyny wirtualnej korzystasz (np. HotSpot od firmy Oracle lub J9 od IBM).
        //po wygenrowaniu metod equals i hashcode w kalsie student wyniki już będą inne:
    //Po uruchomieniu poprzedniego przykładu zobaczymy teraz, że porównanie dwóch pierwszych obiektów poprzez metodę equals() zwróci true, a metoda hashCode() dla tych obiektów zwróci tę samą liczbę.
        //Gdzie używana jest metoda hashCode()?
        //Na razie metoda hashCode() nie jest nam za bardzo do niczego potrzebna, jednak w przyszłości dojdziemy do różnych struktur danych, które są trochę bardziej skomplikowane niż tablice. Wykorzystują one m.in. metodę hashCode() do tego, żeby w wydajny sposób zapisywać i wyszukiwać obiekty.
        //
        //Struktury takie opierają się na tablicach mieszających (hash table), które w uproszczeniu opierają się na tym, że do wartości wyliczonej przez metodę hashCode() przypisany jest obiekt. Struktury te mogą wykorzystywać dodatkowo metodę equals() dla zagwarantowania poprawnego działania, dlatego tak ważne jest to, aby przestrzegać kontraktu, który opisałem na początku tej lekcji.

    }

}