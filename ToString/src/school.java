public class school {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        Student student2 = new Student("Jan Kowalski", 22);
        System.out.println("Lista studentów: ");
        student1.printInfo();

        String student1String = student1.toString();
        String student2String = student2.toString();

        System.out.println(student1String);
        System.out.println(student2String);
        System.out.println(student2);
        System.out.println(Integer.toHexString(student2.hashCode()));
    }

}
