import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    int x, y;
    String color;

    // Constructeur normal
    public Shape() {}

    // Constructeur de copie
    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    // Méthode abstraite clone
    public abstract Shape clone();
}

class Rectangle extends Shape {
    int width, height;

    public Rectangle() {}

    // Constructeur de copie
    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}

class Circle extends Shape {
    int radius;

    public Circle() {}

    // Constructeur de copie
    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}

class Application {
    List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);
    }

    public void businessLogic() {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape s : shapes) {
            shapesCopy.add(s.clone());
        }
    }
}
