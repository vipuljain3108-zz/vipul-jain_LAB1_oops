public class Main {
    public static void main(String[] args) {
        Circles c1 = new Circles("red", 10);
        System.out.println(c1.calculateArea());
        c1.renderer.draw();

        Squares s1 = new Squares("blue", 4);
        System.out.println(s1.calculateArea());
        s1.renderer.draw();

        Triangles t1 = new Triangles("orange", 12, 7);
        System.out.println(t1.calculateArea());
        t1.renderer.draw();

        Rectangles r1 = new Rectangles("orange", 12, 7);
        System.out.println(r1.calculateArea());
        r1.renderer.draw();

    }
}
