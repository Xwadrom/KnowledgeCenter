package Interface;

class ShapeCalculator {
    public static void main(String[]args){
    Shape circle1=new Circle();
    Shape rectangle1=new Rectangle(10,20);

    double circleArea= circle1.calculateArea();
        System.out.println("circleArea "+circleArea);

    double circlePerimeter=circle1.calculatePerimeter();
        System.out.println("circlePerimeter "+circlePerimeter);

    double rectangleArea=rectangle1.calculateArea();
        System.out.println("rectangleArea "+rectangleArea);

    double rectanglePerimeter=rectangle1.calculatePerimeter();
        System.out.println("rectanglePerimeter "+rectanglePerimeter);

        ((Circle)circle1).getR();//rzutowanie

        //Pamiętaj jednak, że nadal masz dostęp wyłącznie do metod dostępnych w typie referencji, więc jeśli chcesz odwoływać się do metod getA(), czy getR() z klas Rectangle lub Circle, to niezbędne będzie wcześniejsze rzutowanie na konkretny typ.
        //((Circle)circle).getR();
        //((Rectangle)rect).getA();
        //Jeśli pojawia się u ciebie jednak potrzeba rzutowania, to rozważ zrezygnowanie z deklarowania zmiennej jako typu ogólniejszego (Shape) i użyj po prostu od razu typów Circle lub Rectangle.

        //Stosowanie interfejsów jako elementu wyjściowego do późniejszych definicji klas jest dobrą praktyką, ponieważ:
        //
        //pozwala na wykorzystywanie zalet polimorfizmu (np. możemy stworzyć tablicę różnych kształtów, a nie samych prostokątów),
        //umożliwia dobrą kontrolę nad "czystością kodu". Jeżeli typy definiujemy od razu jako klasy, często dochodzi do sytuacji, kiedy tworzymy w nich dodatkowe metody, które niekoniecznie się tam powinny znaleźć. Za pomocą interfejsu sami narzucamy sobie "łańcuch" tego, które metody muszą być nadpisane, dodawanie kolejnych metod do klasy będzie na nas wymuszało albo rzutowanie, albo dodanie metody do interfejsu - i wtedy zauważymy, że nie ma to sensu, bo inne klasy go implementujące wcale takiej metody nie potrzebują.
        //Interfejsy traktuj jako definiowanie kontraktów. W naszym przypadku kontrakt brzmi "każdy kształt musi mieć możliwość obliczenia pola i obwodu". Jeśli tworzysz klasę, która implementuje interfejs Shape, to klasa taka musi spełniać ten kontrakt poprzez implementowanie wszystkich metod abstrakcyjnych interfejsu. Interfejsy są użyteczne jeżeli korzystamy z polimorfizmu, same w sobie nie niosą większej wartości. Na razie raczej rzadko będziesz zauważać sens ich stosowania, ale później przy rozwijaniu dużych aplikacji pozwalają one pisać rozwiązania bardziej podatne na rozbudowę i łatwiejsze w utrzymaniu. Na prostych przykładach jest to niestety ciężko pokazać.


}
}