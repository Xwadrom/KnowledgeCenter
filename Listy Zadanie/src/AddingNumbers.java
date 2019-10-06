import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        Boolean exit = true;
        int sum = 0;

        while (exit) {
            System.out.println("Podaj liczbę, lub wpisz exit, aby wyjść i zliczyć liczby: ");
            String data = sc1.next();
            strings.add(data);
            if (data.equals("exit")) {
                exit = false;
            }
        }
        try {
            for (int i = 0; i < strings.size(); i++) {
                sum = sum + Integer.valueOf(strings.get(i));

            }
        } catch (NumberFormatException ex) {

        }
        try {
            for (String tmp : strings) {
                if(Integer.valueOf(tmp)==(strings.size()-1)){
                    System.out.print(tmp);
                }else
                System.out.print(Integer.valueOf(tmp) + " + ");
            }

        } catch (NumberFormatException ex) {

        }
        System.out.println(" = " + sum);

    }
}


