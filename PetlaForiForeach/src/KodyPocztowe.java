public class KodyPocztowe {
    public static void main(String[] args) {
        int[] tab1 = new int[99];
        int[] tab2 = new int[999];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = i;
        }

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i;
        }


        MetodaA(tab1);
        MetodaB(tab2);
//        System.out.println(MetodaA(tab1)+MetodaB(tab2));
    }

    private static void MetodaB(int[] tab2) {

        for (int i = 0; i < tab2.length; i++) {
            if (i < 10) {
                System.out.println("00" + tab2[i]);
            } else if (i < 100 && i >= 10) {
                System.out.println("0" + tab2[i]);
            } else System.out.println(tab2[i]);
        }
    }

    private static void MetodaA(int[] tab1) {
        for(int i = 0; i < tab1.length; i++){
            if (i<10){
                System.out.println("Kod pocztowy: 0"+ tab1[i]);

            }else System.out.println("Kod pocztowy: "+ tab1[i]);
        }
    }

}