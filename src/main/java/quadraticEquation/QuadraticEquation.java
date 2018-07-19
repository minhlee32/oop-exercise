package quadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {

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
        return b * 2 - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() > 0) {
            double r1 = (-b + Math.pow(getDiscriminant(), 0.5));
            return r1;
        } else return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() > 0) {
            double r2 = (-b - Math.pow(getDiscriminant(), 0.5));
            return r2;
        } else return 0;
    }


}
