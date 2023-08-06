public class BorderDecorator implements Shape {
    private Shape decoratedShape;

    public BorderDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Drawing a border around the shape");
    }
}
