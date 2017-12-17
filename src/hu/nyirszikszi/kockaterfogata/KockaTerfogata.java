package hu.nyirszikszi.kockaterfogata;

public class KockaTerfogata {
    private int  a;

    public KockaTerfogata(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getEredmeny() {
        // V=a^3
        double v = Math.pow((double)this.a, 3);
        return v;
    }
}