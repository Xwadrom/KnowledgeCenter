package klasyZagniezdzone;
//Klasy wewnętrzne w odróżnieniu od "zwykłych" mogą być również statyczne, nazywać będziemy je wtedy klasami zagnieżdżonymi (eng. nested class). Od standardowych klas wewnętrznych odróżnia je to, że mają one dostęp jedynie do statycznych pól klasy otaczającej. Dodatkowo jeśli klasa posiada element statyczny to sama musi zostać oznaczona jako statyczna.

public class Car {
    int fuel;

    void consumeFuel() {
        this.fuel = 5;
    }
   // Obiekt powyższej klasy zagnieżdżonej utworzymy w następujący sposób:

   // Car.Engine eng = new Car.Engine();
}

//Podsumowanie
//Klasy wewnętrzne i zagnieżdżone muszą posiadać swoją nazwę.
//Klasy wewnętrzne mają dostęp zarówno do statycznych jak i niestatycznych elementów klasy opakowującej, jednak klasy zagnieżdżone mają dostęp tylko do elementów statycznych klasy opakowującej.
//Klasy wewnętrzne i zagnieżdżone mogą być prywatne w odróżnieniu od "zwykłych" klas.
//Jeśli klasa wewnętrzna posiada co najmniej jedną składową statyczną to sama również musi być statyczna (czyli musi być klasą zagnieżdżoną). Nie dotyczy to stałych (pól oznaczonych jako static final).
//Klasa wewnętrzna może odwoływać się do wszystkich składowych klasy opakowującej, nawet jeśli te są oznaczone jako prywatne.
//W praktyce klasy zagnieżdżone są raczej niespotykane. Klasy wewnętrzne wykorzystywane są częściej, jednak w wielu sytuacjach są to tylko składowe pomocnicze podnoszące czytelność kodu lub wykorzystywane w strukturach danych, gdzie pomagają zbudować odpowiednie zależności między danymi. Oznacza to tyle, że nawet jeśli klasy wewnętrzne gdzieś są wykorzystywane, to jako użytkownicy takich klas niekoniecznie będziemy o tym wiedzieli.
