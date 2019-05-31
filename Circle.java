
class Circle extends Shape implements Comparable<Shape> {
    double radius;

    @Override
    public String toString() {
        return "Circle: A = " + String.format("%.2f", getArea());
    }

    @Override
    double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
