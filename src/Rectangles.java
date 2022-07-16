public class Rectangles implements IShape{
    
    int length, width;
    final double PI = 3.14;
    String color;


    Rectangles(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

}
