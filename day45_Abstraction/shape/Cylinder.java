package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;
    static double pi=3.14;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Invalid radius");
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    @Override
    public double area() {
        return 2*pi*radius*height;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 2*pi*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "radius=" + radius +
                ", height=" + height +
                ", volume=" + volume() +
                '}';
    }
}