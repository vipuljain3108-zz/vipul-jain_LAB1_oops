public class Circles implements IShape {

    int radius;
    final double PI = 3.14;
    String color;

    Circles(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public double calculateArea() {
        return this.PI * Math.pow(this.radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * this.PI * this.radius;
    }

}
