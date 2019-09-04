public class Concat { //konkatenacja
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+" "+s2;

        System.out.println(s3);

        int x =2;
        int y= 3;
        int sum = x+y;
        System.out.println(x + "+" + y +"="+ sum);// 2+3=5

        System.out.println( x+y + " to wynik sumowania");
        System.out.println("wynik sumowania to "+(x+y));// jezeli sumowanie jest na koncu to juz trzeba dodac nawiasy
        System.out.println("Prawda to w progamowaniu wartość " + true);
        System.out.println("Czy x jest większe od 0? " + (x>0));

        System.out.println(5+5+"ABC");
        System.out.println("ABC" +5+5);
    }
}
