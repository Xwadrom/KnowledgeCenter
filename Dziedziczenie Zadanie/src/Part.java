public class Part {

    private int idNumber;
    private String producer;
    private String model;
    private int productSeries;

    public Part() {

    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductSeries() {
        return productSeries;
    }

    public void setProductSeries(int productSeries) {
        this.productSeries = productSeries;
    }

    public Part(int idNumber, String producer, String model, int productSeries) {
        this.idNumber = idNumber;
        this.producer = producer;
        this.model = model;
        this.productSeries = productSeries;
    }



}
