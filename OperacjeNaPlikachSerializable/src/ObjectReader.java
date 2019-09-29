import java.io.*;

//Odczyt obiektów z plików jest bardzo podobny, jednak wykorzystuje się do tego obiekty FileInputStream  oraz ObjectInputStream.
public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = null;
        try (var fis = new FileInputStream(fileName); var ois = new ObjectInputStream(fis)) {
            p1 = (Person) ois.readObject();//Odczytując dane za pomocą metody readObject() otrzymujemy zawsze referencję klasy Object i dlatego wymagane jest jego rzutowanie na odpowiedni typ. Jednocześnie metoda ta generuje kontrolowany wyjątek ClassNotFoundException, który musi być obsłużony lub zadeklarowany za pomocą throws.
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }
        if (p1 != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(p1.getFirstName() + " " + p1.getLastName());//Dla potwierdzenia poprawnego wczytania danych wyświetlamy informację odwołując się poprzez gettery do pól obiektu p1.
        }
    }
}
