import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Jeżeli mamy już zdefiniowany typ, który może być serializowany, to czas przejść do faktycznego zapisu. Posłużymy się klasami FileOutputStream oraz opakowującego ten strumień ObjectOutputStream. Jest to sytuacja podobna jak przy FileWriter i BufferedWriter.

public class ObjectWriter {
    public static void main(String[]args){
        String fileName="person.obj"; //rozszerzenie pliku może być dowolne, może to być równie dobrze .txt jak i .asdf
        Person p1 = new Person("Jan","Kowalksi");//Utworzyliśmy obiekt Person, który chcemy zapisać - jest to możliwe, ponieważ klasa Person implementuje interfejs Serializable.
        try(var fs=new FileOutputStream(fileName); var os = new ObjectOutputStream(fs)){
            //Utworzyliśmy obiekt klasy FileOutputStream przekazując do konstruktora nazwę pliku. Jest to klasa stosunkowo niskopoziomowa, która pozwala na zapis plików w formie binarnej. Można ją obudować klasą ObjectOutputStream, która posiada pokaźny zestaw wygodnych metod do zapisu obiektów.
//Musimy przechwycić dwa wyjątki - najwygodniej jest to robić za pomocą bloku try-with-resources, ponieważ nie trzeba się także martwić o zamykanie strumieni.
            os.writeObject(p1);
            System.out.println("Zapisano obiekt do pliku");
        }catch(IOException e){
            System.err.println("Błąd zapisu pliku "+ fileName);
            e.printStackTrace();
        }
    }
}
