import java.util.Comparator;

class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
    //Jego użycie wygląda wtedy podobnie jak w przypadku klasy zagnieżdżonej:
    //
    //Arrays.sort(products, new ProductNameComparator());
}