public class PartsShopApp {
    public static void main(String[] args) {
        Tire tire1=new Tire(34552, "Goodyear", "Ultragrip", 234234, 17, 235);
        Wheel wheel1=new Wheel(4443532, "OZ Racing", "Speed", 9999083, 17, 225);
        ExhaustPart exhaustPart1 = new ExhaustPart(1983220934, "Akropovic", "Storm", 98748234, true);

tire1.printer();
wheel1.printer();
exhaustPart1.printer();
    }
}
