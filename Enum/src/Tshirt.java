public class Tshirt {

    public static final int SMALL = 1;
    public static final int MEDIUM = 2;
    public static final int LARGE = 3;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size >= SMALL && size <= LARGE)
            this.size = size;
        else
            System.out.println("Niezdefiniowany rozmiar");
    }
}
