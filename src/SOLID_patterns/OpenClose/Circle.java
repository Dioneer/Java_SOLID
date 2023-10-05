package SOLID_patterns.OpenClose;

public class Circle implements Shape, SumArea{
    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    private final int radius;

    @Override
    public double sumArea() {
        return 3.14*Math.pow(radius,2);
    }
}
