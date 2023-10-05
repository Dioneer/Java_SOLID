package SOLID_patterns.OpenClose;

public class Square implements Shape,SumArea{
    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    private final int side;

    @Override
    public double sumArea() {
        return side*side;
    }
}
