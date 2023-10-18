import soluçao.Circle;
import soluçao.Rectangle;
import soluçao.Shape;
import soluçao.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
