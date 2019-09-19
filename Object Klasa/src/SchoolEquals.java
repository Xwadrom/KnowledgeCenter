public class SchoolEquals {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", 15);
        Student student2 = new Student("Jan", 15);


        System.out.println("student1 == student2");
        System.out.println(student1 == student2);

        System.out.println("student1.equals(student2)");
        boolean studentEquals= student1.equals(student2);
        System.out.println(studentEquals);//metoda nienadpisana nadal zwróci false mimo tego ze pola Jan 15 są te same w obu przypadkach, wymagane jest jej nadpisanie w klasie Student zgodnie z zasadą algorytmu zaproponowanego przez Joshuę Blocha w książce Effective Java.
        //po nadpisaniu metody za pomocą alt+instert w kalsie Student lub np. po zaimportowaniu algorytmu joshuy Blocha, przyrównanie pól age i name bedzie teraz mozliwe.
    }
}
