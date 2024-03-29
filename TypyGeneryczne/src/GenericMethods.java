public class GenericMethods {
    //Generyczne mogą być nie tylko typy / klasy, ale również pojedyncze metody. Załóżmy dosyć abstrakcyjną sytuację, że chcemy napisać metodę, która wyświetla 5 razy przekazany argument. Nie wiemy jednak jakiego dokładnie typu wartości chcemy wyświetlić - użyjemy więc metody generycznej.

    public static void main(String[] args) {
        //Generyczne mogą być nie tylko typy / klasy, ale również pojedyncze metody. Załóżmy dosyć abstrakcyjną sytuację, że chcemy napisać metodę, która wyświetla 5 razy przekazany argument. Nie wiemy jednak jakiego dokładnie typu wartości chcemy wyświetlić - użyjemy więc metody generycznej.
        print5Times(Integer.valueOf(5));//niepotrzebnie boxujemy, metoda zrobi to automatycznie
        print5Times(2);//autoboxing, ponieważ przekazany argument musi byc obiektem w tym przypadku będzie to Integer
        print5Times("Cyrk");
    }

    public static <T> void print5Times(T argument){
        for (int i=0; i<5; i++)
            System.out.println(argument);//W metodzie main() możemy ją teraz wywołać z dowolnym typem standardowym lub zdefiniowanym przez siebie. Pamiętaj, że w powyższym przykładzie przekazując wartość 2 dochodzi do autoboxingu i w rzeczywistości przekazywany jest tam obiekt typu Integer.
    }
}
//Metoda print5Times() przyjmuje argument dowolnego typu obiektowego, a następnie wyświetla go 5 razy. Zauważ, że najpierw musieliśmy jednak zadeklarować w nawiasach ostrych w definicji metody (przed typem zwracanym), że jest to metoda generyczna.
//Kiedy wykorzystuje się typy i metody generyczne
//W praktyce z typami generycznymi będziesz spotykać się na każdym kroku przy okazji korzystania z kolekcji, które już niebawem ci przedstawię. W przypadku, gdy sam tworzysz kod, typy i metody generyczne wykorzystuj przede wszystkim tam, gdzie liczy się dla ciebie uniwersalność. Zamiast tworzyć przykładowo metodę w 10 przeciążonych wersjach różnych typów, która oprócz przyjmowania parametrów innych typów robi dokładnie to samo, możesz uzyskać ten sam efekt, definiując jedną metodę uogólnioną.