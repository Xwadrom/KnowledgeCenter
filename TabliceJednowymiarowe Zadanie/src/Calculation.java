public class Calculation {
    public static void main(String[] args) {

        int[] tablica1 = new int[3];
        int[] tablica2 = new int[3];

        tablica1[0]=3;
        tablica1[1]=4;
        tablica1[2]=5;

        tablica2[0]=6;
        tablica2[1]=7;
        tablica2[2]=8;

        int sum=tablica1[0]+tablica1[1]+tablica1[2]+tablica2[0]+tablica2[1]+tablica2[2];

        System.out.println(sum);
    }
}
//rozwiązanie bez metody