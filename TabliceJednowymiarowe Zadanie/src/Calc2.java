public class Calc2 {

    public static void main(String[] args) {

        Method method = new Method();

        System.out.println(method.method1());
        System.out.println(method.method2());

        int[] tab1 ={3,2,1};
        int[] tab2 ={6,3,9};
        System.out.println(method.summArrays(tab1,tab2));
    }
}
//Zadanie
//Napisz program, w którym zadeklarujesz dwie tablice typu całkowitoliczbowego. Każda z nich powinna przechowywać po 3 dowolne liczby typu int. Program powinien wyświetlić sumę wszystkich liczb z obu tablic.
//
//Następnie zdefiniuj metodę, która realizuje to samo zadanie, czyli przyjmuje dwie tablice, a zwraca sumę wszystkich ich elementów.