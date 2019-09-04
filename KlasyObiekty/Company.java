public class Company {
    public static void main(String[] args) {

        Employee Robert = new Employee();
                Robert.imie = "Robert";
                Robert.nazwisko = "Osuch";
                Robert.rokUrodzenia = 1983;
                Robert.staz = 8;

        Employee Marta = new Employee();
                 Marta.imie = "Marta";
                 Marta.nazwisko = "Biernacka";
                 Marta.rokUrodzenia = 1989;
                 Marta.staz = 3;

        Employee Daniel = new Employee();
                Daniel.imie = "Daniel";
                Daniel.nazwisko = "Kowalski";
                Daniel.rokUrodzenia = 1975;
                Daniel.staz = 14;

        System.out.println("Pierwszy pracownik to: "+ Robert.imie +" "+ Robert.nazwisko +" urodzony w roku " + Robert.rokUrodzenia +
                " i o stażu pracy wynoszącym "+ Robert.staz + " lat");

        System.out.println("Drugi pracownik to: "+ Marta.imie +" "+ Marta.nazwisko +" urodzona w roku " + Marta.rokUrodzenia +
                " i o stażu pracy wynoszącym "+ Marta.staz + " lat");

        System.out.println("Trzeci pracownik to: "+ Daniel.imie +" "+ Daniel.nazwisko +" urodzony w roku " + Daniel.rokUrodzenia +
                " i o stażu pracy wynoszącym "+ Daniel.staz + " lat");
    }
}
