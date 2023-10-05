package SOLID_patterns.interfaceSeg;

public class CustomPay implements Payable, WebMoneyPay{
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Custom pay by phone number %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Custom pay by credit card %d\n", amount);
    }

}
