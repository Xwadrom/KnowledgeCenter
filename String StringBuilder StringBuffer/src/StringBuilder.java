class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i); // zaczyna od 0 i nastepnie zwieksza o 1
            builder.append(" ");// dokleja spacje po kazdej liczbie
        }
        String numbers = builder.toString();//drukuje calosc w stringu

        System.out.println(numbers); // mozna tez zapisac System.out.println(builder); bez powyzszego przypisania
    }
}
//    Podstawowe metody, które zdefiniowane są w tej klasie to:
//
//    append() - metoda w wielu przeciążonych wersjach, która jako parametr przyjmuje napisy, liczby lub obiekty i dokleja je do budowanego napisu
//    insert() - również przeciążona w wielu wersjach. Pozwala wstawić konkretny znak, wartość lub ciąg znaków do istniejącego ciągu znaków. Jako pierwszy argument podajemy index (licząc od 0), na który chcemy coś wstawić, jako drugi parametr wartość jaka ma zostać wstawiona
//    charAt() - zwraca znak w aktualnym ciągu znaków, jako parametr przyjmuje index (licząc od 0).
//    indexOf() - zwraca index w ciągu znaków, na którym występuje napis podany jako argument
//    toString() - zwraca w postaci obiektu String ciąg znaków przechowywany przez obiekt StringBuilder

//Zobaczmy jak to działa w praktyce i stwórzmy napis, który składa się z liczb od 0 do 999 rozdzielonych spacją: