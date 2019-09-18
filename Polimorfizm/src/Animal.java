public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void giveSound(){
       System.out.println("Jestem zwierzęciem i nazywam się: "+ getName());
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
