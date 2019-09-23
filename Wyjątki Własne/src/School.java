public class School {
    //Jako przykład stwórzmy klasę School, a w niej tablicę typu Student, gdzie każdy student ma imię, nazwisko i id (np. numer legitymacji). W klasie School dodajmy metodę add() wprowadzającą nowego studenta do systemu oraz find(), która jako argument przyjmuje String z imieniem i nazwiskiem i zwraca pierwszego Studenta znalezionego w tablicy. Ponieważ w przypadku metody add() może okazać się, że nie ma już więcej miejsca w tablicy - utwórzmy swój wyjątek NoMoreSpaceException, a metoda find() może nie znaleźć żadnego elementu i wtedy zamiast zwracać wartość null może zwrócić wyjątek NoElementFoundException. Ponieważ nie potrzebujemy w klasach wyjątków jakichś specjalnych funkcjonalności wystarczy jeśli zdefiniujemy jeden konstruktor przyjmujący obiekt String z dowolnym komunikatem, który później będzie można odczytać przy łapaniu obiektu wyjątku.

    private Student[] students;
    private int studentsNumber;

    public School( int studentsNumber) {// zmienne zadeklarowane wczesniej, to nie sa te same zmienne co w konstruktorze studentNumber
        students = new Student[studentsNumber];
    }

    public void add(Student s) throws NoMoreSpaceException {
        if (studentsNumber >= students.length) {
            throw new NoMoreSpaceException("Brak miejsca w School" + students.length);
        } else {
            students[studentsNumber] = s;
            studentsNumber++;
        }
    }

    public Student find(String firstName, String lastName) throws NoElementFoundException {
        boolean found = false;
        int index = 0;
        while (!found && index < students.length) {
            if (students[index].getFirstName().equals(firstName) && students[index].getLastName().equals(lastName)) {
                return students[index];
            } else {
                index++;
            }
        }

        throw new NoElementFoundException("Nie znaleziono elementu " + firstName + " " + lastName);
    }
}

