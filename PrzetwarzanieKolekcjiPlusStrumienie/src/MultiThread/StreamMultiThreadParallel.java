package MultiThread;
import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;
//Po uruchomieniu programu z klasy StreamMultiThread przez 10 sekund na ekranie co sekundę pojawi się kolejna linia tekstu. Całość można jednak znacznie przyspieszyć przetwarzając strumień wielowątkowo. W starszych wersjach Javy byłby to mocno skomplikowane, w Javie 8 wystarczy dopisać wywołanie jednej metody parallel():

class StreamMultiThreadParallel {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints = ints.stream()
                .parallel() // przetwarzanie strumienai wielowatkowo
                .map(StreamMultiThreadParallel::incrementValue)
                .collect(Collectors.toList());
        //Alternatywą jest wywołanie na kolekcji metody parallelStream() zamiast samego stream(). Zauważ jedną ważną rzecz, że przetwarzanie danych w ten sposób nie gwarantuje nam kolejności przetwarzania obiektów, wszystko zależy od tego, który wątek dostał ile czasu procesora.
    }

    public static int incrementValue(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + x);
        return x + 1;
    }
}