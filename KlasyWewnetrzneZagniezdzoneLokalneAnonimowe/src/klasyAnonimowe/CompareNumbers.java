package klasyAnonimowe;

public class CompareNumbers {
    public static void main(String[] args) {


        BiggestNumber big1 = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] tab) {
                if(tab==null)
                    throw new NullPointerException("argument cannot be null");
                if(tab.length==0)
                    throw new IllegalArgumentException("arrays has to have at least one value");
                int biggestNumber = tab[0];
                for(int i=1; i<tab.length; i++) {
                    if(biggestNumber < tab[i]) {
                        biggestNumber = tab[i];
                    }
                }
                return biggestNumber;
            }
        };
        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};
        System.out.println("Największa z liczb to: " + big1.takeBiggest(tab));
    }
}
//W metodzie takeBiggest() sprawdzamy najpierw, czy przekazany parametr (tablica) nie jest wartością null oraz, czy zawiera chociaż 1 element. Jeśli nie, to rzucamy odpowiednio wyjątek NullPointerException lub IllegalArgumentException. Jeżeli tablica ma przynajmniej 1 element, to w dalszej części kodu do zmiennej biggestNumber przypisujemy pierwszy element tablicy, a następnie przechodzimy w pętli for przez jej wszystkie elementy. Jeżeli kolejny element jest większy od wartości przypisanej do biggestNumber, to jest ona do tej zmiennej przypisywana.
//
//Po skończonej iteracji zwracamy największą z liczb.
//
//Dzięki temu, że zaimplementowaliśmy anonimową klasę wewnętrzną, w dalszej części możemy wywoływać jej metody, czyli np. takeBiggest(), która jak widać zwraca poprawną wartość.
//Klasy anonimowe mogą być tworzone w taki sposób nie tylko na podstawie interfejsów, ale także na podstawie zwykłych i abstrakcyjnych klas.

//Klasy anonimowe nie posiadają swojej nazwy,
//mogą wykorzystywać zmienne lokalne metody, w której są zdefiniowane, ale zmienne te muszą być finalne lub efektywnie finalne (mogą być przypisane tylko raz),
//mogą korzystać ze składowych głównej klasy, w której się znajdują,
//nie mogą posiadać konstruktorów,
//mogą definiować dodatkowe pola i metody, których nie ma w interfejsie lub klasie na podstawie którego są tworzone.