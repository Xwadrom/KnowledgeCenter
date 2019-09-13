import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        String padded = String.format("%02d", 7);
        System.out.println("Integer number left padded with zero : " + padded);


        int[] tab1 = new int[99];
        int[] tab2 = new int[999];

        int i;
        for (i = 0; i < tab1.length; i++) {

            tab1[i] = i+1;
        }
        for (i = 0; i < tab2.length; i++) {

            tab2[i] = i + 1;
        }

        for (int tmp: tab1) {
            if (tmp < 10) {
                System.out.println("0" + tmp);
            } else
                System.out.println(tmp);

        }
    }
}
