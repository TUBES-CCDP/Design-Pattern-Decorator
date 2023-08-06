// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(20, 30);

        Shape borderedCircle = new BorderDecorator(circle);
        Shape borderedRectangle = new BorderDecorator(rectangle);

        borderedCircle.draw();
        borderedRectangle.draw();
    }
}