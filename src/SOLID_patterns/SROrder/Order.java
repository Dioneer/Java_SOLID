package SOLID_patterns.SROrder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    public Order(){}

    public void saveToJSON(){
        String fileName = "order.json";
        try (BufferedWriter buff = new BufferedWriter(new FileWriter(fileName, false))) {
            buff.write("{\n");
            buff.write("\"clientName\":\""+clientName+"\",\n");
            buff.write("\"product\":\""+product+"\",\n");
            buff.write("\"qnt\":\""+qnt+"\",\n");
            buff.write("\"price\":\""+price+"\"\n");
            buff.write("}\n");
            buff.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price= Integer.parseInt(prompt("Price: "));
    }

}
