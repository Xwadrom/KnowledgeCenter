public class OperatorTrojargumentowy {
   //Operator trójargumentowy (eng. ternary operator lub conditional operator) nie był jeszcze poruszany w kursie, ponieważ najczęściej stosowany jest właśnie przy wywołaniach rekurencyjnych. Można go również stosować w wielu innych miejscach, jako prosty sposób obliczania łatwych wyrażeń, jednak dla niektórych nie jest on zbyt czytelny, więc też warto stosować go z umiarem.
    //warunek? wynik_jeśli_warunek_true : wynik_jeśli_warunek_false;
    //co jest podobne do zapisu:
    //
    //if (warunek) {
    //	wynik_jeśli_warunek_true;
    //} else {
    //	wynik_jeśli_warunek_false;
    //}
   public static void main(String[] args) {
       int number = sum(5000);
       System.out.println(number);
   }

    static int sum(int n) {
        return n > 1 ? n + sum(n - 1) : n;
    }
    //Jeśli warunek n>1 prawdziwy (zwraca true) to wykona się instrukcja n+sum(n-1), natomiast jeśli zwróci false, to zwrócona zostanie wartość n. Dla wartości true nastąpi więc wywołanie rekurencyjne, a dla wartości false zostanie zwrócona konkretna wartość.

}
