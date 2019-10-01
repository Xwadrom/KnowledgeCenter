public class Pair <T,V>{

    private T type1;
    private V type2;


    public T getType1() {
        return type1;
    }

    public void setType1(T type1) {
        this.type1 = type1;
    }

    public V getType2() {
        return type2;
    }

    public void setType2(V type2) {
        this.type2 = type2;
    }



    public Pair(T type1, V type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                " " + type1 +
                ", " + type2 +
                " }";
    }
}
//Zadanie
//Zdefiniuj typ generyczny zgodny z konwencją JavaBeans o nazwie Pair (para), który przyjmuje dwa parametry typów T, V i jest w stanie przechowywać po jednej instancji każdego z nich.
//
//W klasie testowej utwórz trzy obiekty typu Pair z różnymi argumentami, zdefiniuj metodę generyczną wyświetlającą informację o dowolnej parze.
