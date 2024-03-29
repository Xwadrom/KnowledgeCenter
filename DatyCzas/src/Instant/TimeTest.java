package Instant;

import java.time.Duration;
import java.time.Instant;

public class TimeTest {
    //Przykład kodu, który zmierzy ile nanosekund zajęło wykonanie pewnej czynności:
    public static void main(String[] args) {
        Instant i1=Instant.now();
        for (int i=0; i<100; i++){
            System.out.println("Miernik czasu");
        }
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1,i2);
        System.out.println("Pętla wykonała się w: "+ duration.getNano()+ " nanosekund.");
    }
}
