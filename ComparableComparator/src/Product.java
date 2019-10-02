public class Product implements Comparable <Product> {
    //Jeżeli zależy nam jedynie na tym, aby był ustalony jeden, naturalny porządek elementów i nie potrzebujemy sortowania według kilku różnych kryteriów, np. rosnąco, malejąco, po imieniu lub po nazwisku itp., to najlepszym rozwiązaniem będzie zaimplementować przez klasę interfejsu Comparable.
    private String producer;
    private String name;
    private String category;

    public Product(String producer, String name, String category) {
        this.producer = producer;
        this.name = name;
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [category=" + category + ", producer=" + producer + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Product p) {
        int categoryCompare = category.compareTo(p.getCategory());
        if (categoryCompare!=0){
            return categoryCompare;
        }
        int producerCompare=producer.compareTo(p.getProducer());
        if(producerCompare!=0){
            return producerCompare;
        }
        return name.compareTo(p.getName());
    }
    //Porównujemy po kolei każde kolejne pole. Ponieważ wszystkie są typu String, to nie możemy ich porównać po prostu operatorem większe mniejsze. Musimy wykorzystać metodę compareTo() zdefiniowaną w klasie String, która porównuje napisy na podstawie ich kodów kolejnych znaków. Jest to porównywanie prawie w porządku alfabetycznym o ile nie używamy polskich znaków diakrytycznych. Przykładowo:
    //int compareTo1 = "abc".compareTo("xyz"); // -23
    //int compareTo2 = "xyz".compareTo("abc"); // 23
    //int compareTo3 = "xyz".compareTo("xyz"); // 0
    //Jeżeli porównanie kategorii zwróci 0 to przechodzimy do porównywania producentów. Jeżeli wynik jest różny od 0, to zwracamy wynik tego porównania, a jeśli nie to porównujemy jeszcze nazwy produktów.

}
