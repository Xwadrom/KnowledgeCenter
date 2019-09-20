public enum Size {
    XSMALL ("Bardzo mały"), SMALL("Mały"), MEDIUM("Sredni"), LARGE("Duży"), XLARGE("Bardzo duzy");

    //Konstruktor wywołujemy definiując odpowiednie wartości, np. SMALL("Mały"). SMALL będzie w tym przypadku wartością typu Size i będzie przechowywać napis "Mały" przypisany do pola polish.

    private final String polish;

    Size(String polish) {
        this.polish=polish;
    }
    //Wygenerowałem także konstruktor, który pozwala ustawić wartość pola polish. Zwróć uwagę, że konstruktor jest prywatny, czyli możemy go wywoływać tylko wewnątrz typu Size. Jeśli nie zapiszesz przy konstruktorze słowa private, to efektywnie i tak będzie on prywatny. Wywołanie konstruktora dla typu enum wygląda trochę inaczej niż w przypadku klas, ponieważ w tym przypadku nigdy nie pojawi się operator new.

    public String getPolish() {
        return polish;
    }
//W praktyce powinniśmy więc od użytkownika wczytać napis lub liczbę i przekształcić je na wartość typu Size. Do zamiany nazwy typu String na wartość typu enum można wykorzystać metodę valueOf(), jednak zmuszanie użytkownika do podawania nazwy rozmiaru np. w postaci SMALL, czy MEDIUM jest mało naturalne. Lepiej byłoby wpisanie polskiej nazwy, np. "Mały". Jeśli chcemy coś takiego osiągnąć, to możemy zdefiniować dodatkową metodę, która dokona konwersji:
    public static Size fromDescription(String description){
        Size[] values = values ();
        for (Size size: values){
            if (size.getPolish().equals(description))
            return size;
        } return null;
    }
    //Metoda fromDescription() przyjmuje jako argument dowolny String. Następnie porównujemy, czy opis którejś z wartości XSMALL, SMALL itp. zgadza się z tą nazwą. Jeśli tak, to zwracamy tę wartość, jeśli przekazany napis nie odpowiada opisowi żadnej wartości, zwracamy null.


}
