import java.util.Arrays;
import java.util.List;

public class StreamListV2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x -> (x%2==0 && x>5)).forEach(StreamList::accept);
    }

    private static void accept(Integer tmp) {
        tmp.compareTo(tmp);
        System.out.println(tmp);
    }
}
