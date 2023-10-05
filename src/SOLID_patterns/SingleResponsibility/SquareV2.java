package SOLID_patterns.SingleResponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareV2 {
    private List<Point> points;
    private int side;

    public List<Point> getPoints() {
        return points;
    }

    public int getSide() {
        return side;
    }

    public SquareV2(Point point1, int side) {
        this.side = side;
        Point point2 = new Point(point1.getX()+side, point1.getY());
        Point point3 = new Point(point1.getX(), point1.getY()+side);
        Point point4 = new Point(point1.getX()+side, point1.getY()+side);
        points = new ArrayList<>(Arrays.asList(point1,point2,point3,point4));
    }
    public int getArea(){
        return side*side;
    }

    public void showDots(){
        for (Point point: points){
            System.out.println(point);
        }
    }
}
