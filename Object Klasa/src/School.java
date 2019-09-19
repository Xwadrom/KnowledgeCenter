public class School {


    public static void main(String[] args) {
        Student student1= new Student("Jan",15);
        Student student2= new Student("Jan",15);


        System.out.println("student1 == student2");
        System.out.println(student1 == student2);//porównujemy tak naprawdę ze sobą wartości 0x1E81F4DC oraz 0x4D591D15 (są to wartości zmyślone, przy każdym uruchomieniu aplikacji obiekty zostaną zapisane w innym miejscu pamięci i ich adres będzie inny).
        //Operator == porównuje więc ze sobą tylko wartość referencji, a nie porównuje tego jakie info przechowują czyli np. Jan 15.

    }
}


//class School {
//    public static void main(String[] args) {
//        Student student1 = new Student("Jan Kowalski", 22);
//        Student student2 = student1;
//        System.out.println("student1 == student2:");
//        System.out.println(student1 == student2);
//    }
//}Utworzyliśmy tylko jeden obiekt typu Student, ale wskazują na niego dwie referencje. Porównanie tych referencji poprzez == tym razem zwróci true.