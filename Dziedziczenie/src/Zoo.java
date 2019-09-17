public class Zoo {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setColor("Black");

        Bird bird1=new Bird();
        bird1.setColor("White");

        System.out.println("zwierzęta daja glos");
        System.out.println("kot: ");
        cat1.makeSound();

        System.out.println("Ptak");
        bird1.makeSound();
    }
}
