package hu.nyirszikszi.gombterfogata;

public class GombTerfogata {
    private int r;

    public GombTerfogata(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getEredmeny() {
        // V=(4r^3Pi)/3
        double v = ( 4 * Math.pow((double)this.r, 3) * Math.PI ) / 3;
        return v;
    }
}