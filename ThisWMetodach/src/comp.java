public class comp {
    public static void main(String[] args) {

        emp emp1=new emp();
        emp1.danePracownika("Jan", "Kowalski", 5000, 2000);
        emp1.salary=50100;

        emp emp2=new emp();
        emp2.danePracownika("Tomasz", "Maski", 8000, 4000);

        emp1.printTotalSalary();
        emp2.printTotalSalary();
    }
}
