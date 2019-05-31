
class Rectangle extends Shape implements Comparable<Shape> {
    double width;
    double lenght;

    @Override
    public String toString() {
        return "Rectangle: A = " + getArea();
    }

    @Override
    double getArea() {
        return width * lenght;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
