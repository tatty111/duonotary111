public class Circle extends Shape{

    private double radius;

    public Circle() {

    }

    public Circle (double radius){
        super("green", true);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getDiameter(double diameter) {
        return diameter;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
