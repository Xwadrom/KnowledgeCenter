public class NumberAdder {
    //Przykład 1 - sumowanie liczb z zakresu
    //Jako pierwszy przykład rekurencji możemy przedstawić metodę, która zsumuje liczby z przedziału od 1 do N. Standardowo zrobilibyśmy to za pomocą pętli np. w ten sposób:

    public static void main(String[] args) {
        int number = sum (3);
        System.out.println(number);
    }

    static int sum (int n){
        int sum = 0;
        while (n>0){
            sum=sum+n;
            n--;
        }return sum;
    }
}
