public class Container <T>{
    //W ostrych nawiasach na poziomie sygnatury klasy podany jest parametr <T>, który może być wykorzystywany do definicji typów zmiennych, czy tablic. W miejsce T możesz wstawić także więcej różnych parametrów, wymieniając je po przecinku, np. <T, K, V>.
//    Typami generycznymi (zwanymi też sparametryzowanymi) nazywamy takie klasy lub interfejsy, w których pewne rzeczy możemy określić dopiero podczas tworzenia obiektów danego typu lub ich rozszerzania / implementowania.

    private T[]array;//tablica typu T - czyli dowolnego typu, który podamy przy tworzeniu obiektu klasy Container.

    public T get(int index) {
        return array[index];
    }//Dodatkowo dodaliśmy metodę get(), która zwraca element z tablicy o indeksie index. Co ważne metoda ta także zwraca "coś" typu T.

    public void printObjects(){
        for(T o:array){
            System.out.println(o);
        }
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

}
