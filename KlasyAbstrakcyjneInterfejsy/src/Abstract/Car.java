package Abstract;

public class Car extends Vehicle {
    public Car() {
    }



    @Override
    public void speedUp() {
    setSpeed(getSpeed()+10);
    }
}
