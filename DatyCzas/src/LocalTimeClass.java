import java.time.LocalTime;

public class LocalTimeClass {
    //Jeżeli w programie potrzebujesz jednak informacji takich jak aktualna godzina, minuta, czy sekunda, to zdecydowanie bardziej użyteczna będzie klasa LocalTime. Pozwala ona nie tylko uzyskać aktualny czas, ale w wygodny sposób możemy także dowiedzieć się, która godzina będzie za 2967 sekund, albo 237 minut.
    //
    //Jeżeli potrzebujesz obiektu LocalTime możesz skorzystać podobnie jak w przypadku klasy Instant albo z metody now(), która zwróci aktualny czas, albo skorzystać z metod of(), które pozwalają podać jako kolejne argumenty godzinę, minutę, sekundę i nanosekundę, na podstawie, których utworzymy obiekt reprezentujący punkt w czasie:
    public static void main(String[] args) throws InterruptedException {

        LocalTime lt=LocalTime.now();
        LocalTime lt2=LocalTime.of(12,0,0);
//Pierwszy z obiektów reprezentuje aktualny czas (godzina, minuta, sekunda, nanosekunda), a drugi reprezentuje godzinę 12:00.

//        Tak jak w klasie Instant również tutaj znajdziemy metody takie jak isBefore() / isAfter(), a także użyteczny zestaw metod typu plus i minus, które tak jak wspomnieliśmy pozwolą przesunąć czas.
//
//        Przykładowy program, który ustawia zegarek na godzinę aktualną, a następnie co sekundę (przez 10 kolejnych sekund) wyświetla zaktualizowaną godzinę.
        LocalTime now = LocalTime.now();

        for (int i = 0; i < 10; i++) {
            System.out.println(now);
            now = now.plusSeconds(1); // nie można zpisać now.plusSeconds(1); bo biekt się nie będzie zmieniał.
            Thread.sleep(1000);
        }
//Weź pod uwagę, że obiekty wszystkich klas w Date Time API są niemodyfikowalne (tak jak String), więc konieczne jest jawne przypisanie wartości zwracanej po wywołaniu metody do jakiejś referencji. Samo wywołanie now.plusSeconds(1); nie modyfikuje obiektu now, tylko zwraca nowy obiekt.
        //Najważniejsze metody w klasie LocalTime to:
        //
        //getHour() - zwraca godzinę czasu, którą reprezentuje ten obiekt,
        //getMinute() - zwraca minutę czasu, którą reprezentuje ten obiekt,
        //getSecond() - zwraca sekundę czasu, którą reprezentuje ten obiekt.
    }
    }

