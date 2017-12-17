package hu.nyirszikszi.teglatestterfogata;

public class TeglatestTerfogata {
    private int a;
    private int b;
    private int c;

    public TeglatestTerfogata(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getEredmeny() {
        // V=a*b*c
        double v = (double)this.a * (double)this.b * (double)this.c;
        return v;
    }
}