public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound(){
        System.out.println("Jestem psem i nazywam się: "+getName());//nadpisanie metody give sound z klasy Animal
    }

    public void bark(){
        System.out.println("Hau Hau!");
    }
   }
