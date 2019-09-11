public class ArrayTest {

    public static void main(String[] args) {
        double[][] array3x3 = new double[3][3];
        array3x3[0][0]=1.0;
        array3x3[0][1]=1.5;
        array3x3[0][2]=2.0;
        array3x3[1][0]=1.5;
        array3x3[1][1]=2.0;
        array3x3[1][2]=2.5;
        array3x3[2][0]=2.0;
        array3x3[2][1]=2.5;
        array3x3[2][2]=3.0;

        double iloczynPrzekatnej1=array3x3[0][0]*array3x3[1][1]*array3x3[2][2];
        double iloczynPrzekatnej2=array3x3[2][0]*array3x3[1][1]*array3x3[0][2];
        double sumaPrzekatnych=iloczynPrzekatnej1+iloczynPrzekatnej2;
        System.out.println(sumaPrzekatnych);

        double sumaSrodkowyWiersz=array3x3[1][0]+array3x3[1][1]+array3x3[1][2];
        double sumaSrodkowatablica=array3x3[0][1]+array3x3[1][1]+array3x3[2][1];
        double iloczyn=sumaSrodkowatablica*sumaSrodkowyWiersz;
        System.out.println(iloczyn);

        double sumaelementowkrawedzi=array3x3[0][2]+array3x3[1][2]+array3x3[2][2];
        System.out.println(sumaelementowkrawedzi);
    }
}
//Napisz program składający się z jednej klasy o dowolnej nazwie. W metodzie main zadeklaruj tablicę dwuwymiarową liczb typu double. Wypełnij ją liczbami zgodnie z poniższym rysunkiem:
//Wylicz i wyświetl na ekranie wyniki poniżej opisanych działań:
//
//Sumę iloczynów przekątnych tablicy,
//iloczyn sum środkowego wiersza i środkowej kolumny tablicy,
//sumę wszystkich elementów znajdujących się przy krawędzi tablicy.