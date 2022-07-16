public class Squares extends Rectangles{

    Squares(String color, int side) {
        super(color, side, side);
    }

    @Override
    public double calculateArea() {
        return super.length * super.width;
    }    
}
