public class Fruit {
    private double weight;
    private String color;




    public Fruit(double weight, String color) {

        this.weight = weight;
        this.color = color;
        System.out.println("Utworzono owoc");//Po ponownym uruchomieniu programu, pomimo iż w klasie Apple nie wykorzystujemy jawnie konstrukcji super() to widzimy, że jest on wywoływany automatycznie jako pierwsza instrukcja przy tworzeniu obiektu.
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.print(getColor() +" "+getWeight());
    }
}
