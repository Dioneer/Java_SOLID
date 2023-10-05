package SOLID_patterns.interfaceSeg;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<PhonePay> payment = new ArrayList<>();
//        payment.add(new CustomPay());
        payment.add(new InternetPay());

        for(PhonePay payable: payment){
            payable.payPhoneNumber(2000);
            break;
        }
    }
}
