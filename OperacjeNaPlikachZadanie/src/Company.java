import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable{
    private static final long serialVersionUID = 54841777088226529L;

    private static int MAX_EMPLOYEES=3;
    private Employee[] emptab=new Employee[MAX_EMPLOYEES];

    public  int getMaxEmployees() {
        return MAX_EMPLOYEES;
    }

    public  void setMaxEmployees(int maxEmployees) {
        MAX_EMPLOYEES = maxEmployees;
    }

    public Employee[] getEmptab() {
        return emptab;
    }

    public void setEmptab(Employee[] emptab) {
        this.emptab = emptab;
    }
}