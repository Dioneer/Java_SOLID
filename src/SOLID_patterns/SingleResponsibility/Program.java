package SOLID_patterns.SingleResponsibility;

public class Program {
    public static void main(String[] args) {
        /**
         * общий класс
         */
//        Square square = new Square(new Point(2,2), 8 );
//        square.showDots();
//        System.out.println(square.getArea());
//        square.draw();
        /**
         * распределенный
         */
        SquareDrawer squareDrawer = new SquareDrawer(new SquareV2(new Point(2,2), 8));
        squareDrawer.setScale(4);
        squareDrawer.draw();
    }
}
