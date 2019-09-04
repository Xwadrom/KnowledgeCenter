public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(number);

        number +=1;//        number = number +1
        System.out.println(number);

        number++;// inkrementacja postfiksowa zwiększa o jeden dopiero w następnej lini
        System.out.println(number);

        number--;// dekrementacja postfiksowa zmniejsza o jeden dopiero w następnej lini
        System.out.println(number);

        System.out.println(++number);// inkrementacja prefiksowa najpierw zwiększa o jeden a później przekazuje do println
        System.out.println(--number);// dekrementacja prefiksowa najpierw zniejsza

        int numberAfterChange= --number;
        System.out.println(numberAfterChange);

        System.out.println(number++);// najpierw wyświetla, później zwiększa
        System.out.println(number);

        System.out.println(++number); // najpierw zwiększa, później wyświetla
        System.out.println(number);
    }

}

