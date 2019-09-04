public class LogicalOperators {

    public static void main(String[] args) {

        int x = 5;
        int y= 10;
        boolean logic = true;

        System.out.println("Czy X jest mniejsze od 0 lub Y jest większe od zera");
        System.out.println(x<0);
        System.out.println(y>0);
        System.out.println(x<0 || y>0);// alternatywa dwie pionowe kreski oznaczają lub czyli jesli chociaz jeden warunek zostanie spełniony to program zwróci wartosc true
//        || - operator alternatywy. Zwraca true, gdy co najmniej jeden z warunków jest spełniony, czyli true || false lub false || true lub true || true.
        System.out.println(x<0 && y>0);// koniunkcja, czyli dwa warunki muszą być spełnione, wtedy bedzie true
//&& - operator koniunkcji. Zwraca true tylko i wyłącznie wtedy kiedy zachodzi true && true,

        System.out.println("x>10 && y<11");
        System.out.println(x<10 && y<11);

        System.out.println("x<10 && y<10");
        System.out.println(x<10 && y<10);

        System.out.println("x<10 || y<10");
        System.out.println(x<10 || y<10);

        System.out.print(logic);
        System.out.print(",!logic=");
        System.out.println(!logic);// wykrzyknik to znak zaprzeczenia czyli zwraca false

        System.out.println("Warunek złożony !(x<10 && y<10)");
        System.out.println(!(x<10 && y<10));

    }


}