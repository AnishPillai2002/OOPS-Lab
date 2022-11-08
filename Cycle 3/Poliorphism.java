abstract class Shape {
    abstract void numberOfSides();
}


class Rectangle extends Shape
{   // Runtime Polymorphism (Method Overriding)
    void numberOfSides() {
        System.out.println("Number of Sides of Rectangle = 4");
    }
}

class Triangle extends Shape{
    void numberOfSides() {
        System.out.println("Number of Sides of Triangle = 3");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Number of Sides of Hexagon = 6");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Hexagon h = new Hexagon();

        t.numberOfSides();
        r.numberOfSides();
        h.numberOfSides();
    }
}
