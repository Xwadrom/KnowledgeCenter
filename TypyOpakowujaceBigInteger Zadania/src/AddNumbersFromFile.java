import java.io.*;
import java.math.BigInteger;

public class AddNumbersFromFile {
    public static void main(String[] args) {
        String fileName1 = "numbers.txt";
        File file1 = new File(fileName1);
        boolean fileExists1 = file1.exists();

        fileCreator(fileName1, file1, fileExists1);
        numbersFiller(fileName1);
        addFirstThreeNumbers(fileName1);
        addLastTwoNumbers(fileName1);

    }

    private static void addLastTwoNumbers(String fileName1) {
        try (var fileReader = new FileReader(fileName1); var reader = new BufferedReader(fileReader)) {
            BigInteger summary[]=new BigInteger[5];
            BigInteger sum=BigInteger.valueOf(0);
            for(int i=0;i<5;i++) {
                    summary[i] = new BigInteger(reader.readLine());
                    if (i>=3){
                    sum = summary[i].add(sum);
                    }
                }System.out.println(sum);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addFirstThreeNumbers(String fileName1) {
        try (var fileReader = new FileReader(fileName1); var reader = new BufferedReader(fileReader)) {
            int summary[]=new int[3];
            int sum = 0;
            for(int i=0;i<3;i++) {
                summary[i] = Integer.valueOf(reader.readLine());
                sum = sum + summary[i];
            }System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void numbersFiller(String fileName) {
        try(var fileWriter = new FileWriter(fileName); var writer=new BufferedWriter(fileWriter)) {
            writer.write("123");
            writer.newLine();
            writer.write("1234");
            writer.newLine();
            writer.write("12345");
            writer.newLine();
            writer.write("123456789123456789");
            writer.newLine();
            writer.write("987654321987654321");
            writer.newLine();
        }catch (IOException e){
            System.err.println("Nie udało się zapisać pliku "+ fileName);
        }
    }


    private static void fileCreator(String fileName, File file, boolean fileExists) {
        if (!fileExists) {
            try {
                file.createNewFile();
                System.out.println("Utworzono plik " + fileName);
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku z przyczyn niezależnych od aplikacji, sprawdź prawa zapisu");
                e.printStackTrace();
            }
        }
        if (fileExists) {
            System.out.println("Plik " + fileName + " istnieje lub został już utworozny.");
        }
    }
}
//Zadanie
//Napisz program, który z pliku w formie takiej jak poniżej:
//
//123
//1234
//12345
//123456789123456789
//987654321987654321
//
//zwróci wynik: dodawania trzech pierwszych liczb oraz oddzielnie wynik dodawania dwóch ostatnich liczb.
//
//Do pierwszych trzech liczb wykorzystaj typ int, a do dwóch ostatnich BigInteger.
