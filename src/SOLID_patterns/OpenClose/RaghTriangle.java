package SOLID_patterns.OpenClose;

public class RaghTriangle implements Shape,SumArea{
    private int katet1;
    private int katet2;
    private double gipotenuza;
    public int getKatet1() {
        return katet1;
    }

    public RaghTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = Math.sqrt(Math.pow(katet1,2) + Math.pow(katet2,2));
    }

    public int getKatet2() {
        return katet2;
    }

    public double getGipotenuza() {
        return gipotenuza;
    }

    @Override
    public double sumArea() {
        double p = katet1+katet2+gipotenuza;
        return Math.sqrt(p*(p-katet1)*(p-katet2)*(p-gipotenuza));
    }
}
