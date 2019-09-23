public class FizzBuzzZadanie {

    public static void main(String[] args) {

        int array[]=new int[100];

        for(int i=0; i <array.length; i++){
            array[i]=i+1;
        }

        for(int tmp: array){
            FizzBuzz(tmp);
        }
    }

    private static void FizzBuzz(int tmp) {

        if(tmp%3==0 && tmp%5==0) {
            System.out.println(tmp + " FizzBuzz");
        }else if(tmp%3==0){
            System.out.println(tmp+" Fizz");
        }else if(tmp%5==0){
            System.out.println(tmp+" Buzz");

        }

        else System.out.println(tmp);
    }
}
