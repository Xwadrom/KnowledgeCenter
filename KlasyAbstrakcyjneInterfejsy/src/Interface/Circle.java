package Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

class Circle implements Shape{

    private double r;// promień koła
    private boolean succes=false;

    public Circle() {
        Scanner sc1 = new Scanner(System.in);
        while (!succes) {
            try {
                System.out.println("Podaj promień koła: ");
                r = sc1.nextInt();
                sc1.nextLine();
                succes = true;
            } catch (InputMismatchException ex) {
                sc1.nextLine();
                System.err.println("Promień koła może być wyrażony tylko jako liczba");
                ex.printStackTrace();
            }
        }
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {  //oblicz pole
        return Shape.PI*r*r;
    }

    @Override
    public double calculatePerimeter() {  //oblicz obwod
        return 2*Shape.PI*r;
    }
}
