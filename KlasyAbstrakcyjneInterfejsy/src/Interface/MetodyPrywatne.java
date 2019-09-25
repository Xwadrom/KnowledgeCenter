package Interface;

interface MetodyPrywatne {
    //W Javie 8 i jej wcześniejszych wersjach wszystkie metody w interfejsach były domyślnie publiczne. Od Javy 9 możliwe jest jednak definiowanie także metod prywatnych co sprawia, że stają się one jeszcze bardziej podobne do klas abstrakcyjnych. Metody prywatne mają sens z powodu wprowadzenia w Javie 8 metod domyślnych. Wyobraź sobie, że jakaś metoda domyślna ma np. 200 linijek kodu. Z punktu widzenia programisty Javy oznacza to, że raczej jest to paskudny kod i przydałoby się go podzielić na mniejsze kawałki (metody). Bez metod prywatnych nie dało się jednak tego osiągnąć i stąd ta nowość.
    default void complicatedMethod() {
        read(); //np. wczytanie czegoś z pliku
        calculate(); //wykonanie obliczeń
        save(); //zapisanie czegoś w pliku
    }

    private void read() {
        //wczytujemy
    };

    private void calculate() {
        //obliczamy
    };

    private void save() {
        //zapisujemy
    };
}

