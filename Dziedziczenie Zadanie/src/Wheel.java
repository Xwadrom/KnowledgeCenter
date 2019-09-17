public class Wheel extends Part {
    private int inches;
    private int width;

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Wheel(int inches, int width) {
        this.inches = inches;
        this.width = width;
    }

    public Wheel(int idNumber, String producer, String model, int productSeries, int inches, int width) {
        super(idNumber, producer, model, productSeries);
        this.inches = inches;
        this.width = width;
    }

    public void printer(){
        System.out.println("Producer: "+getProducer()+" Inches: " +getInches()+" Width: "+ getWidth()+" IdNumber: "+getIdNumber());
    }
}
