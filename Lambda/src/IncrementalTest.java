public class IncrementalTest {
    public static void main(String[] args) {
        Integer num = 5;
        num = increment(num, x -> x + 1);
        System.out.println(num);
    }

    public static <T> T increment(T t, IncrementalPrinter<T> ip) {
        return ip.doSomething(t);
    }
    //Metoda increment() posłuży nam do inkrementacji zmiennej typu liczbowego - jest ona maksymalnie generyczna, więc w rzeczywistości pozwala też na wiele innych rzeczy. W metodzie main() przekazaliśmy jej wartość typu Integer i wyrażenie lambda powodujące zwiększenie jej wartości o 1. Generalnie wszystko wygląda ok, ale jest to dokładnie to samo co istniejący już interfejs UnaryOperator<T> z metodą apply(), którego składania jest praktycznie identyczna z naszym interfejsem IncrementalPrinter. W praktyce zdefiniowane w Javie interfejsy funkcyjne powinny nam wystarczyć do wykonania większości operacji, więc zawsze przed zdefiniowaniem własnego interfejsu, najpierw przejrzyj te już dostępne i zobacz, czy nie ma tam takiego, który będzie ci potrzebny.
}
