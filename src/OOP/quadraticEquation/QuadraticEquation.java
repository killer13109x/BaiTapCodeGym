package OOP.quadraticEquation;

import java.text.DecimalFormat;

public class QuadraticEquation {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) return (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
        else return 0;
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) return (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
        else return 0;
    }

    public String getResult() {
        if (this.getA() != 0) {
            if (this.getDiscriminant() < 0) return "The equation has no real roots";
            else {
                if (this.getDiscriminant() == 0) return "The equation has one root " + String.valueOf(this.getRoot1());
                else
                    return "The equation has two roots " + String.valueOf(this.getRoot1()) + " and " + String.valueOf(this.getRoot2());
            }
        } else {
            return (this.getB() != 0) ? ("The equation has one root " + ((-this.getC()/this.getB())))
                    : ((this.getC() == 0) ? ("Vô số nghiệm") : ("Vô nghiệm"));
        }
    }
}
