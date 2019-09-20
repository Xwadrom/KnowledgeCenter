public class NotebookShop {
    public static void main(String[] args) {

        DataStore datastore1=new DataStore();


        datastore1.add(new Computer("IBM",41231));
        datastore1.add(new Computer("IBM",41231));
        datastore1.add(new Computer("Atari",500));
        datastore1.add(new Computer("IBM",41231));
        datastore1.add(new Computer("IBM",41231));

        datastore1.getinfo();


        System.out.println(datastore1.getNotebook()[0].equals(datastore1.getNotebook()[1]));
        System.out.println(datastore1.getNotebook()[3].equals(datastore1.getNotebook()[4]));

        Computer compToFind = new Computer ("IBM", 41231);
        int computersFound=datastore1.checkAvailability(compToFind);
        System.out.println("Liczba tych komputerów o specyfikacji: "+ compToFind+" wynosi: " + computersFound);

//        for(int i=0; i < datastore1.getComputernumber(); i++){
//            System.out.println(datastore1.getNotebook()[i].toString());
//        }
//        System.out.println(datastore1.getNotebook()[datastore1.getComputernumber()-1].toString());
//
//        System.out.println(datastore1.getComputernumber());



    }
}
//Zadanie
//        Napisz program, który symuluje sklep komputerowy specjalizujący się w sprzedaży notebooków. Stwórz trzy klasy:
//
//        Computer - klasa posiada pola producer i model - czyli informacje o producencie i modelu laptopa, przy czym model jest reprezentowany za pomocą liczby całkowitej. Zdefiniuj w niej metodę equals(), która pozwoli na zweryfikowanie, czy jest to jedyny taki egzemplarz w sklepie. Przesłoń także metodę toString(), która pozwoli uzyskać czytelną informację o danym egzemplarzu.
//        DataStore - klasa przechowuje informacje o notebookach w tablicy. Pozwala na dodanie kolejnego komputera do bazy poprzez metodę add() oraz wyświetlenie informacji o wszystkich notebookach. Powinna również istnieć metoda checkAvailability(), która jako parametr przyjmuje obiekt klasy Computer i zwraca ilość identycznych komputerów w sklepie.
//        NotebookShop - klasa z metodą main. Utwórz w niej co najmniej 5 laptopów i dodaj je do bazy sklepu. Co najmniej 2 komputery muszą być takie same. Dla powtarzającego się egzemplarza sprawdź działanie metody checkAvailability(), a na końcu wyświetl wszystkie notebooki dostępne w sklepie
//        Ograniczenia: w sklepowym magazynie jest miejsce na maksymalnie 100 komputerów.