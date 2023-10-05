package SOLID_patterns.Liskov;

public class Birds {
    protected int fly = 10;

    public Birds(int fly) {
        this.fly = fly;
    }

    public int getFly() {
        return fly;
    }
    public void fly(){
        System.out.printf("Birds fly %d\n", fly);
    }
}
