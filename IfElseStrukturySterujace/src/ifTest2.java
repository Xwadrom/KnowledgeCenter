public class ifTest2 {
    public static void main(String[] args) {
        int a = 40;
        boolean aPositive = a > 0;
        boolean aEven = a % 2 == 0;

        if (a > 0 && a % 2 == 0){
            System.out.println("A jest liczbą parzystą i dodatnią");
        }
//    if (aPositive && aEven){
//        System.out.println("A jest liczbą parzystą i dodatnią");
//    }

    }
}
