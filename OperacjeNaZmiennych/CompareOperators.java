public class CompareOperators {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        System.out.println("Czy X jest większy od Y?");

        boolean isXGreaterThanY = x>y;//czy x większy od y
        System.out.println(isXGreaterThanY);

        boolean isXEqualY= x==y;// ==znak porównania
        System.out.println("Czy X jest równy Y");
        System.out.println(isXEqualY);

        boolean isXDifferY= x!=y;// czy różny
        System.out.println("Czy X jest różny Y");
        System.out.println(isXDifferY);
        System.out.println(!isXDifferY);// wykrzyknik ! to znak negacji, odwrotności, potrzebne w przypadku kiedy np. użytkonik podaje złą liczbę i program będzie ja wczytywał do momentu ąż poda dobrą.

        boolean instance = "Kasia" instanceof java.lang.String;// można napisać sam String
        System.out.println(instance); // "Kasia" jest typu String

    }
}
