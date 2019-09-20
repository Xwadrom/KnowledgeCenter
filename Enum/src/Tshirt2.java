import java.util.Objects;

public class Tshirt2 {

    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tshirt2{" +
                "size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tshirt2 tshirt2 = (Tshirt2) o;
        return size == tshirt2.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
