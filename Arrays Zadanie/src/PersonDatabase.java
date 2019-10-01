import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class PersonDatabase {
    private static int MAX_PERSONS = 1;
    Person[] persons = new Person[MAX_PERSONS];
    int counter=0;

    public int getMAX_PERSONS() {
        return MAX_PERSONS;
    }

    public void setMAX_PERSONS(int MAX_PERSONS) {
        this.MAX_PERSONS = MAX_PERSONS;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }


    public void add(Person p) {
        persons[counter] = p;
        counter++;
        if (counter == persons.length) {
            resize(2*persons.length);
        }
    }
    public void remove(Person p){
        for(int i=0; i<persons.length; i++){
            if (persons[i]!=null) {
                if (persons[i].equals(p)) {
                    persons[i] = null;
                    }
                }
            }
        }

    public void sortNull() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                for (int j = i; j < persons.length; j++) {
//                    try{
                    if(j!=persons.length-1)
                        persons[j] = persons[j+1];
//                    }catch (ArrayIndexOutOfBoundsException ex){
//
//                    }
                }
            }
        }
    }

    public Person get(int index){
        return persons[index-1];
    }

    private void resize(int capacity) {
        Person[] copy = new Person[capacity];
        for (int i = 0; i < persons.length; i++) {
            copy[i] = persons[i];
        }persons=copy;
    }
}
