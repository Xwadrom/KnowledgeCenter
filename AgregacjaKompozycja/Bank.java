public class Bank {
    public static void main(String[] args) {

        Person person1=new Person();//Osoba, konto bankowe i kredyt będą teraz reprezentowane jako obiekty. Spójrzmy na klasę Bank, gdzie utworzymy teraz przykładowego Jana Kowalskiego, utworzymy dla niego konto oraz przydzielimy mu kredyt na kwotę 2000zł z oprocentowaniem 5% na okres 12 miesięcy.
        Adres meldunek1=new Adres();
        Adres zamieszkanie1=new Adres();
        person1.firstName="Jan";
        person1.lastName="Kowalski";
        person1.pesel="198304051844";
        meldunek1.ulica="zalesie";
        meldunek1.numerDomu="10a";
        meldunek1.numerMieszkania=4;
        meldunek1.kodPocztowy="80-665";
        meldunek1.miejscowosc="Gdańsk";
        zamieszkanie1.ulica="zalesie";
        zamieszkanie1.numerDomu="10a";
        zamieszkanie1.numerMieszkania=4;
        zamieszkanie1.kodPocztowy="80-665";
        zamieszkanie1.miejscowosc="Gdańsk";

        BankAccount account1 = new BankAccount();//Konto bankowe ma teraz właściciela i aktualny stan gotówki. Zauważ, że dzięki agregacji i odpowiednim nazwom da się lepiej wyrazić co reprezentują poszczególne pola. We wcześniejszej wersji z polami firstName, lastName i pesel był ten problem, że konto bankowe wcale nie ma "imienia, nazwiska i peselu", ma "właściciela", a dopiero właściciel ma "imię, nazwisko i pesel".
        account1.owner=person1;
        account1.balance= 10_000;

        Credit credit1= new Credit();//Kredyt ma teraz przypisaną osobę, która pożyczyła pieniądze, kwotę pożyczki oraz kwotę zwróconą bankowi do tej pory, a także wysokość oprocentowania i ilość miesięcy na spłatę. To co ważne, to dane osoby są teraz wydzielone do osobnej klasy, więc nie powtarzają się pomiędzy klasami BankAccount i Credit.
        credit1.borower=person1;
        credit1.cashBorrowed= 2000;
        credit1.cashReturned=0;
        credit1.interestRate=0.05;
        credit1.termMonths=12;

        System.out.println("Osoba:");
        System.out.println(person1.firstName+ " "+ person1.lastName+ " " + person1.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
        System.out.println("Zameldowany w "+ meldunek1.kodPocztowy+ " "+ meldunek1.miejscowosc+" "+"ulica "+meldunek1.ulica +" "+ meldunek1.numerDomu + "/" + meldunek1.numerMieszkania);


        Person person2=new Person();
        Adres meldunek2=new Adres();
        Adres zamieszkanie2=new Adres();
        person2.firstName="Tomasz";
        person2.lastName="Kowalski";
        person2.pesel="1978554824";
        meldunek2.ulica="wrzosy";
        meldunek2.numerDomu="28";
        meldunek2.numerMieszkania=11;
        meldunek2.kodPocztowy="80-785";
        meldunek2.miejscowosc="Gdańsk";
        zamieszkanie2.ulica="zalesie";
        zamieszkanie2.numerDomu="10a";
        zamieszkanie2.numerMieszkania=4;
        zamieszkanie2.kodPocztowy="80-665";
        zamieszkanie2.miejscowosc="Gdańsk";

        BankAccount account2 = new BankAccount();
        account2.owner=person2;
        account2.balance= 125_000.54;

        System.out.println();
        System.out.println("Osoba:");
        System.out.println(person2.firstName+ " "+ person2.lastName+ " " + person2.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
        System.out.println("Zameldowany w "+ meldunek2.kodPocztowy+ " "+ meldunek2.miejscowosc+" "+"ulica "+meldunek2.ulica +" "+ meldunek2.numerDomu + "/" + meldunek2.numerMieszkania);
    }
}
