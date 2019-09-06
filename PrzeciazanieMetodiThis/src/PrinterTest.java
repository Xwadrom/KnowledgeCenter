public class PrinterTest {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();// najpierw tworzymy obiekt z klasy NumberPrinter
        printer.printNumber(4);
        printer.printNumber(2, 7);
        printer.printNumber(9,3,6);
        printer.printNumber("ala ma kota");
    }
}
