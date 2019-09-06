public class test2 {
    public static void main(String[] args) {
        calc test = new calc();
        test.addAndPrint(5,10);//metoda addAndPrint, która przyjmuje dwie liczby i nic nie zwraca bo jest void
        test.addAndPrint(3,54);//wyswietlanie println jest juz ukryte wewnatz tej mteody wiec po jej wywolaniu i podaniu parametrów wyswielana jest zmienna sum czyli wynik
    }
}
