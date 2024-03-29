package OdczytZPlikuDevFoundry;

public class Employee {
    private String firstName;
    private String lastName;

    private int age;

    private boolean fullTime;

    public Employee(String firstName, String lastName, int age, boolean fullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fullTime = fullTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", fullTime=" + fullTime +
                '}';
    }
}
