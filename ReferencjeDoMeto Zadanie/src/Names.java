import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Names implements Comparable <Names>{
    private String name;

    public Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public static void main(String[] args) {

        List<Names> names = new ArrayList<>();
        names.add(new Names("Piotr"));
        names.add(new Names("daniel"));
        names.add(new Names("Adam"));
        names.add(new Names("stefan"));
        names.add(new Names("Lukasz"));

        System.out.println("Przed sorotwaniem: "+ names);

        Collections.sort(names, Names::sortAscending );
        System.out.println("Po sortowaniu: "+ names);
    }

    @Override
    public int compareTo(Names o) {
        return name.compareToIgnoreCase(o.getName());
    }
    
    private static int sortDescending(Names t1, Names t2) {
        return t2.compareTo(t1);
    }

    private static int sortAscending(Names t1, Names t2) {
        return t1.compareTo(t2);
    }

//    @Override
//    public int compare(String o1, String o2) {
//        return o1.compareToIgnoreCase(o2);
//    }

//    @Override
//    public int compareTo(String o) {
//        return String.compareToIgnoreCase(o);
//    }
}
