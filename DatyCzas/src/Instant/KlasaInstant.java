package Instant;

import java.time.Duration;
import java.time.Instant;

public class KlasaInstant {
    //Jeżeli potrzebna jest nam klasa do reprezentacji czasu w danej chwili, która posłuży np. do zapisania czasu utworzenia jakiegoś obiektu lub upływającego czasu, będzie to dobry wybór.
    //
    //Klasa Instant nie posiada konstruktora, jeżeli chcesz uzyskać aktualny czas powinieneś posłużyć statyczną metodą Instant.now():
    public static void main(String[] args) {
        Instant actualTime = Instant.now();
        System.out.println(actualTime);

        //Innym sposobem jest skorzystanie z metod of:
        //ofEpochMilli() - zwraca obiekt Instant na podstawie argumentu w postaci ilości milisekund, które upłynęły od początku 1970 roku,
        //ofEpochSecond() - j/w z tą różnicą, że czas jako argument podajemy w sekundach.
        Instant inst = Instant.ofEpochSecond(1545038283);
        System.out.println(inst);

        //Następnie z takiego obiektu możemy uzyskać informacje takie jak:
        //getEpochSecond() - ilość sekund, która upłynęła od początku 1970 roku,
        //getNano() - ilość nanosekund jaka upłynęła od początku aktualnej sekundy,
        //isAfter() / isBefore() - sprawdza, czy podany punkt w czasie był przed, czy po jakimś innym.
        //Klasa Instant jest szczególnie użyteczna w połączeniu z klasą Duration, która pozwala nam określić pewien okres w czasie. W tym celu obiekt klasy Duration można utworzyć wykorzystując metodę between():
        Instant i1 = Instant.now().plusSeconds(3);
        Instant i2 = Instant.now();
        Duration timeGap=Duration.between(i1,i2);
        System.out.println(timeGap);

    }
}
