package SOLID_patterns.Liskov;

public class Duck extends Birds{
    public Duck() {
        super(15);
    }
    @Override
    public void fly(){
        System.out.printf("Duck fly %d\n", fly);
    }
}
