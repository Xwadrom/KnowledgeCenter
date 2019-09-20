import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Ania";
        String s2 = "Ania";
        System.out.println("s1 == s2 " + (s1 == s2));//true
        System.out.println("s1.equals(s2) " + (s1.equals(s2)));//true

        String s3 = new String("Kasia");
        String s4 = new String("Kasia");
        System.out.println("s3 == s4 " + (s3 == s4));//false
        System.out.println("s3.equals(s4) " + (s3.equals(s4)));//true

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj napis 1:");
        String str1 = sc.nextLine();
        System.out.println("Podaj napis 2:");
        String str2 = sc.nextLine();

        System.out.println("str1 == str2 " + (str1 == str2));//false
        System.out.println("str1.equals(str2) " + (str1.equals(str2)));//true
        //W takim przypadku także w pamięci powstaną dwa obiekty i porównanie przy pomocy operatora == zwróci false. W praktyce możemy dzięki temu wyciągnąć taki wniosek, że obiekty typu String zawsze należy porównywać przy pomocy metody equals().

        String hello = "Hello ";
        hello = hello + "World";
        //O tym, że obiekty typu String są niemodyfikowalne warto wiedzieć również z tego powodu, że może to nieść konsekwencje związane z wydajnością Twojej aplikacji. W przypadku, gdy Twój program odpowiedzialny jest za tworzenie bardzo dużej liczby napisów powstających z połączenia innych napisów, to nie wykorzystuj operatora konkatenacji (+). Będzie to powodowało tworzenie bardzo dużej liczby obiektów, które niekoniecznie będą ci potrzebne.
    }
}
