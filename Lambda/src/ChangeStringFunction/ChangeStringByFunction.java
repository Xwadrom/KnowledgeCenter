package ChangeStringFunction;

import java.util.function.Function;

public class ChangeStringByFunction {
    public static void main(String[] args) {

        Function<String, String> func = text -> text.toLowerCase().trim();// funkcja przyjmuje String i zwraca String

        String original ="  WIELKI NAPIS  ";
        String lowerCaseTrim = func.apply(original);// wywołujemy funkcję przekazując jej original jako argument
        System.out.println(lowerCaseTrim);
    }
}
