package ZapisDoPlikuListDevFoundry;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static void main(String[] args) throws IOException {

        Path inputPath = Paths.get("/Users/Shark/Documents/GitHub/KnowledgeCenter/OperacjeNaPlikach/src/EmployeeData.txt");
        List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i<lines.size(); i++){
            if(lines.get(i).equals("EmployeeData")) {
                String [] fullName = lines.get(i + 1).split(",");
                int age = Integer.parseInt(lines.get(i+2));
                boolean fullTime=lines.get(i+3).equals("y");
                Employee emp = new Employee(fullName[0], fullName[1], age, fullTime);
                employees.add(emp);
            }
        }
        employees.forEach(System.out::println);

    }

}
//charset spowoduje, że Polskie znaki będą czytane
// do listy lines zapisywane są ciągi znaków. Jedna linia to jeden element w liście.