package quadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {

        return b;
    }

    public double getC() {

        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double r1;
        if (getDiscriminant() == 0) {
            r1 = Math.pow(a, 0.5);
        }else r1 = (-b + Math.pow(getDiscriminant(), 0.5))/(2*a);
        return r1;
    }

    public double getRoot2() {
        double r2;
        if (getDiscriminant() == 0) {
            r2 = Math.pow(a, 0.5);
        }else r2 = (-b - Math.pow(getDiscriminant(), 0.5))/(2*a);
        return r2;
    }



}
