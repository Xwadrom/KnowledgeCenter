import java.io.*;
import java.util.Scanner;

class CompanyApp{
    public static void main(String[] args) {
        Company company1 = new Company();
        Scanner sc1=new Scanner(System.in);
        for(int i =0; i<company1.getMaxEmployees(); i++) {
            System.out.println("Podaj imie pracownika: ");
            String firstName = sc1.nextLine();
            System.out.println("Podaj nazwisko pracownika: ");
            String lastName = sc1.nextLine();
            System.out.println("Podaj wyplate pracownika: ");
            int salary = sc1.nextInt();
            sc1.nextLine();
            company1.getEmptab()[i] = new Employee(firstName, lastName, salary);
        }
        String fileName="person.obj"; //rozszerzenie pliku może być dowolne, może to być równie dobrze .txt jak i .asdf
        try(var fs=new FileOutputStream(fileName); var os = new ObjectOutputStream(fs)){
            //Utworzyliśmy obiekt klasy FileOutputStream przekazując do konstruktora nazwę pliku. Jest to klasa stosunkowo niskopoziomowa, która pozwala na zapis plików w formie binarnej. Można ją obudować klasą ObjectOutputStream, która posiada pokaźny zestaw wygodnych metod do zapisu obiektów.
//Musimy przechwycić dwa wyjątki - najwygodniej jest to robić za pomocą bloku try-with-resources, ponieważ nie trzeba się także martwić o zamykanie strumieni.
            for(int i=0; i<company1.getMaxEmployees(); i++){
                os.writeObject(company1.getEmptab()[i]);
                System.out.println("Zapisano obiekt do pliku");
            }
        }catch(IOException e){
            System.err.println("Błąd zapisu pliku "+ fileName);
            e.printStackTrace();
        }
        }

//        String fileName="testFile.txt";
//        try(var fileWriter = new FileWriter(fileName); var writer=new BufferedWriter(fileWriter)) {
//            writer.write(company1.getEmptab()[0].getFirstName());
//            writer.newLine();
//            writer.write(company1.getEmptab()[0].getLastName());
//            writer.newLine();
//            writer.write(company1.getEmptab()[0].getSalary());
//            writer.newLine();
//        }catch (IOException e){
//            System.err.println("Nie udało się zapisać pliku "+ fileName);
//        }
//        System.out.println(company1.getEmptab()[0]);
//        System.out.println(company1.getEmptab()[1]);
//        System.out.println(company1.getEmptab()[2]);
    }

