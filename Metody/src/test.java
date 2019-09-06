
public class test {
    public static void main(String[] args) {

//            int x = 5;
//            int y = 10;
//            int sum = x + y;
//            System.out.println(sum);
//
//

        calc kalkulator = new calc();
        int result1 = kalkulator.addTwoNumbers(5,10);// tutaj jest zwracany wynik po podaniu cyfr np. 5 i 10,
        //a następnie jest zapisywany do zmiennej result, abyśmy mogli go wyswietlic przez funkcje print
        int result2 = kalkulator.addTwoNumbers(20,10);
        int result3 = kalkulator.addTwoNumbers(80,10);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(kalkulator.addTwoNumbers(52,13));//możemy równiez od razu przekazac wynik do metody print, bez deklaracji zmiennej result






    }
}