public class SchoolTest {
    public static void main(String[] args) {
        School school=new School(3);
        //Stworzyliśmy obiekt School, który może przechowywać informację o maxymalnie 3 studentach.

        try{
            school.add(new Student(1, "Jan","Kowalski"));
            school.add(new Student(2, "Marek", "Bobowski"));
            school.add(new Student(3, "Karol","Kwiatkowski"));
            //school.add(new Student(4, "Ania","Marciniak"));
        }catch (NoMoreSpaceException ex){
            System.err.println("Nie można dodać tylu osób do szkoły");
            System.err.println(ex.getMessage());
            //Przy próbie dodania czwartego z nich rzucony będzie wyjątek NoMoreSpaceException, który przechwytujemy w bloku catch i obsługujemy.
        }

        try{
            System.out.println(school.find("Marek","Bobowski"));
            System.out.println(school.find("Franek","Markowski"));
        }catch (NoElementFoundException ex){
            System.err.println("Nie znaleziono takiej osoby!");
            System.err.println(ex.getMessage());
        }
        //Podobnie w drugim bloku try wyszukujemy Marka Bobowskiego, który istnieje w naszej bazie, ale przy wyszukiwaniu studenta Franek otrzymamy wyjątek NoElementFoundException, który też przechwytujemy i obsługujemy.
    }
}
//Własne klasy wyjątków definiuj tylko wtedy, kiedy wśród standardowych klas nie znajdziesz odpowiednich do swojego problemu. Przykładowo definiowanie wyjątku typu TooBigIndexException w odniesieniu do zbyt dużego indeksu tablicy będzie złą praktyką, ponieważ istnieje ArrayIndexOutOfBoundsException. Własne wyjątki będą przydatne szczególnie wtedy, kiedy mamy w niej do rozróżnienia wiele nietypowych sytuacji.
//
//Java jest jedynym językiem programowania, w którym wprowadzono podział na wyjątki kontrolowane i niekontrolowane. Aktualnie praktycznie wszystkie wyjątki, które definiuje się w aplikacjach to wyjątki niekontrolowane (dziedziczące po RuntimeException), często wyjątki kontrolowane uważane są za błąd przy projektowaniu języka Java i raczej staraj się ich unikać w swoich aplikacjach.