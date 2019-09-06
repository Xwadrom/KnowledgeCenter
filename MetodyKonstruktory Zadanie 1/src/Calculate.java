public class Calculate {
    public static void main(String[] args) {

        Calculator result1= new Calculator();
        result1.addTwoNumbers(3, 2);


        Calculator result2= new Calculator();
        Double substract = result1.subsctractTwoNumbers(5,2);
        System.out.println(substract);

        Calculator result3= new Calculator();
        Double multiply = result1.subsctractTwoNumbers(10,3.5);
        System.out.println(multiply);

        Calculator result4= new Calculator();
        Double divide = result1.divideTwoNumbers(50,30);
        System.out.println(divide);
    }

}
