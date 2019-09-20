public class Pizzeria {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        System.out.println("Pizza menu: ");


        Type[] values = Type.values();
        for (Type tmp : values) {
            System.out.println(tmp);
            System.out.println(tmp.toString1());

        }
    }
}
