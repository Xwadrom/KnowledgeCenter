public class ifTest {
    public static void main(String[] args) {
        int a = 21;
        int b = 20;
        int c = 50;
        boolean aBiggerThanB = a>b;

        if (a>b) {
            if (a > c) {
                System.out.println("Liczba A jest większa od B i od C");
            } else
                System.out.println("Liczba A jest większa od B, ale mniejsza bądź równa od C");
        } else {
            if (a > c) {
                System.out.println("Liczba A jest większa od C, ale mniejsza bądź równa od B");
            } else

            System.out.println("Liczba A jest mniejsza od B i od C");
        }
//        if (a > b) {
////            System.out.println("Liczba A jest większa od B");
////        }
////
////        if (b > a) {
////            System.out.println("Liczba B jest większa od A");
////        }

//        if (aBiggerThanB) { //w funkcji if zawsze musi być w parametrze wartosc true lub false
//            System.out.println("Liczba A jest większa od B");
//            System.out.println("A wynosi: " + a);
//        }
//
//        else {
//            System.out.println("Liczba B jest większa od A");
//        }
    }
}