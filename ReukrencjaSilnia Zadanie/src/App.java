public class App {
    public static void main(String[] args) {
        int number = factorial(4);
        System.out.println(number);
    }

    static int factorial(int n){
        int multiply = 1;
        while (n>1){
            multiply=multiply*n;
            n--;
        }return multiply;
    }
    }

