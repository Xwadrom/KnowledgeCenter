public class Apple extends Fruit {
    private String type;

    public Apple(double weight, String color, String type) {
        super(weight, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printInfo() {
        System.out.print(getType()+" ");
        super.printInfo();

    }
}
