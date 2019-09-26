package klasyLokalne;
//Dowiedziałeś się już nieco o klasach wewnętrznych oraz zagnieżdżonych, jednak okazuje się, że rodzajów klas wewnętrznych jest jeszcze więcej. Można je zagnieździć nawet w metodach i w takich sytuacjach nazywać będziemy je klasami lokalnymi. W odróżnieniu od klas wewnętrznych mają one jednak dużo więcej ograniczeń. Są one raczej niespotykane, jednak jest to jedno z zagadnień certyfikujących , więc dla samej świadomości ich istnienia wypada o tym wspomnieć.
//klasy lokalne nie mogą mieć specyfikatorów dostępu (public, private protected), nie mogą być statyczne (static). Mogą być jednak abstrakcyjne (abstract) i finalne (final), jednak nie mogą łączyć tych dwóch słów kluczowych w deklaracji
//        klasy lokalne mogą korzystać z pól klasy otaczającej, ale jeśli korzystają ze zmiennych lokalnych metody to muszą one być oznaczone jako final. Od Javy w wersji 8 możliwe jest także stosowanie zmiennych efektywnie finalnych - tzn. zmiennych, które są raz zainicjowane i nie zmieniają później swojej wartości, a w szczególności nie zmieniają swojej wartości wewnątrz klasy lokalnej.


public class Outer {
    private int x;

    public void doSometing() {
        int localVar = 5;

        class Inner {
            public void innerMethod() {
                x = 5;
                System.out.println(localVar);
            }
        }
    }

}
