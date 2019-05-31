
public class Square extends Shape implements Comparable<Shape> {
    double size;

    @Override
    public String toString() {
        return "Square: A = " + getArea();
    }

    @Override
    double getArea() {
        return size * size;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}