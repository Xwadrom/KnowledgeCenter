public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound(){
        System.out.println("Jestem kotem i nazywam się: "+getName());//nadpisanie metody give sound z klasy Animal
    }

    public void meow(){
        System.out.println("Miaaaau");
    }
}
