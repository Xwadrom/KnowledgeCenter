public class CalcTest {
    public static void main(String[] args) {
        Calc calc= new Calc();
        double addResult= calc.add(10,15);
        System.out.println(addResult);

        calc.addAndPrint(5, 3);
    }

}
