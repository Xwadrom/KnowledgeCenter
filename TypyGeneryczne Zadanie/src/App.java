public class App {
    public static void main(String[] args) {
        Pair<Integer, Double> pair1 = new Pair<>(5, 4.0);
        Pair<String, Integer> pair2 = new Pair<>("kotek", 4);
        Pair<String, String> pair3 = new Pair<>("Robert", "Osuch");//Zgodnie z treścią zadania utworzyliśmy w metodzie main() trzy pary różnych typów. Zauważ, że przy tworzeniu obiektu za pomocą operatora new skorzystalem z zapisu <> bez podawania parametrów. Od Javy 7 w sytuacji, w której kompilator jest w stanie stwierdzić jakiego typu parametry powinien posiadać obiekt, możemy skorzystać z takiej uproszczonej formy - nazywa się ją operatorem diamentu (eng. diamond operator).

        Print(pair1);
        Print(pair2);
        Print(pair3);
        printPair2(pair3);

    }

    private static <T> void Print(T argument) {
        System.out.println(argument);
    }
    static <T, V> void printPair2(Pair<T, V> pair) {
        System.out.println("<" + pair.getType1() + " ; " + pair.getType2() + ">");
    }


}
