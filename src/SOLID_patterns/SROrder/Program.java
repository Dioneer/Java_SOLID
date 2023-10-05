package SOLID_patterns.SROrder;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        order.inputFromConsole();
        order.saveToJSON();
    }
}
