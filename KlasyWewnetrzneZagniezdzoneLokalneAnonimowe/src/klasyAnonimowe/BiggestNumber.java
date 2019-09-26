package klasyAnonimowe;

interface BiggestNumber {

    int takeBiggest(int[] tab);


}
//Normalnie, aby móc z niego skorzystać musielibyśmy stworzyć klasę, która implementuje interfejs BiggestNumber, np.:
//
//class BiggestNumberChooser implements BiggestNumber { ... }

//Jeżeli zamierzamy skorzystać z implementacji tego interfejsu tylko w jednym miejscu naszego kodu, to wygodniej będzie wykorzystać do tego klasę anonimową. W celu jej utworzenia wpisz BiggestNumber nazwaZmiennej = new Biggest i wciśnij Ctrl+Spacja lub sam Enter, jeśli podpowiedź zdążyła się sama pojawić. Środowisko podpowie ci, że może wygenerować szablon klasy anonimowej.
//Pozornie wygląda to tak, jakbyśmy utworzyli nowy obiekt typu BiggestNumber, ale przecież interfejsu nie można inicjalizować słowem new. W rzeczywistości pomiędzy nawiasami klamrowymi {} umieszczone jest ciało klasy, która nie posiada swojej nazwy (jest anonimowa). Ponieważ klasa ta implementuje interfejs BiggestNumber, to musi przesłaniać wszystkie metody abstrakcyjne z interfejsu, czyli te, które nie są oznaczone jako domyślne. Zwróć także uwagę na nietypowe zakończenie nawiasu klamrowego średnikiem, czego do tej pory jeszcze nie spotkaliśmy.