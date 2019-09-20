public class StringMethods {
    public static void main(String[] args) {
        String words=" jeden dwa trzy cztery pięć szcześć siedem ";
        String sub1 = words.substring(2,7);
        String sub2 = words.replaceAll("dwa","haha");
        String sub3 = words.trim();
        char charat = words.charAt(2);

        System.out.println(words);//Stworzyliśmy napis wyjściowy i przypisaliśmy go do zmiennej words. Jest on dosyć brzydki, ma specjalnie dodane na początku i na końcu zbędne spacje.

        System.out.println(sub1);//Do zmiennej sub1 przypisujemy wynik metody substring(2, 7), czyli napis składający się ze znaków pomiędzy 2 i 7 znakiem napisu oryginalnego. Ważne jest to, że przy obiektach String tak samo jak przy tablicach indeksowanie znaków liczone jest od 0, a metoda substring() znak o indeksie pierwszego argumentu uwzględnia w napisie wynikowym, natomiast indeks podany jako drugi argument nie jest już wliczany.
        System.out.println(sub2);//Druga metoda to replaceAll(). Jako pierwszy argument przyjmuje wyrażenie regularne do podmiany, a jako drugi napis, na który ten pierwszy ma zostać podmieniony. W najprostszym przypadku jako pierwszy argument przekazujemy tekst do podmiany, a jako drugi na co ma być zastąpione każde jego wystąpienie. My podmieniliśmy fragment "dwa" na "hehe". Ponieważ można w tym miejscu używać wyrażeń regularnych, to uważaj w przypadku stosowania znaków specjalnych i kropek, ponieważ wynik może być inny niż oczekiwany.
        System.out.println(sub3);//Kolejna metoda to trim(). Dzięki niej możesz usunąć zbędne białe znaki z początku i końca napisu (spacje, tabulatory, entery).

        System.out.println(charat);//Metoda charAt() zwraca znak z podanego jako argument indeksu. Ponownie pamiętaj o tym, że indeksowanie jest od 0.
        System.out.println(words.length());//length() - zwraca ona podobnie jak w przypadku tablic długość łańcucha znaków. Zwróć uwagę, że w przypadku tablic jest to właściwość (na końcu nie ma nawiasów), a przypadku typu String jest to metoda.
        System.out.println(words.toUpperCase());//zmienia napis na WERSALIKI
        System.out.println(words.toLowerCase());//zmienia na same małe litery

        //split(String reg) - dzieli napis na tablicę napisów. parametr reg oznacza wyrażenie regularne (może to być w najprostszej formie pojedynczy znak), które podzieli napis. Przykładowo "1a2a3a4".split("a") zwróci tablicę Stringów {"1", "2", "3", "4"}.

        //Pamiętaj, że żadna z powyższych metod nie modyfikuje oryginalnego napisu, ale zwraca w wyniku nowy zmodyfikowany napis. Zapis typu:
        String original = "Ala ma kota";
        original.replaceAll("Ala", "Kasia");
        System.out.println(original);
        //spowoduje wyświetlenie napisu "Ala ma kota". Jeżeli chcesz wyświetlić tekst z podmienionym słowem, przypisz wynik metody replaceAll() do nowej referencji lub do tej, którą chcemy nadpisać:
//String original = "Ala ma kota";
//original = original.replaceAll("Ala", "Kasia");
//System.out.println(original);

    }
}
