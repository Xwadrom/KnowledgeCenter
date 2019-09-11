import org.w3c.dom.ls.LSOutput;

public class MultiDimensional {
    public static void main(String[] args) {

//wyobraź sobie, że tablicę wielowymiarową możesz stworzyć z kilku tablic już istniejących:

        String[] firstNames = {"Jan", "Tomasz", "Piotr"};
        String[] lastNames = {"Kowalski", "Olecki", "Okruch"};

        String[][] firstLast = {firstNames, lastNames};
        System.out.println(firstLast[1][2]);
//Utworzyliśmy dwie tablice typu String. Pierwsza przechowuje imiona, a druga nazwiska pewnych osób. Możemy więc zrobić jedną tablicę wielowymiarową, która pozwoli przechowywać te dane razem.
    }
}
