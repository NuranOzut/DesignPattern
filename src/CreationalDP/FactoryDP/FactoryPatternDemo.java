package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        circle1.draw();
//
//        Square square1 = new Square();
//        square1.draw();
//
//        Rectangle rectangle1 = new Rectangle();
//        rectangle1.draw();
//
//      //****************
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Daire");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Dikdortgen");
        shape2.draw();
    }
}
