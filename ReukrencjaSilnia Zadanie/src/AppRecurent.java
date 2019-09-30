public class AppRecurent {
    public static void main(String[] args) {
        int number = factorial(5);
        System.out.println(number);
    }

    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return n;
        }
    }
}



