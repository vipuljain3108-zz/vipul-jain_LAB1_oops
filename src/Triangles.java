public class Triangles implements IShape {
    int height, base;
    final double PI = 3.14;
    String color;

    Triangles(String color, int height, int base) {
        this.color = color;
        this.height = height;
        this.base = base;
    }

    public double calculateArea() {
        return this.height * this.base;
    }

    public double calculatePerimeter() {
        return (this.height + this.base) + Math.sqrt(this.height ^ 2 + this.base ^ 2);
    }

}
