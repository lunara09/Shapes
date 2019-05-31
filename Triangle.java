
class Triangle extends Shape implements Comparable<Shape> {
    double base;
    double height;

    @Override
    public String toString() {
        return "Triangle: A = " + String.format("%.2f", getArea());
    }

    @Override
    double getArea() {
        return (height * base) / 2.0;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}