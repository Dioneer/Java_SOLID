package SOLID_patterns.SingleResponsibility;

public class SquareDrawer {
    private final SquareV2 square;
    private int scale = 2;

    public void setScale(int scale) {
        this.scale = scale;
    }

    public SquareDrawer(SquareV2 square) {
        this.square = square;
    }

    public int getScale() {
        return scale;
    }

    public void draw(){
        for (int i = 0; i < square.getSide()*scale; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < square.getSide()-2; i++) {
            System.out.print("*");
            for (int j = 1; j < square.getSide()*scale-1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < square.getSide()*scale; i++) {
            System.out.print("*");
        }
    }
}
