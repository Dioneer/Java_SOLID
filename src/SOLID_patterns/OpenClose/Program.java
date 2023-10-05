package SOLID_patterns.OpenClose;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<SumArea> shapes = new ArrayList<>();
        shapes.add(new RaghTriangle(3,2));
        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        double sumArea = 0;
        for(SumArea shape: shapes){
            sumArea+= shape.sumArea();
        }
        System.out.printf("Summ area = %.2f", sumArea);
    }
}
