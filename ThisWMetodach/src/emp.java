public class emp {

    String firstName;
    String lastName;
    double salary;
    double bonus;

    void printTotalSalary(){
        double totalSalary= this.salary + this.bonus;
        String message = "wypłata plus bonus" + totalSalary;
        System.out.println(message);
    }

    void danePracownika(String firstName, String lastName, double salary, double bonus){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
        this.bonus=bonus;

    }
}
