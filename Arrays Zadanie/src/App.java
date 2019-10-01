import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        PersonDatabase pd = new PersonDatabase();

        System.out.println("Początkowa długość tablicy: " + pd.persons.length);
        pd.add(new Person("Robert1", "Osuch", "83090501234"));
        pd.add(new Person("Robert2", "Osuch", "83090501234"));
        pd.add(new Person("Robert3", "Osuch", "83090501234"));
        pd.add(new Person("Robert4", "Osuch", "83090501234"));
        pd.add(new Person("Robert5", "Osuch", "83090501234"));
        pd.add(new Person("Robert6", "Osuch", "83090501234"));
        pd.add(new Person("Robert7", "Osuch", "83090501234"));

        System.out.println("Tablica przed zmianami: ");
        printDataBase(pd);
//zmiany
        pd.remove(new Person("Robert2", "Osuch", "83090501234"));
        pd.remove(pd.persons[5]);
        pd.sortNull();
        System.out.println("Tablica po zmianach: ");
        printDataBase(pd);
        System.out.println("Obiekt 4 = " + pd.get(4));
        System.out.println("Końcowa długość tablicy: " + pd.persons.length);
        size(pd);

    }

    private static void printDataBase(PersonDatabase pd) {
        for (Person tmp : pd.persons) {
            //if (tmp != null) {
            System.out.println(tmp);
            // }
        }
    }

    private static void size(PersonDatabase pd) {
        int i = 0;
        for (Person tmp : pd.persons) {
            if (tmp != null) {
                i++;
            }
        }
        System.out.println("Liczba zajętych elementów w tablicy: " + i);

    }

}
