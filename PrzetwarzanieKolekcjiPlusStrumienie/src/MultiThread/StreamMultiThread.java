package MultiThread;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMultiThread {
    //Programowanie wielowątkowe przynosi korzyści zarówno na procesorach jedno jak i wielordzeniowych, ponieważ niezależnie od naszej architektury sprzętowej każdy proces otrzymuje co chwilę krótki przydział procesora - w przypadku aplikacji wielowątkowej na procesorze z pojedynczym rdzeniem, aplikacja otrzyma więc więcej przydziałów i zdąży wykonać więcej obliczeń.
    //Standardowo kolekcje w Javie do 7 włącznie nie dostarczały mechanizmów do przetwarzania i obliczeń wielowątkowych, jednak wraz z wprowadzeniem strumieni jest to już możliwe. Przydatne będzie szczególnie wtedy, gdy na każdym elemencie obiektu kolekcji będziemy wywoływać czasochłonną metodę, taką jak odczyt/zapis do zewnętrznej bazy danych, czy odczyt danych z internetu.
    //W celu zobrazowania korzyści napiszmy metodę, która będzie symulowała wykonywanie pewnych obliczeń przez czas 1 sekundy. W tym celu zastosujmy wykorzystywaną już wcześniej metodę Thread.sleep(), która usypia aktualnie wykonywany wątek na czas wskazany jako parametr metody.
//   W celu zobrazowania korzyści napiszmy metodę, która będzie symulowała wykonywanie pewnych obliczeń przez czas 1 sekundy. W tym celu zastosujmy wykorzystywaną już wcześniej metodę Thread.sleep(), która usypia aktualnie wykonywany wątek na czas wskazany jako parametr metody.
//
//Aplikacja z przetwarzaniem elementów strumieniowo w 1 wątku wyglądałaby następująco:
    public static void main(String[] args) {
List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
ints = ints.stream()
        .map(StreamMultiThread::incrementValue)
        .peek(x-> System.out.println("Wynik metody = " + x))
        .collect(Collectors.toList());
    }

    private static int incrementValue(int x) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + x);
        return x+1;
    }
}
