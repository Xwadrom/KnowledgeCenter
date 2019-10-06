import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1   {
    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<>();

        ints.addFirst(2);
        ints.add(3);
        System.out.println(ints.isEmpty());
        System.out.println(ints.get(0));
        System.out.println(ints.get(1));
        System.out.println(ints.size());
        ints.removeFirst();

        for(int i = 0; i<100; i++){
            ints.add(i);
        }
        System.out.println(ints.size());

        System.out.println("Czyszczę tablice: ");
        ints.clear();
        System.out.println(ints.size());

    }
}
