import java.util.Scanner;

class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }
        //Dzięki temu, że dla typów wyliczeniowych automatycznie generowana jest metoda values(), to możliwe jest wyświetlenie informacji o wszystkich zdefiniowanych wartościach w typie Pizza korzystając z wygodnej pętli for each. Dzięki nadpisaniu metody toString() otrzymujemy wydruk w przyjaznej formie z listą składników.

        Scanner input = new Scanner(System.in);
        System.out.println("Jaką pizzę wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine());
//Po wprowadzeniu swojego wyboru przez użytkownika (musi być wpisany wielkimi literami) przypisujemy odpowiednią wartość do zmiennej pizza. Jeżeli chcielibyśmy wczytać od użytkownika nazwę w innej formie, np. nazwa pizzy pisana małymi literami, to najlepiej w typie Pizza zdefiniować w takiej sytuacji dodatkową metodę lub można zamienić wprowadzony przez użytkownika tekst na wielkie litery, a następnie taki napis przekazać do metody valueOf().
        //Pizza pizza = Pizza.valueOf(input.nextLine().toUpperCase());

        System.out.println("Dziękujemy za zamówienie pizzy " + pizza.name());
        input.close();
    }
}