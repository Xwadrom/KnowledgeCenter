public class ExhaustPart extends Part {
    private boolean euro5;

    public ExhaustPart(int idNumber, String producer, String model, int productSeries, boolean euro5) {
        super(idNumber, producer, model, productSeries);
        this.euro5 = euro5;
    }
    public void printer(){
        System.out.println("Producer: "+getProducer()+" Model: "+ getModel()+ " Does have Euro5: " +isEuro5()+" IdNumber: "+getIdNumber());
    }

    public boolean isEuro5() {
        return euro5;
    }

    public void setEuro5(boolean euro5) {
        this.euro5 = euro5;
    }
}
