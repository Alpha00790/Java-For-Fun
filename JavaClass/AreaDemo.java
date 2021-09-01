class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "RED";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Cylinder extends Circle {
    double height;

    public Cylinder() {
        this.height = 1.0;
    }
}
public class AreaDemo {
    
}
