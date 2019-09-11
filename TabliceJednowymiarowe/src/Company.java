public class Company {
    public static void main(String[] args) {

        Employee[]employees=new Employee[20];// w tym momencie mamy tablicę mogącą przechowywac informacje o 20 pracownikach.
//        równoznaczne z:
//        Employee employee1;
//        Employee employee2;
//        ...
//        Employee employee20;
//        tablica ta zawiera teraz same puste wartości null, nie posiadamy jeszcze utworzonych obiektów.

        //Do odpowiednich elementów tablicy odwołujemy się przez podanie w nawiasach kwadratowych indeksu elementu.
        employees[0]=new Employee ("Jan","Nowak", 3500);
        employees[1]=new Employee ("Piotr","Krawczyk", 4500);
        employees[2]=new Employee ("Daniel","Kownacki", 4700);

        int employeeindex =2;

        System.out.println(employees[employeeindex-1].getFirstName()+" "+employees[employeeindex-1].getLastName()+" "+
                employees[employeeindex-1].getSalary()); //Chcemy wyświetlić informację o drugim pracowniku w naszej tablicy, jednak ponieważ indeksowanie jest od 0, to odwołujemy się do elementu o indeksie employeeIndex-1.

        System.out.println(employees.length);// sprawdzanie długosci tablicy, nalezy pamiętać, że tak naprawdę od wyniku odejmujemy 1. czyli mozna to zapisac za pomocą zmiennej  int employeesSize = employees.length - 1;

        int employeesSize = employees.length - 1;
        System.out.println(employeesSize);// więc, jesli chcemy otrzymać poprawny wynik długości tablicy możemy zapisać to w ten sposób;

        System.out.println(employees[20].getFirstName());// Błąd !!! max to employess[19]

        System.out.println(employees[4].getFirstName());// Błąd !!! ten użytkownik nie został jeszcze utworzony

        //Każda tablica w Javie posiada ważną własność, którą możemy odczytać - jest to jej rozmiar. Czasami wielkość
        // tablicy będzie ustalana na podstawie danych wprowadzonych przez użytkownika i nie będziesz jej znać, wtedy musisz
        // się odwołać do wielkości tablicy o nazwie length. Własność length zwraca realny rozmiar tablicy. Jeśli więc utworzysz
        // tablicę z 10 elementami i będą w niej tylko wartości domyślne, to length i tak zwróci 10.

    }
    //ArrayIndexOutOfBoundsException to błąd, który jest spowodowany tym, że próbujemy się odwołać do indeksu tablicy,
    // który wykracza poza jej rozmiar. Najczęściej występuje właśnie w związku z pomyłką co do numerowania elementów od 0.
    // Jeżeli spróbujemy się odwołać w naszej tablicy pracowników do elementu o indeksie 20 zobaczymy właśnie ten wyjątek.
    // Niestety nie wykryjemy go na etapie kompilacji programu, więc środowisko nie podkreśli nam problematycznego kodu
    // na czerwono.
}
