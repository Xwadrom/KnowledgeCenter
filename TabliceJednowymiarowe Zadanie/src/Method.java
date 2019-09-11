public class Method {

    public int method1() {
        int[] tablica1 = new int[3];
        int[] tablica2 = new int[3];

        tablica1[0] = 3;
        tablica1[1] = 4;
        tablica1[2] = 5;

        tablica2[0] = 6;
        tablica2[1] = 7;
        tablica2[2] = 8;


        return tablica1[0] + tablica1[1] + tablica1[2] + tablica2[0] + tablica2[1] + tablica2[2];
    }

    public int method2() {
        int[] tablica1 = {5, 10, 15}; //druga metoda jest krótsza, bo znamy już liczby, któe chcemy przypisać
        int[] tablica2 = {30, 40, 50};

        return tablica1[0] + tablica1[1] + tablica1[2] + tablica2[0] + tablica2[1] + tablica2[2];
    }

    public int summArrays(int[]array1,int[]array2){
        return array1[0] + array1[1] + array1[2] + array2[0] + array2[1] + array2[2];
    }
}
