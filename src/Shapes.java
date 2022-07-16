/**
 * IShape
 */
interface IShape {
    Renderer renderer = new Renderer();

    double calculateArea();
    double calculatePerimeter();
}

class Shapes implements IShape{
    String color;

    Shapes(String color){
        this.color = color;
    }

    public double calculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }
}